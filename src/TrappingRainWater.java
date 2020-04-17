
public class TrappingRainWater {
    public static void main(String[] args){
//        int[] height = {3, 0, 0, 2, 0, 4};
//        int[] height = {2, 0, 2};
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("No of units of water trapped :"+ trap(height));

    }
    //Used Dynamic Programming concept
    public static int trap(int[] height) {
        int ans =0;
        int size = height.length;
        // to get the max consecutives bar from left to pright
        int[] left_max = new int[size];
        // to get the max consecutives bar from right to left
        int[] right_max = new int[size];

        left_max[0] = height[0];
        //Get the max
        for(int i=1;i<size;i++){
            left_max[i]=Math.max(height[i],left_max[i-1]);
        }

        right_max[size-1] = height[size-1];

        for(int i=size-2;i>=0;i--){
            right_max[i] = Math.max(height[i],right_max[i+1]);
        }
        //Get the min among the bars from leftmax and righ max and do diff from the current bar.
        for(int i=1;i<size-1;i++){
            ans+=Math.min(left_max[i],right_max[i])-height[i];
        }
        return ans;
    }
}
