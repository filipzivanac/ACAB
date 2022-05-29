package vg.model;

public enum PoliceResponseType {
	PRESENCE(0.0), VERBALIZATION(20.0), EMPTY_HAND_CONTROL(40.0), LESS_LETHAL_METHODS(60.0), LETHAL_FORCE(80.0);
	public final double limit;

    private PoliceResponseType(double limit) {
        this.limit = limit;
    }
}
