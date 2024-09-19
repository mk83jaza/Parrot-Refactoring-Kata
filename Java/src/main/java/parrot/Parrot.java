package parrot;

public class Parrot {

	private final ParrotTypeEnum type;
	private final int numberOfCoconuts;
	private final double voltage;
	private final boolean isNailed;

	public static Parrot createParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
		return switch (type) {
			case EUROPEAN -> new EuropeanParrot(type, numberOfCoconuts, voltage, isNailed);
			case AFRICAN -> new AfricanParrot(type, numberOfCoconuts, voltage, isNailed);
			case NORWEGIAN_BLUE -> new NorwegianBlueParrot(type, numberOfCoconuts, voltage, isNailed);
		};
	}

	public Parrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
		this.type = type;
		this.numberOfCoconuts = numberOfCoconuts;
		this.voltage = voltage;
		this.isNailed = isNailed;
	}

	public double getSpeed() {
		return switch (type) {
			case EUROPEAN -> getBaseSpeed();
			case AFRICAN -> Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
			case NORWEGIAN_BLUE -> (isNailed) ? 0 : getBaseSpeed(voltage);
		};
	}

	private double getBaseSpeed(double voltage) {
		return Math.min(24.0, voltage * getBaseSpeed());
	}

	private double getLoadFactor() {
		return 9.0;
	}

	private double getBaseSpeed() {
		return 12.0;
	}

	public String getCry() {
		throw new IllegalStateException();
	}
}
