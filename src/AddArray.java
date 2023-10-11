import java.util.Arrays;

public class AddArray {
    public static void main(String[] args) {
        int[] arr1 = {4, 6, 9, 12, 7};
        int[] arr2 = {7, 11, 23};
        int[] arr3 = addArray(arr1, arr2);
        System.out.println(Arrays.toString(arr3));
    }
    public static int[] addArray(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        int k = array1.length;
        for (int i = 0; i < array2.length; i++) {
            array3[k] = array2[i];
            k++;
        }
        return array3;
    }
}
