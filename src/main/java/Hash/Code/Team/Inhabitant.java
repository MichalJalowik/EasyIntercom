package Hash.Code.Team;

import java.util.Random;

public class Inhabitant {

	private int flatNumber;
	private int pinCode;

	public Inhabitant(int flatNumber, int pinCode) {
		this.flatNumber = flatNumber;
		this.pinCode = pinCode;
	}

	public int getFlatNumber() {
		return flatNumber;
	}

	public void setFlatNumber(int flatNumber) {
		this.flatNumber = flatNumber;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	boolean okForEntry() {
		Random random = new Random();
		return random.nextBoolean();
	}
}
