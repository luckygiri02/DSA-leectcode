public class Difference_of_two_arrays {
    public static void main(String[] args) {
        int[] a1 = { 1 };
        int[] a2 = { 1, 0, 0, 0 };

        int n2 = a2.length;

        int[] diff = new int[n2];

        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = diff.length - 1;
        int c = 0;

        while (k >= 0) {
            int d = 0;
            int av1 = i >= 0 ? a1[i] : 0;
            if (a2[j] + c >= av1) {
                d = a2[j] + c - av1;
                c = 0;
            } else {
                d = a2[j] + c + 10 - av1;
                c = -1;
            }

            diff[k] = d;
            i--;
            j--;
            k--;

        }
        int indx = 0;

        // skip leading zeros
        while (indx < diff.length && diff[indx] == 0) {
            indx++;
        }

        // print remaining digits
        while (indx < diff.length) {
            System.out.print(diff[indx]);
            indx++;
        }

    }
}
