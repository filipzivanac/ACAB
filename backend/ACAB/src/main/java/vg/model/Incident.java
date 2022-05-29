package vg.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vg.dto.IncidentDTO;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Incident {
	public Incident(IncidentDTO i) {
		cops = i.getCops();
		criminals = i.getCriminals();
		weapon = i.getWeapon();
		allreadyUsedPoliceResponse = i.getAllreadyUsedPoliceResponse();
		suspectThreatForLife = null;
		suspectThreatForSafety = null;
		suspectThreatIntention = i.getSuspectThreatIntention();
		response = null;
		cooperates = null;
		responseWorked = i.getResponseWorked();
    }


    private int cops;
	private int criminals;
	private WeaponType weapon;
	private PoliceResponseType allreadyUsedPoliceResponse;
	private Boolean suspectThreatForLife;
	private Boolean suspectThreatForSafety;
	private Boolean suspectThreatIntention;
	private PoliceResponseType response;
	private Boolean cooperates;
	private Boolean responseWorked;
	private Double escalation;
}
