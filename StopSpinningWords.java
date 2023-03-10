package fundamentals_;

public class StopSpinningWords {

    /*
    Write a function that takes in a string of one or more words, and returns the same string, but with all five or more letter words reversed (Just like the name of this Kata). Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.

Examples:

spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw" 
spinWords( "This is a test") => returns "This is a test" 
spinWords( "This is another test" )=> returns "This is rehtona test"
     */
    public static String spinWords(String sentence) {
        String[] splitted = sentence.split(" ");
        StringBuilder sb = new StringBuilder(sentence.length());
        int i = 1;
        for (String word : splitted) {
            if (word.length() >= 5) {
              sb.append(" ");
                for (int j = 0; j < word.length(); j++) {
                    sb.append(word.charAt(word.length() - i));
                    i++;
                }
                i = 1;                
            } else {
                sb.append(" ");
                sb.append(word);
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(spinWords("This is a test"));
    }

}
