class Solution {
    public String reversePrefix(String s, int k) {
        String a="";
        for(int i=k-1;i>=0;i--)
        {
            a=a+s.charAt(i);
        }
        for(int i=k;i<s.length();i++)
        {
            a=a+s.charAt(i);
        }
        return a;
    }
}