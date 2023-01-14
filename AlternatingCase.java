package fundamentals_;

public class AlternatingCase {

    /*
    StringUtils.toAlternativeString("hello world") == "HELLO WORLD"
    StringUtils.toAlternativeString("HELLO WORLD") == "hello world"
    StringUtils.toAlternativeString("hello WORLD") == "HELLO world"
    StringUtils.toAlternativeString("HeLLo WoRLD") == "hEllO wOrld"
    StringUtils.toAlternativeString("12345") == "12345" // Non-alphabetical characters are unaffected
    StringUtils.toAlternativeString("1a2b3c4d5e") == "1A2B3C4D5E"
    StringUtils.toAlternativeString("StringUtils.toAlternatingCase") == "sTRINGuTILS.TOaLTERNATINGcASE"
     */
    public static void main(String[] args) {
        System.out.println(getText("ALTerNAtiNG CaSe"));        
    }
    
    public static String getText(String text) {
        StringBuilder sb = new StringBuilder(text.length());
        for(char c: text.toCharArray()) {
            String a = Character.toString(c);
            if(a.equals(a.toLowerCase())) {
                a = a.toUpperCase();
            } else {
                a = a.toLowerCase();
            }
            sb.append(a);
        }
        return sb.toString();
    }
}
