class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int leftmax[]=new int[n];
        int rightmax[]=new int[n];

        leftmax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            leftmax[i]=Math.max(leftmax[i+1],height[i]);
        }

        rightmax[0]=height[0];
        for(int i=1;i<height.length;i++){
            rightmax[i]=Math.max(rightmax[i-1],height[i]);
        }

        int total=0;
        for(int i=0;i<height.length;i++){
            total+=Math.min(leftmax[i],rightmax[i])-height[i];
        }

        return total;
    }
}
