import java.util.ArrayList;
import java.util.List;

public class ClassA {

	public void runnew1(String myname) {
		System.out.println("This is A");
		
		
		List<String> newlist = new ArrayList<String>();
		newlist.add("Adel");
		
	     boolean check =	newlist.contains(myname);
	     System.out.println(check);
	     
	}
}
