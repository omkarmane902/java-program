package List;


import java.util.Arrays;
import java.util.List;

public class Convert_Array_to_List {

    public static void main(String[] args) {

        // Array तयार केला
        Integer[] arr = {1, 2, 3, 4, 5}; // 👉 int नाही, Integer वापरा

        // Array → List
        List<Integer> list = Arrays.asList(arr);

        System.out.println("List: " + list);
    }
}
