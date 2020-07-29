package model.staff;

public enum Tasks {
	PHONE_CALL(1, "Making Phone Calls"), FIX_KEYBOARD(2, "Fixing broken keyboards"),
	GET_RICH(3, "Getting even richer $$$");

	private final Object[] values;

	Tasks(Object... vals) {
		values = vals;
	}

	public int INT() {
		return (int) values[0];
	}

	public String VAL() {
		return (String) values[0].toString();
	}

	public String DES() {
		return (String) values[1];
	}
}