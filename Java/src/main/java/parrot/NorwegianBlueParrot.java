package parrot;

public class NorwegianBlueParrot extends Parrot {
	private final double voltage;
	private final boolean isNailed;

	public NorwegianBlueParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
		super(type, numberOfCoconuts, voltage, isNailed);
		this.voltage = voltage;
		this.isNailed = isNailed;
	}

	@Override
	public double getSpeed() {
		return (isNailed) ? 0 : getBaseSpeed(voltage);
	}

	private double getBaseSpeed(double voltage) {
		return Math.min(24.0, voltage * getBaseSpeed());
	}

	@Override
	public String getCry() {
		return this.voltage > 0 ? "Bzzzzzz" : "...";
	}
}
