import java.util.*;

public class PushBottomUsingSstack {

    public static void addBottom(Stack <Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        addBottom(s, data);
        s.push(top);
        return;
    }
    public static void main(String []args){
        Stack <Integer> s = new Stack<>();
        //PushBottomUsingSstack s1 =new PushBottomUsingSstack(); // this is made for accessing non 
        s.push(10);     //static method can't use s vairable as it is define for stack framework
        s.push(20);     //name depends upon class name ...
        s.push(30);
        //s1.addBottom(s,40); // alternate way is define static method to addBottom and remove s1
        addBottom(s,40); // when method is static
       
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
