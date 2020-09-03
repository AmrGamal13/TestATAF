
public class String_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Adel-Gamal Mostafa";

		String name2 [] = name.split("-"); // splitting the strings between the (-) and putting into array , result -->Adel  , Gamal Mostafa


		for (int i = 0; i < name2.length; i++) {
			
			if (name2[i].contains("Ade")) { // loop over the items in the array and if the item contains (Ade) , print the the item and then break and go out from the loop
				System.out.println(name2[i]);
				break;
			}
		}

	}

}
