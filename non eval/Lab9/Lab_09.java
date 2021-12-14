public class Lab_09 
{
	public static void main(String[] args)
	{
		Instrument obj1=new ElectricGuitar();
		myAssert("Anonymous Player playing Electric Guitar",obj1.play());
		myAssert("Electric Guitar with number of strings=0",obj1.toString());
		
		Instrument obj2=new ElectricGuitar("Player1",3);
		myAssert("Player1 playing Electric Guitar",obj2.play());
		myAssert("Electric Guitar with number of strings=3",obj2.toString());
		
	}
	
	 /**
	  * A simple assert that checks if the two strings are equal and prints the appropriate message.
	  *
	  * @param expected The expected value
	  * @param actual The actual value
	  */
	 private static void myAssert(String expected, String actual)
		{
			   if (expected.equals(actual)) print("PASS");
			   else print("ERROR! expected: " + expected + ", actual: " + actual);
		}

	 /**
	  * Prints the given string on System.out.
	  *
	  * @param stringToPrint string to print
	  */
 
	private static void print(String stringToPrint) 
	 {
			   System.out.println(stringToPrint);
	 }


}

abstract class Instrument {
	public String name;
	public Instrument(String n) {
		name=n;
	}
	public abstract String play();
}

abstract class StringedInstrument extends Instrument {
	public int numberOfStrings;
	public StringedInstrument(String name, int n) {
		super(name);
		numberOfStrings = n;
	}
	public abstract String play();
}

class ElectricGuitar extends StringedInstrument {
	private String player;
	public ElectricGuitar(String Playername, int numberOfStrings) {
		super("Electric Guitar", numberOfStrings);
		player = Playername;
	}
	public ElectricGuitar() {
		this("Anonymous Player", 0);
	}
	@Override
	public String play() {
		String val = player;
		val = player + " playing " + name;
		return val;
	}
	
	@Override
	public String toString() {
		return "Electric Guitar with number of strings=" + numberOfStrings;
	}
}
