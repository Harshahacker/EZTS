package vehicles_ops;

public class Master {
        private int Engine;
        private int Model;
        private String Color;
	    public Master(int engine, int model, String color) {
		super();
		Engine = engine;
		Model = model;
		Color = color;
	}
	@Override
	public String toString() {
		return "Master [Engine=" + Engine + ", Model=" + Model + ", Color=" + Color + "]";
	}
	public int getEngine() {
		return Engine;
	}
	public void setEngine(int engine) {
		Engine = engine;
	}
	public int getModel() {
		return Model;
	}
	public void setModel(int model) {
		Model = model;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	} 
      
}
