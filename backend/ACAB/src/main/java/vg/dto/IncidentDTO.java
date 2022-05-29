package vg.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vg.model.PoliceResponseType;
import vg.model.WeaponType;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class IncidentDTO {
    private int cops;
	private int criminals;
	private WeaponType weapon;
	private PoliceResponseType allreadyUsedPoliceResponse;
	private Boolean suspectThreatIntention;
	private Boolean responseWorked;
}
