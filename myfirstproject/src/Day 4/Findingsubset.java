public class Findingsubset{
    public static void findingsubset(String str,String ans,int i){
            //base case 
            if(i==str.length()){
                if(ans.length()==0){
                    System.out.println("Null");
                }
                else{
                    System.out.println(ans);
                }
                return;
            }
            else{
                findingsubset(str, ans+str.charAt(i), i+1);
                findingsubset(str, ans, i+1);
            }
    }
    public static void main(String[] args) {
        String str = "abc";
        findingsubset(str,"",0);
    }
}