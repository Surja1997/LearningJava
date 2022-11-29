package recursion;

import java.util.Arrays;

public class CheckArraySorted {
    public static boolean isArraySorted(int[] a) {
        if (a.length == 1)
            return true;
        if (a[0] < a[1])
            return isArraySorted(Arrays.copyOfRange(a, 1, a.length));
        else
            return false;
    }

    public static void main(String[] args) {
        boolean isSorted = isArraySorted(new int[]{1, 2, 3, 4, 5, 2});
        System.out.println("is Array sorted -> " + isSorted);
        isSorted = isArraySorted(new int[]{1, 2, 3, 4, 5});
        System.out.println("is Array sorted -> " + isSorted);
    }
}
