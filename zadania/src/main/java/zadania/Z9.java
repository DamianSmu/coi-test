package zadania;

import java.util.Arrays;

public class Z9 {
    public static void main(String[] args) {
        String w1 = "MARA";
        String w2 = "RAMA";
        System.out.println("Wyrazy " + (isAnagram(w1, w2) ? "" : "nie ") + "składają się z tych samych liter");
    }

    public static boolean isAnagram(String s1, String s2){
        if (s1 == null || s2 == null) {
            return false;
        }
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}

