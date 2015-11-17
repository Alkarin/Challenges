/**
 * Created by alkarin on 11/12/15.
 */
import java.util.*;
public class Language {
    public static void main(String[] args) {
        System.out.println("Please enter in 'c' for a consant and 'v' for a vowel");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        char[] array = str.toCharArray();
        for(int i = 0; i < array.length; i++) {
            if (array[i] == 'c') {
                System.out.print(getConsonant());
            }
            if (array[i] == 'C') {
                System.out.print(getUpConsonant());
            }
            if (array[i] == 'v') {

                System.out.print(getVowel());
            }
            if (array[i] == 'V') {
                System.out.print(getUpVowel());
            }
            if (array[i] == ' ') {
                System.out.print(' ');
            }

        }
    }
    public static char getVowel(){
        String vow = "aeiou";
        ArrayList<Character> vowels = new ArrayList<Character>();
        for(char c : vow.toCharArray()){
            vowels.add(c);
        }
        Collections.shuffle(vowels);
        return vowels.get(0);
    }
    public static char getUpVowel(){
        String vow = "AEIOU";
        ArrayList<Character> vowels = new ArrayList<Character>();
        for(char c : vow.toCharArray()){
            vowels.add(c);
        }
        Collections.shuffle(vowels);
        return vowels.get(0);
    }
    public static char getConsonant(){
        String con = "bcdfghjklmnpqrstvwxyz";
        ArrayList<Character> consonants = new ArrayList<Character>();
        for(char c : con.toCharArray()){
            consonants.add(c);
        }
        Collections.shuffle(consonants);
        return consonants.get(0);
    }
    public static char getUpConsonant(){
        String con = "BCDFGHJKLMNPQRSTVWXYZ";
        ArrayList<Character> consonants = new ArrayList<Character>();
        for(char c : con.toCharArray()){
            consonants.add(c);
        }
        Collections.shuffle(consonants);
        return consonants.get(0);
    }
}
