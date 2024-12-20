import java.util.Arrays;

public class countsort {
    public static void main(String[] args) {
        int arr[] = { 6, 3, 10, 9, 2, 4, 9, 7 };
        int n = arr.length;
        counting(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    public static void counting(int arr[], int n) {
        // 1)first find max ele in orginial arr
        // 2)then create freqArr of size max+1 or you can create hasmap also to store
        // freq of ele
        // 3)now index in freqArr represent org arr ele u can increment this no of time
        // it comes in org arr
        // 4)now by checking the freq whose freq is greater than 0 put that ind into org
        // arr

        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        int freqArr[] = new int[max + 1];
        for (int num : arr) {
            freqArr[num]++;
        }
        // System.out.println(Arrays.toString(freqArr));
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (freqArr[i] > 0) {
                arr[index] = i;
                freqArr[i]--;
                index++;
            }
        }

    }
}
