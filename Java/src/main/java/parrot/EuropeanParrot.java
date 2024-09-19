package parrot;

public class EuropeanParrot extends Parrot {
	public EuropeanParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
		super(type, numberOfCoconuts, voltage, isNailed);
	}

	@Override
	public double getSpeed() {
		return getBaseSpeed();
	}

	private double getBaseSpeed() {
		return 12.0;
	}

	@Override
	public String getCry() {
		return "Sqoork!";
	}
}
