/*
 * Purpose/Description: This program checks a sorted integer array for a key (number) and returns 
 *                      how many times the key is in the arry.    
 */
package assignment1problem2;


public class Assignment1Problem2 {


    public static void main(String[] args) {
        
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 10,};
        int k = 9;
        System.out.println(k+ " is in the array is "+occurrences(A, k)+" times.");
    }

    //this is the more eficient mentod
    public static int occurrences(int[] A, int k) {

        //
        int low = 0;
        int high = A.length - 1;

        //set the index defalt to indecate that the key is not in the numbers arry
        int index = -1;

        //Binary search for the key
        while (low <= high) {

            int mid = (high + low) / 2;

            if (A[mid] < k) {
                low = mid + 1;

            } else if (A[mid] > k) {
                high = mid - 1;
            } else if (A[mid] == k) {
                index = mid;
                low = high + 1;
            }

        }

        //if the index does not change in the while loop then that means that 
        //the key is not in the arry therfore the program will return a zero
        if (index < 0) {
            return 0;

        }

        //the Binary search does not return the the index of the fist time that 
        //the key is in the array. Therefor, we have to check the 
        //indexes befor and after the index that is returned from the Binary 
        //Search in order to see if they are equal to the key.
        int aIndex = index;

        int count = 1;

        while (k == A[index + 1] && index < A.length - 2) {

            count++;
            index++;
        }

        while (k == A[aIndex - 1] && index >= 0) {
            count++;
            aIndex--;
        }

        //the amount of times k is int the array
        return count;

    }
}
