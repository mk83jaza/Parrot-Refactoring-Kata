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
			case EUROPEAN, NORWEGIAN_BLUE -> throw new IllegalStateException();
			case AFRICAN -> Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
		};
	}

	private double getLoadFactor() {
		return 9.0;
	}

	double getBaseSpeed() {
		return 12.0;
	}

	public String getCry() {
		throw new IllegalStateException();
	}
}
