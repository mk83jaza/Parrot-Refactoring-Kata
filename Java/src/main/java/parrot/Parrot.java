package parrot;

public abstract class Parrot {
	public static Parrot createParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
		return switch (type) {
			case EUROPEAN -> new EuropeanParrot();
			case AFRICAN -> new AfricanParrot(numberOfCoconuts);
			case NORWEGIAN_BLUE -> new NorwegianBlueParrot(voltage, isNailed);
		};
	}

	public abstract double getSpeed();

	public abstract String getCry();

	double getBaseSpeed() {
		return 12.0;
	}
}
