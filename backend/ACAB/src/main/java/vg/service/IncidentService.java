package vg.service;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vg.dto.IncidentDTO;
import vg.model.Incident;

@Service
public class IncidentService {
	
	@Autowired
	private KieSession session;
	
	public Incident getIncident(IncidentDTO i) {
		Incident inc = new Incident(i);
		session.insert(inc);
		session.fireAllRules();
		return inc;
	}
	
}
