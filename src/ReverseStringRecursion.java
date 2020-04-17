
public class ReverseStringRecursion {
    public static void main(String[] args){
        String s = "Lingaraj";
        String rs=null;
        reverseString(s,rs,s.length()-1);

    }

    private static void reverseString(String s,String rs, int i) {
        if(i==-1){
            return;
        }

        System.out.println(s.charAt(i));
         reverseString(s,rs,i-1);
    }
}
