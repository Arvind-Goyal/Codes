public class Findingpermutation {
    public static void findingpermutation(String str,String ans){
        //base 
        if( str.length()==0){
            System.out.println(ans);
        }
        for(int i =0;i<str.length();i++){
            char cur = str.charAt(i);
            String Newstr = str.substring(0,i)+str.substring(i+1);
            findingpermutation(Newstr, ans+cur);
        }
    }
    public static void main(String[] args) {
        String str = "123";
        findingpermutation(str,"");
    }
}
