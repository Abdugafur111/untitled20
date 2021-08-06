public class Palin {

    public static boolean isPalindrome(String s){
        String s1 = filter(s);
        String s2 = reverse(s1);

        return s1.equals(s2);
    }




    public static String filter(String s){
        StringBuilder stringB = new StringBuilder();

        for(int i=0; i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                stringB.append(s.charAt(i));
            }
        }
        return stringB.toString();
    }


    public static String reverse(String s){
        StringBuilder stringBuilder = new StringBuilder(s);

        stringBuilder.reverse();
        return stringBuilder.toString();
    }


}




