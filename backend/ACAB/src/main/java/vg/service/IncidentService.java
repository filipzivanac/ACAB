package vg.service;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vg.model.Incident;

@Service
public class IncidentService {
	
	@Autowired
	private KieSession session;
	
	public Incident getIncident(Incident i) {
		session.insert(i);
		session.fireAllRules();
		return i;
	}
	
}
