
public class StringDemo2 {


	public static void main(String[] args) 
	{
		String adel = "Adel";
		String Mohamed = "Mohamed";
		String fullone = adel.concat(Mohamed); // concatinating strings

		StringDemo2 obj = new StringDemo2();
		String fullname = obj.fullnamevalue("Hamada", "Mohamed");
		System.out.println("full name is " +fullname);
	}



	public String fullnamevalue(String first, String Last) 

	{
		String full = first.concat(Last);
		return full;

	}
}
