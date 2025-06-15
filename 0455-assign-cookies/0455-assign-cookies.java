class Solution {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int left=0;
        int right=0;
        int count=0;

        while(left<g.length && right<s.length){
            if(s[right]>=g[left]) {count++;
            right++;
            left++;
            }
else
            right++;
        }

        return count;
        
    }
}