package vg.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import vg.dto.IncidentDTO;
import vg.model.Incident;
import vg.model.PastIncident;
import vg.model.PastIncidents;
import vg.model.ResponseLimiters;

@Service
public class IncidentService {
	
	@Autowired
	private KieSession session;
	
	
	
	public Incident getIncident(IncidentDTO i) {
		Incident inc = new Incident(i);
		PastIncidents pasts = null;
		ResponseLimiters li = new ResponseLimiters();
		pasts = loadPastIncidents();
		
		for(PastIncident past :pasts.getIncidents()) {
			session.insert(past);
		}
		session.insert(li);
		session.insert(inc);
		session.fireAllRules();
		System.out.println(li.getPresenceMaximum() + " " + li.getLethalForceMinimum()+" "+ inc.getEscalation());
		return inc;
	}
	
	private PastIncidents loadPastIncidents(){
		ObjectMapper mapper = new ObjectMapper();
		
		//ArrayList<PastIncident> incidents = null;
		PastIncidents pi = null;
		try {
			pi = mapper.readValue(new File("src/main/resources/Incidents.json"), PastIncidents.class);
		    //System.out.println(pi);
		} catch (IOException e) {
		    e.printStackTrace();
		}
		return pi;
	}
	
}
