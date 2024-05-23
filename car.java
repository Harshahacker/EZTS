package vehicles_ops;

public class car extends Master {
	private int Speed;

	public car(int engine, int model, String color, int speed) {
		super(engine, model, color);
		Speed = speed;
	}

	@Override
	public String toString() {
		return "car [Speed=" + Speed + ", toString()=" + super.toString() + "]";
	}
	

}
