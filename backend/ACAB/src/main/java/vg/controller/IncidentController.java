package vg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import vg.dto.IncidentDTO;
import vg.model.Incident;
import vg.model.PoliceResponseType;
import vg.service.IncidentService;

@RestController
public class IncidentController {
	
	@Autowired
	private IncidentService service;
	
	@PostMapping("/getResponse")
	public ResponseEntity<PoliceResponseType> getResponse(@RequestBody IncidentDTO incident){
		Incident i = service.getIncident(incident);
		return new ResponseEntity<PoliceResponseType>(i.getResponse(), HttpStatus.OK);
	}
}
