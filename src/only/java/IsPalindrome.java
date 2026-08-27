package only.java;

public class IsPalindrome {
    public static void main(String[] args) {
        String str = "izaz";//radar
        boolean isPal = true;
        int left =0;
        int right = str.length()-1;
        while (left<right){
            if (str.charAt(left)!=str.charAt(right)){
                isPal = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println("given string palindrome? "+isPal);
    }
}
