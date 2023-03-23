public class multiArrayDemo{

//********************************************************************************************************
// A 2D array is not a rectangular grid. Or maybe better, there is no such thing as a 2D array in Java
// Column lengths differ per row
// arr.length is the number of rows, and each row may have a different number of columns
// arr[0].length is the number of columns for the first row
// In other words, the length of the elements of a two-dimensional array in Java need not be equal.
// new int[6][] can hold 6 rows of integers which can be of different length. 
//********************************************************************************************************
	
	public static void printArray(int [][] toPrint) {
		for(int i=0;i < toPrint.length; i++) {
			for(int j=0;j < toPrint[i].length;j++) {
				System.out.println("["+ i+", "+j+"]==> "+toPrint[i][j]+" ");
			}			
		}
	}
	
	// Functioning of below method indicates that multidimensional arrays are just componenents of individual rows.
	public static void printMultiArray(int [][] toPrint) {
		System.out.println("For each loop to print multidimensional array");
		for (int[] a : toPrint) {
  			for (int i : a) {
    				System.out.println(i);
  			}
		}
	}
	
	public static void main(String [] args) {
		// Declare array 
		// Ragged Array or Non Rectangular Array
		int[][] array1 = { {1, 2, 3, 4}, {5, 6, 7} };
		
		int[][] array2 = new int[5][2];
		
		// Documentation states that: Multi-dimensional arrays are really just arrays which contain components of array type.
		int[] num[] = new int[5][2];
		
		num[0][0]=1;
 		num[0][1]=2;
 		num[1][0]=3;
 		num[1][1]=4;
		
		System.out.println("Print array1==>int[][] array1 = { {1, 2, 3, 4}, {5, 6, 7} }");
		printArray(array1);
		
		System.out.println("Print array2-> int[][] array2 = new int[5][2]");
		printArray(array2);
		
		System.out.println("Print array3-> int[] num[] = new int[5][2]");
		printArray(num);
		
		printMultiArray(num);
	}

}
