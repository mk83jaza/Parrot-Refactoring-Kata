package parrot;

public class NorwegianBlueParrot extends Parrot {
	private final double voltage;

	public NorwegianBlueParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
		super(type, numberOfCoconuts, voltage, isNailed);
		this.voltage = voltage;
	}

	@Override
	public String getCry() {
		return this.voltage > 0 ? "Bzzzzzz" : "...";
	}
}
