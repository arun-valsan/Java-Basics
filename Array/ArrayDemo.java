public class ArrayDemo{
	
	public static void printArray(int [] toPrint) {
		for(int i=0;i < toPrint.length; i++) {
			System.out.println(toPrint[i]);
		}
	}
	public static void main(String [] args) {
		// Declare array 
		int [] array1;
		int [] array2 = new int[5];
		int [] array3 = new int[]{1,2,3};
		int [] array4 = {10,11,12};
	
		array1 = new int[]{21,22,23};
		
		System.out.println("Print array1--> in[] array1");
		printArray(array1);
		
		System.out.println("Print array2-> in[] array2=new int[5]");
		printArray(array2);
		
		System.out.println("Print array3-> in[] array3=new int[]{1,2,3}");
		printArray(array3);
		
		System.out.println("Print array4-> in[] array4={10,11,12}");
		printArray(array4);
	}

}