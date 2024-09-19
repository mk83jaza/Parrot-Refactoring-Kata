package parrot;

public class EuropeanParrot extends Parrot {
	@Override
	public double getSpeed() {
		return getBaseSpeed();
	}

	@Override
	public String getCry() {
		return "Sqoork!";
	}
}
