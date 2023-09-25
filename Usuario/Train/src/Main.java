// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Base b = new Base();
        /* Suma de dos numeros
        int [] nums = {4,-2,5,0,6,3,2,7};
        int target = 7;
        int [] answer = b.twoSum(nums,target);
        if(answer[1]!=0) {
            for (int i = 0; i < answer.length; i++) {
                System.out.println("[" + answer[i] + "] = " + nums[answer[i]]);
            }
        }else{
            System.out.println("Ningun numero suma: "+ target);
        }
        */
        /* Palindromo
        boolean x = b.isPalindrome(10);
        System.out.println(x);
         */
        /* Conversion de números romanos
        int x = b.romanToInt("DCXXI");
        System.out.println(x);
         */
        String [] strs = {"flower","flow","flight"};
        String res = b.longestCommonPrefix(strs);
        System.out.println(res);
    }
}