package vehicles_ops;

public class bike extends Master{
	
   private String Type;

public bike(int engine, int model, String color, String type) {
	super(engine, model, color);
	Type = type;
}

@Override
public String toString() {
	return "bike [Type=" + Type + ", toString()=" + super.toString() + "]";
}
   
 
}
