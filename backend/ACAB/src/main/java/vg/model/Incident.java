package vg.model;

public class Incident {
	private int cops;
	private int criminals;
	private WeaponType weapon;
	private PoliceResponseType allreadyUsedPoliceResponse;
	private Boolean threat;
	
	public Incident() {
		super();
	}
	public int getCops() {
		return cops;
	}
	public void setCops(int cops) {
		this.cops = cops;
	}
	public int getCriminals() {
		return criminals;
	}
	public void setCriminals(int criminals) {
		this.criminals = criminals;
	}
	public WeaponType getWeapon() {
		return weapon;
	}
	public void setWeapon(WeaponType weapon) {
		this.weapon = weapon;
	}
	public PoliceResponseType getAllreadyUsedPoliceResponse() {
		return allreadyUsedPoliceResponse;
	}
	public void setAllreadyUsedPoliceResponse(PoliceResponseType allreadyUsedPoliceResponse) {
		this.allreadyUsedPoliceResponse = allreadyUsedPoliceResponse;
	}
	public Boolean getThreat() {
		return threat;
	}
	public void setThreat(Boolean threat) {
		this.threat = threat;
	}
	
	
}
