public class Largestnumber {
    public static int getLargest(int[] arr) {
        int largest = Integer.MIN_VALUE; // Initialize to the smallest possible integer
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8, -1, 4};
        int largestNumber = getLargest(arr);
        System.out.println("The largest number in the array is: " + largestNumber);
    }
}
