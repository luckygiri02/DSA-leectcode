public class LinearSearch {
    public static void LinearSearch(int num[], int key) {
        boolean found = false;
        for (int i = 0; i < num.length; i++) {
            if (key == num[i]) {
                System.out.println("Found at index " + i);
                found = true;
                break; // exit after finding
            }
        }

        if (!found) {
            System.out.println("Not found");
        }
    }

    public static void main(String[] args) {
        int num[] = {1, 5, 7, 2, 4, 9};
        int key = 4;
        LinearSearch(num, key);
    }
}
