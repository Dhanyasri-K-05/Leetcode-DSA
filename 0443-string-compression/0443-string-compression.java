class Solution {
    public int compress(char[] chars) {
        int count = 1;
        int left = 0;
        for (int i = 1; i <= chars.length; i++) {
            if (i<chars.length && chars[i] == chars[i - 1]) {
                count++;
            } else {
                chars[left++] = chars[i - 1];

                if (count > 1) {
                    String countStr = Integer.toString(count);
                    for (int j = 0; j < countStr.length(); j++) {
                        chars[left++] = countStr.charAt(j);
                    }
                }

            
                count = 1;

            }

        }


         

        return left;
    }
}