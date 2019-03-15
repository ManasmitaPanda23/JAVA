package containment2;

public class Address {
	String State;
	String City;
	String Pincode;
	String Line;

	public Address() {

	}

	public Address(String State, String city, String Pincode, String Line, String City) {
		this.State = State;
		this.City = City;
		this.Pincode = Pincode;
		this.Line = Line;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getPincode() {
		return Pincode;
	}

	public void setPincode(String pincode) {
		Pincode = pincode;
	}

	public String getLine() {
		return Line;
	}

	public void setLine(String line) {
		Line = line;
	}

	public void printAddress() {
		System.out.println(Line + "," + City + "," + State + "," + Pincode);
	}

}
