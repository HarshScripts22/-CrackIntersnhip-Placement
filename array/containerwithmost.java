public class containerwithmost {
    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(maxArea(height));

    }

    public static int maxArea(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n - 1;
        int maxarea = 0;
        while (l < r) {
            int lh = height[l];
            int rh = height[r];
            int minh = Math.min(lh, rh);
            maxarea = Math.max(maxarea, minh * (r - l));
            if (lh < rh) {
                l++;
            } else {
                r--;
            }

        }
        return maxarea;

    }
}
