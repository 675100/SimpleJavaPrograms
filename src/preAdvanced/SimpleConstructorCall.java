package preAdvanced;

/**
 * 
 * @author Venkat
 *
 */
public class SimpleConstructorCall {

	public SimpleConstructorCall() 
	{
		/*
		 * Constructor will be called when an object has created.
		 * No Need to call Explicitly
		 * Constructor does not have any return type
		 */
		System.out.println("Cursor is in Constuctor loop !!");
	}
	
	void simpleMethod()
	{
		System.out.println("This is sample Method !!");
	}

	public static void main(String[] args) {
		SimpleConstructorCall sim = new SimpleConstructorCall();
		sim.simpleMethod();
	}
}
