package vg.model;

public enum WeaponType {
	NONE(0.1), BLUNT(0.5), SHARP(1), FIREARM(2);
	
	public final double coef;

    private WeaponType(double coef) {
        this.coef = coef;
    }
}
