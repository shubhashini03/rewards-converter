
public class RewardValue {
	public static final double CONVERSION_RATE = 0.0035d;
	private double cashvalue;
	public double miles;

	public RewardValue(double cash) {
		this.cashvalue = cash;
	}

	public RewardValue(long miles) {
		this.miles = miles;
	}

	public double getCashValue() {
		return (miles * CONVERSION_RATE);

	}

	public int getMilesValue() {
		return (int) (cashvalue/CONVERSION_RATE);
	}
}
