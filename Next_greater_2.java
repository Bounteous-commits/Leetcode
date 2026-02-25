class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int left[]=new int[nums.length];
        int right[]=new int[nums.length];

        Stack<Integer> st=new Stack<>();
        left[nums.length-1]=-1;
        st.push(nums[nums.length-1]);

        for(int i=nums.length-2;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                left[i]=-1;
            }else if(st.peek()>nums[i]){
                left[i]=st.peek();
            }
            st.push(nums[i]);
        }
        for(int i=nums.length-1;i>=0;i--){
             while(!st.isEmpty() && st.peek()<=nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                left[i]=-1;
            }else if(st.peek()>nums[i]){
                left[i]=st.peek();
            }
            st.push(nums[i]);
        }
        return left;
    }
}
