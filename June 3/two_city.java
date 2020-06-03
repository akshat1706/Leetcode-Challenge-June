class Solution {
    public int twoCitySchedCost(int[][] costs) {
        
        int l = costs.length;
        Arrays.sort(costs, (p1,p2)->(p1[0]-p2[0]) - (p1[1]-p2[1]));        
        int sum=0;        
        for(int i=0; i<l/2; i++){  
             sum+=costs[i][0];
             sum+=costs[l/2+i][1];
        }
         return sum;
        
    }
}