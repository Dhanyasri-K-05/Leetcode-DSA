class Solution {
    public int maximumEnergy(int[] energy, int k) {

            int maxi=Integer.MIN_VALUE;
            int[] dp=new int[energy.length];
            Arrays.fill(dp,-1);
        for(int i=0;i<energy.length;i++){
            int a=calculate(i,energy,0,k,dp);
            maxi=Math.max(maxi,a);
            System.out.println(maxi);
        }

        return maxi;
        
    }

    int calculate(int i,int[] energy,int sum,int k,int[] dp){
        if(i>=energy.length) return 0;

        if(dp[i]!=-1) return dp[i];
           int ans=sum+energy[i];
           return dp[i]=energy[i]+calculate(i+k,energy,ans,k,dp);
            

    }
}