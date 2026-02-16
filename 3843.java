class Solution {
    public int firstUniqueFreq(int[] nums) {
        
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }

        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int num:map.values()){
            if(freq.containsKey(num)){
                freq.put(num,freq.get(num)+1);
            }else{                
                freq.put(num,1);
            }
        }

        for(int num:nums){
            int fre=map.get(num);
            if(freq.get(fre)==1){
                return num;
            }
        }
       
        return -1;
    }
}
