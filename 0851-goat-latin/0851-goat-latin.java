class Solution {
    public String toGoatLatin(String sentence) {

        String[] arr=sentence.split(" ");

        for(int i=0;i<arr.length;i++){
            StringBuilder str=new StringBuilder(arr[i]);
            if(vowel(arr[i].charAt(0))){
                str.append("ma");
                str.append("a".repeat(i+1));
                arr[i]=str.toString();

            }else{
                char ch=str.charAt(0);
                str.deleteCharAt(0);

                str.append(ch);
                 str.append("ma");
                str.append("a".repeat(i+1));
                 arr[i]=str.toString();
            }
        }

        return String.join(" ", arr);
        
    }
    boolean vowel(char ch){
        if(ch=='A' || ch=='E' || ch=='I' || ch=='O'|| ch=='U' || ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
            return true;
        }

        return false;
    }
}