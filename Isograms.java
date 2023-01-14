package fundamentals_;

public class Isograms {

    /*
    An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.

    Example: (Input --> Output)

    "Dermatoglyphics" --> true "aba" --> false "moOse" --> false (ignore letter case)

    isIsogram "Dermatoglyphics" = true
    isIsogram "moose" = false
    isIsogram "aba" = false
     */
    public static boolean isIsogram(String str) {
        char letter;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            letter = str.charAt(i);            
            for (int j = i+1; j < str.length(); j++) {
                if(letter == str.charAt(j)) {
                    return false;
                }                
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsogram("aba"));
    }

}
