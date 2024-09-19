package parrot;

public class Parrot {
	public static Parrot createParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
		return switch (type) {
			case EUROPEAN -> new EuropeanParrot();
			case AFRICAN -> new AfricanParrot(numberOfCoconuts);
			case NORWEGIAN_BLUE -> new NorwegianBlueParrot(voltage, isNailed);
		};
	}

	public double getSpeed() {
		throw new IllegalStateException();
	}

	double getBaseSpeed() {
		return 12.0;
	}

	public String getCry() {
		throw new IllegalStateException();
	}
}
