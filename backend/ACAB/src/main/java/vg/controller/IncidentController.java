package vg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import vg.model.Incident;
import vg.service.IncidentService;

@RestController
public class IncidentController {
	
	@Autowired
	private IncidentService service;
	
	@PostMapping("/getResponse")
	public ResponseEntity<Incident> getResponse(@RequestBody Incident incident){
		Incident i = service.getIncident(incident);
		return new ResponseEntity<Incident>(i, HttpStatus.OK);
	}
}
