package procthree;

import java.util.Date;

public class ImmutableClassDemo {
	public static void main(String[] args) {
		Date date = new Date();
		ImmutableClass immutable = new ImmutableClass(1, "Immutable Object", date);

		System.out.println("ID: " + immutable.getId());
		System.out.println("Name: " + immutable.getName());
		System.out.println("Date: " + immutable.getDate());

		// Attempt to modify the date
		date.setTime(1000000000L);
		System.out.println("Modified Date: " + immutable.getDate()); // Still prints the original date

		// Attempt to modify the date returned by the getter
		immutable.getDate().setTime(2000000000L);
		System.out.println("Modified Date: " + immutable.getDate()); // Still prints the original date
	}
}

final class ImmutableClass {
	private final int id;
	private final String name;
	private final Date date;

	public ImmutableClass(int id, String name, Date date) {
		this.id = id;
		this.name = name;
		// Create a new Date object to ensure immutability
		this.date = new Date(date.getTime());
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	// Return a new Date object to ensure immutability
	public Date getDate() {
		return new Date(date.getTime());
	}
}
