import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class missingndrepeating {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 3 };
        System.out.println(Arrays.toString(findminrev(arr)));
    }

    public static int[] findminrev(int arr[]) {

        // brute force approach time complexity - O(n)
        // space complexity - O(n)
        // int n = arr.length;
        // HashMap <Integer,Integer>map = new HashMap<>();
        // for(int i =1;i<=n;i++){
        // map.put(i,0);
        // }
        // for(int i =0;i<arr.length;i++){
        // if(map.containsKey(arr[i])){
        // map.put(arr[i],map.get(arr[i])+1);
        // }else{
        // map.put(arr[i],1);
        // }
        // }
        // int [] ans = new int[2];
        // for(Map.Entry<Integer,Integer> e:map.entrySet()){
        // if(e.getValue()>1){
        // ans[0]=e.getKey();
        // }
        // if(e.getValue()==0){
        // ans[1]=e.getKey();
        // }
        // }
        // return ans;

        // optimal appraoch
        int n = arr.length;
        int repeatingNum = 0;
        for (int i = 0; i < n; i++) {
            int ind = Math.abs(arr[i]) - 1;
            if (arr[ind] < 0)
                repeatingNum = ind + 1;
            else
                arr[ind] = -arr[ind];
        }

        int missingNum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                missingNum = i + 1;
                break;
            }
        }

        int res[] = new int[2];
        res[0] = repeatingNum;
        res[1] = missingNum;

        return res;

    }
}
