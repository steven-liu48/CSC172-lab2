//String name = "Xiaoxiang Liu (Steven)";
//String netID = "xliu102";
//String assignment_number = "CSC_172_Lab_2"; 
//String lab_selection_ time = "MW 6:15PM - 7:30PM";
//String statement = "I did not collaborate with anyone on this assignment.";

/*
Input for test (Just copy)
1 2 3 4 5
1.1 2.2 3.3 4.4 5.5
H E L L O
once upon a time
*/

import java.util.Scanner;

public class Lab2 {
	//A static printArrayNonGen() method with an array of Objects as parameter
	public static void printArrayNonGen(Object[] objectArray) {		
		System.out.print("{");
		for(int i = 0; i < objectArray.length - 1; i++) {
			System.out.print(objectArray[i] + ", ");
		}		
		System.out.println(objectArray[objectArray.length - 1] + "}");
	}
	
	//A static printArray() method using method overloading. 
	//Implement four versions of printArray(), one for each array type.
	public static void printArray(Integer[] intArray ) {
		System.out.print("{");
		for(int i = 0; i < intArray.length - 1; i++) {
			System.out.print(intArray[i] + ", ");
		}		
		System.out.println(intArray[intArray.length - 1] + "}");
	}
	
	public static void printArray(Double[] doubleArray ) {
		System.out.print("{");
		for(int i = 0; i < doubleArray.length - 1; i++) {
			System.out.print(doubleArray[i] + ", ");
		}		
		System.out.println(doubleArray[doubleArray.length - 1] + "}");		
	}	
	
	public static void printArray(Character[] charArray ) {
		System.out.print("{");
		for(int i = 0; i < charArray.length - 1; i++) {
			System.out.print(charArray[i] + ", ");
		}		
		System.out.println(charArray[charArray.length - 1] + "}");		
	}
	public static void printArray(String[] strArray ) {
		System.out.print("{");
		for(int i = 0; i < strArray.length - 1; i++) {
			System.out.print(strArray[i] + ", ");
		}		
		System.out.println(strArray[strArray.length - 1] + "}");	
	}
	
	//Implement a single static method printArrayGen() that uses 
	//the generic programming technique to support all 4 array types 
	//and maintain type safety.
	public static <T> void printArrayGen(T[] Array) {
		System.out.print("{");
		for(int i = 0; i < Array.length - 1; i++) {
			System.out.print(Array[i] + ", ");
		}		
		System.out.println(Array[Array.length - 1] + "}");	
	}
	
	//Using non-generic techniques, implement a static method getMax() 
	//that takes an array of type Comparable and returns the maximum element 
	//in the array.
	public static Comparable getMax(Comparable [] anArray) {
		Comparable pointer = anArray[0];
		for(Comparable a: anArray) {
			if (a.compareTo(pointer) >= 0) {
				pointer = a;
			}
		}
		return pointer;
	}	
	
	//Using the generic techniques to specify super-class relationships, 
	//implement a type safe version of the method in 4 named getMaxGen().
	public static <T extends Comparable<T>> T getMaxGen(T[] Array) {
		if(Array.length == 0) {
            return null;
        }
		T pointer = Array[0];
		for(T a: Array) {
			if (a.compareTo(pointer)>0) {
				pointer = a;
			}
		}
		return pointer;
	}	
	
	//Main class
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		    String[] arrA  = scanner.nextLine().split("\\s"); //input integers with white spaces between them (e.g. 1 2 3 4)
		    String[] arrB = scanner.nextLine().split("\\s"); //input doubles with white spaces between them (e.g. 1.1 2.2 3.3 4.4)
		    String[] arrC = scanner.nextLine().split("\\s"); //input characters with white spaces between them (e.g. H E L L O)
		    String[] strArray = scanner.nextLine().split("\\s"); //input strings with white spaces between them (e.g. once upon a time)
		 
		    Integer[] intArray = new Integer[arrA.length];
		    Double[] doubArray = new Double[arrB.length];
		    Character[] charArray = new Character[arrC.length];
		 
		    for(int i=0;i<arrA.length;i++){intArray[i] = Integer.parseInt(arrA[i]);}
		    for(int i=0;i<arrB.length;i++){doubArray[i] = Double.parseDouble(arrB[i]);}
		    for(int i=0;i<arrC.length;i++){charArray[i]=arrC[i].charAt(0);}
		 
		    printArrayNonGen(intArray);
		    printArrayNonGen(doubArray);
		    printArrayNonGen(charArray);
		    printArrayNonGen(strArray);
		    
		    printArray(intArray);
		    printArray(doubArray);
		    printArray(charArray);
		    printArray(strArray);
		 
		    printArrayGen(intArray);
		    printArrayGen(doubArray);
		    printArrayGen(charArray);
		    printArrayGen(strArray);
		 
		    System.out.println(getMax(intArray));
		    System.out.println(getMax(doubArray));
		    System.out.println(getMax(charArray));
		    System.out.println(getMax(strArray));
		 
		    System.out.println(getMaxGen(intArray));
		    System.out.println(getMaxGen(doubArray));
		    System.out.println(getMaxGen(charArray));
		    System.out.println(getMaxGen(strArray));
		}

}
