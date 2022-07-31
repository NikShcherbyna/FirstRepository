package second;


import java.util.Locale;

public class SecondHomework {
    public static void main(String[] args) {
        wordsCount("I love Java!");

        String word = "EyE";
        if (isWordPalindrome(word.toLowerCase())){
            System.out.println(word.toLowerCase() + " -> palindrome");
        }else{System.out.println(word.toLowerCase() + " -> is not a palindrome");
        }

    }

   public static void wordsCount(String name) {
        String[] words = name.split(" ");
        System.out.println(name + "-> " + words.length + " words");
    }

    public static boolean isWordPalindrome(String name){
        char[] word = name.toCharArray();
        int left = 0;
        int right = name.length()-1;
        while(left != right && left < right){
            if (word[left] != word[right]) return false;
            left++;
            right--;
        }return true;



    }

}








