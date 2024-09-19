package parrot;

public class AfricanParrot extends Parrot {
	private final int numberOfCoconuts;

	public AfricanParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
		super(type, numberOfCoconuts, voltage, isNailed);
		this.numberOfCoconuts = numberOfCoconuts;
	}

	@Override
	public double getSpeed() {
		return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
	}

	private double getLoadFactor() {
		return 9.0;
	}

	@Override
	public String getCry() {
		return "Sqaark!";
	}
}
