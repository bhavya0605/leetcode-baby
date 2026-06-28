class Solution {
    public boolean isPalindrome(String s) {
        s = s.replace(" ","");
        s = s.replaceAll("[^a-zA-Z0-9]","");
        s=s.toLowerCase();
        String reversed = new StringBuilder(s).reverse().toString();
        if(reversed.equals(s)) return true;

        return false;
    }
}