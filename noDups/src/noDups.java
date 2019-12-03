// Imports the module needed to sort the array
import java.util.Arrays;

// Declares the public class and method which prints out 3 sets of arrays
// One is the original, then the sorted then the array with no duplicates
public class noDups{
	public static void no_dubs(int[] start_array) {
		
		// This prints out the line that will state that it is the entered array
		// It then runs through every position for the length of the array and prints out each value
		System.out.println("This is the input array: \n");
		for (int n = 0; n < start_array.length; n++)
            System.out.println(start_array[n]);
		
		// This uses the imported module to sort the array in ascending order
		Arrays.sort(start_array);
		
		// Prints out the line that will state that it is the sorted array
		System.out.println("This is the sorted array: \n");
		// Runs through every position for the length of the array and prints out the values
		for (int n = 0; n < start_array.length; n++)
            System.out.println(start_array[n]);

		// Declares two empty strings that will be used to build a new array
		 String no_dup_string = "";
		 String dup_string = "";
		
		 // This runs for the length in the array
		 // It takes the first value and puts it into the new string
		 // It then compares the next value to a previous value
		for (int i = 0; i < start_array.length; i++ ) {
			int main_num = start_array[i];
		
			// This just inputs the first value into the new string
			if (i == 0) { 
			no_dup_string = no_dup_string + start_array[i] + "-";
			}
			
			// This part will compare the new value with the previous value
			// If it is the same as the previous value then it does not get added to the no duplicate string
			else {
			int j = i - 1;
			if (main_num == start_array[j]) {
			dup_string = dup_string + start_array[i];}
			
			// If it differs from the previous value it gets put into the new no duplicate string 
			if (main_num != start_array[j]) {
			no_dup_string = no_dup_string + main_num + "-";
			}
		}
	}
		
		
		// This builds an array that takes in string values
        String[] no_dups_array;
        // This is the delimiter by which the string gets split
        String delimiter = "-";
 
        // This then input the split string into the new array
        no_dups_array = no_dup_string.split(delimiter);
 
        // Prints out the line that stares that this is the array with no duplicates
        System.out.println ("This is the array with no duplicates: ");
        // This prints out each index for the length of the array
        for (int n = 0; n < no_dups_array.length; n++)
            System.out.println(no_dups_array[n]);
 
	}
	// This declares the main method of the program
	// This calls the method no_dubs and inputs the start array into it
	public static void main(String[] args) {
		int [] start_array = new int [] {20,100,10,80,70,1,0,-1,2,10,15,300,7,6,2,18,19,21,9,0};
		no_dubs(start_array);
	}
}
		

	
