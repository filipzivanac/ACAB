package vg.model;

public enum WeaponType {
	NONE(1.0), BLUNT(1.3), SHARP(1.9), FIREARM(2.3);
	
	public final double coef;

    private WeaponType(double coef) {
        this.coef = coef;
    }
}
