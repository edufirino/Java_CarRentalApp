public enum Operations {
	LIST_ALL_STAFF(1, "List all staff"), LIST_STAFF_BY_CATEGORY(2, "List staff by categories"),
	LIST_STAFF_BY_TASK(3, "List all Admin staff performing a certain task"),
	SEARCH_STAFF_BY_NAME(4, "Search for a specific member of staff by name"),
	LIST_ALL_CUSTOMERS(5, "List all customers"), SEARCH_CUSTOMER_BY_NAME(6, "Search for a specific customer by name"),
	LIST_ALL_CARS(7, "List all cars"), LIST_CARS_BY_TYPE(8, "List cars by type"),
	SEARCH_CAR_BY_REG(9, "Search for a specific car by registration number"),
	FIND_CAR_BY_CUSTOMER(10, "Find the car that a specific customer has rented"),

	EXIT(0, "Exit");

	private final Object[] values;

	Operations(Object... vals) {
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