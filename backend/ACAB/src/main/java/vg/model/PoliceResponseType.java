package vg.model;

public enum PoliceResponseType {
	PRESENCE(20.0), VERBALIZATION(40.0), EMPTY_HAND_CONTROL(60.0), LESS_LETHAL_METHODS(80.0), LETHAL_FORCE(100.0);
	public final double limit;

    private PoliceResponseType(double limit) {
        this.limit = limit;
    }
}
