
public class WordReversal {
    public static void main(String[] args){
        String st ="I love Programming very much";
//        String st ="H";
        String word ="";
        String rem="";
        String ReverseWords="";
        for(int i=st.length()-1;i>=-1;i--){
            if( i==-1 || st.charAt(i)==' '){
                for(int j=word.length()-1;j>=0;j--){
                    rem =rem+word.charAt(j);
                }
                ReverseWords =ReverseWords+rem+" ";
                rem="";
                word="";
            }
            else
             word =word+st.charAt(i);
        }
        System.out.println(ReverseWords);
    }
}
