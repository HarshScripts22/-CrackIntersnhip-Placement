public class palindromicArr {
    public static void main(String[] args) {
        int[] arr = { 111, 222, 333, 754 };

        System.out.println(palindrome(arr));

    }

    public static boolean palindrome(int[] arr) {

        for (int num : arr) {
            String number = String.valueOf(num);
            int i = 0;
            int j = number.length() - 1;
            while (i <= j) {
                if (number.charAt(i) != number.charAt(j)) {
                    return false;
                }
                i++;
                j--;

            }

        }
        return true;

    }

}
