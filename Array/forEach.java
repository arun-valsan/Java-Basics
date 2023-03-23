//**************************************************************************
// Syntax:
//    for (type var : array) 
//    { 
//       statements using var;
//    }
//  variable var will be the base type of the array.
//************************************************************************** 

public class forEach{
	public static void main(String [] args) {
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i : cars) {
			System.out.println(i);
		}
	}
}

