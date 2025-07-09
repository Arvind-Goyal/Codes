
import java.util.Stack;

public class MaximumArea {


    public static void maxArea(int arr[]){

        int maxarea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];
        // next smaller right 
        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty()&&arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            }
            else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        // next smaller left
        s = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty()&&arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }
            else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        // current area
        for(int i=0;i<arr.length;i++){
            int height =arr[i]; // {9,8,7,6,2,3} for value 6: 
            int widht = nsr[i] -nsl[i] -1; // can't change the sequence of nsr and nsl 
            // in corner cases where nsl become -1 & nsr =4(index) for value 6 then
            int currarea = height * widht; // widht = 4 - (-1) -1 = 4 ....
            maxarea = Math.max(currarea, maxarea); 
        }
        System.out.println(nsl[3]+" " + nsr[3]);
        System.out.println(maxarea);
    }
    public static void main(String[] args) {
        int arr[] ={9,8,7,6,2,3};
        maxArea(arr);
    }
}
