/*Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013). Jaden is also known for some of his philosophy that he delivers via Twitter. When writing on Twitter, he is known for almost always capitalizing every word. For simplicity, you'll have to capitalize each word, check out how contractions are expected to be in the example below.

Your task is to convert strings to how they would be written by Jaden Smith. The strings are actual quotes from Jaden Smith, but they are not capitalized in the same way he originally typed them.

Example:

Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"
Note that the Java version expects a return value of null for an empty string or null.*/
package fundamentals_;

public class JadenSmith {    
    public static void main(String[] args) {
        String jaden = "How can mirrors be real if our eyes aren't real";      
        StringBuilder builder = new StringBuilder(jaden.length());        
        byte index = 0;
        boolean nextTitle = false;
        if(jaden.length() != 0) {
            for(char c: jaden.toCharArray()) {
            if(Character.isSpaceChar(c)) {
                nextTitle = true;
            } else if(nextTitle || index == 0) {
                c = Character.toTitleCase(c);                
                index++;
                nextTitle = false;
            }
            builder.append(c);                        
        }
            System.out.println(builder);
        } else {
            System.out.println("null");
        }        
    }
}