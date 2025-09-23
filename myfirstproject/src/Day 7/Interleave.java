
import java.util.LinkedList;
import java.util.Queue;

public class Interleave {
    public static void interleave(Queue<Integer> q){
        int size = q.size() /2;
        Queue<Integer> q2 = new LinkedList<>();
        for(int i=0;i<size;i++){
            q2.add(q.remove());
        }
        while(!q2.isEmpty()){
            q.add(q2.remove());
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q =new LinkedList<>();
        int i=1;
        while(i<=10){
            q.add(i);
            i++;
        }
        interleave(q);
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
        }
    }
