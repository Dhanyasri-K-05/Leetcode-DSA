class Solution {
    public int lengthAfterTransformations(String s, int t) {
        int mod=1000000007;

        int freq[]=new int[26];

        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }

        for(int i=0;i<t;i++){
            int newfreq[]=new int[26];

            for(int j=0;j<26;j++){
                if(j==25){
                    newfreq[0]=(newfreq[0]+freq[25])%mod;
                      newfreq[1]=(newfreq[1]+freq[25])%mod;
                }
                else if(freq[j]!=0){
                    newfreq[j+1]=(newfreq[j+1]+freq[j])%mod;
                }
            }

            freq=newfreq;
        }
        
long sum=0;
        for(int num:freq){
            sum=sum+num;
        }
return (int)(sum%mod);



    }
}