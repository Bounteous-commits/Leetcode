class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tolgas=0;
        int tolcost=0;
        for(int i=0;i<gas.length;i++){
            tolgas+=gas[i];
        }

        for(int j=0;j<cost.length;j++){
            tolcost+=cost[j];
        }

        if(tolgas<tolcost){
            return -1;
        }

        int start=0;
        int currgas=0;
        for(int i=0;i<gas.length;i++){
            currgas+=gas[i]-cost[i];
            if(currgas<0){
                start=i+1;
                currgas=0;
            }
        }
        return start;
    }
}
