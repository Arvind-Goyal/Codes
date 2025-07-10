import java.util.Stack;
public class Nextgreaterelement {
    public static void main(String[] args) {
        int arr[] ={6,8,1,0,3};
        int greaterelement[]= new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for(int i =arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[i]>=arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                greaterelement[i] = -1;
            }
            else{
                greaterelement[i] = arr[s.peek()];
            }
            s.push(i);   
        }

        for (int j = 0; j < arr.length; j++){
                System.out.print(greaterelement[j]+" ");
            }
    }
}
