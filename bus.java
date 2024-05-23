package vehicles_ops;

public class bus extends Master {
	private int Cap;

	public bus(int engine, int model, String color, int cap) {
		super(engine, model, color);
		Cap = cap;
	}

	@Override
	public String toString() {
		return "bus [Cap=" + Cap + ", toString()=" + super.toString() + "]";
	}
	

}
