package fundamentals_;

public class BreakCamelCase {
//Complete the solution so that the function will break up camel casing, using a space between words.
//
//Example
//"camelCasing"  =>  "camel Casing"
//"identifier"   =>  "identifier"
//""             =>  ""

    public static String camelCase(String input) {
        StringBuilder sb = new StringBuilder(input.length());
        for (int i = 0; i < input.length(); i++) {            
            if(Character.isUpperCase(input.charAt(i))) {
                sb.append(" ");
            }
            sb.append(input.charAt(i));
        }        
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "camelCasing";
        System.out.println(camelCase(input));
    }

}
