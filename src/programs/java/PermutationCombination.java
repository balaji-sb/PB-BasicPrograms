package programs.java;

public class PermutationCombination {

    public static void main(String[] args) {

        recursive("ABC","");

    }

    public static void recursive(String value, String answer) {
        if (value.length() == 0) {
            System.out.println(answer + "");
            return;
        }
        for (int i = 0; i < value.length(); i++) {
            char ch = value.charAt(i);
            String recursiveString = value.substring(0, i) + value.substring(i + 1);
            recursive(recursiveString, answer + ch);
        }
    }

    public static void recursive(String value){
        if(value.length()==0){
            return;
        }
        System.out.print(value.charAt(value.length()-1));
        recursive(value.substring(0,value.length()-1));
    }


}
