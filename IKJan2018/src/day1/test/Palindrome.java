package day1.test;

/**
 * Created by ajesh on 1/8/18.
 */
public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("Never a foot too far, even."));
    }


    public static boolean isPalindrome(String s){
       return isPalindromeHelper(s,0,s.length()-1);
    }
//TODO: change this to something
    private static boolean isPalindromeHelper(String s, int start, int end) {
        if(start>=end) return true;
        if(!(Character.toString(s.charAt(start)).equalsIgnoreCase(Character.toString(s.charAt(end))))) return  false;

        return isPalindromeHelper(s,start+1,end-1);


    }










}
