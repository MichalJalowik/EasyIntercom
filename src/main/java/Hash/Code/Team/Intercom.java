package Hash.Code.Team;

import java.util.HashSet;
import java.util.Set;

public class Intercom {

	private Set<Inhabitant> inhabitants = new HashSet<Inhabitant>();
	
	public Intercom() {}

	public Intercom(Set<Inhabitant> inhabitants) {
		this.setInhabitants(inhabitants);
	}

	void addInhabitant(Inhabitant inhabitant) {
		this.inhabitants.add(inhabitant);
	}

	boolean open(int flatNumber) {
		for (Inhabitant inhabitant : this.getInhabitants()) {
			if (inhabitant.getFlatNumber() == flatNumber) {
				return inhabitant.okForEntry();
			}
		}
		return false;
	}

	boolean open(int flatNumber, int pinCode) {
		for (Inhabitant inhabitant : this.getInhabitants()) {
			if ((inhabitant.getFlatNumber() == flatNumber) && (inhabitant.getPinCode() == pinCode)) {
				return true;
			}
		}
		return false;
	}

	public Set<Inhabitant> getInhabitants() {
		return inhabitants;
	}

	public void setInhabitants(Set<Inhabitant> inhabitants) {
		this.inhabitants = inhabitants;
	}
}
