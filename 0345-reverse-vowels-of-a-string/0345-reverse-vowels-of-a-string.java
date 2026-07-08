class Solution {
    public String reverseVowels(String s) {
        int start = 0;
        int end = s.length()-1;
        char[] arr = s.toCharArray();
        while(start <= end){
            if(arr[start] == 'A'|| arr[start] == 'E'||arr[start] == 'I'||arr[start] == 'O'||arr[start] == 'U'||arr[start] == 'a'||arr[start] == 'e'||arr[start] == 'i'||arr[start] == 'o'||arr[start] == 'u'){
                if((arr[end] == 'A'|| arr[end] == 'E'||arr[end] == 'I'||arr[end] == 'O'||arr[end] == 'U'||arr[end] == 'a'||arr[end] == 'e'||arr[end] == 'i'||arr[end] == 'o'||arr[end] == 'u')){
                    char temp = arr[start];
                    arr[start]=arr[end];
                    arr[end]= temp;
                    start++;
                    end--;
                }
                else{
                    end--;
                }
            }
            else{
            start++;
        }
        }
        String ans = new String(arr);
        return ans;
          
    }
}