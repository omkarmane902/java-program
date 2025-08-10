package Binary_serch;

public class Binary_serch1 {

	public static void main(String[] args) {
        int[] a = {3, 9, 15, 19, 23, 56, 84, 91, 105, 156, 190}; // Sorted array
        int search = 56; // Element to find

        int start = 0;
        int end = a.length - 1;
        int mid = (start + end) / 2;
        boolean found = false;

        while (start <= end) {
            if (a[mid] == search) {
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            } else if (search > a[mid]) {
                start = mid + 1;
            } else if (search < a[mid]) {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }

        if (!found) {
            System.out.println("Element Not Found");
        }
    }
	
}
