package vg.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Incident {
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
}
