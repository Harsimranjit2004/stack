package Stack;
import java.Util.*

public class _10_maxStack{
    public static class MaxStack{
        Stack<Integer> data, max;
        public MaxStack(){
            data = new Stack<>();
            max = new Stack<>();
        }
        public void push(int x){
            data.push(x);
            int m = x;
            if(max.size()>0){
                m = Math.max(m,max.peek());
            }
            max.push(m);
        }
        public int pop(){
            max.pop();
            return data.pop();
        }
        public int top(){
           return  data.peek();
        }
        public int peekMax(){
            return max.peek();
        }
        public int popMax(){
            int torem = max.peek();
            Stack<Integer> buffer = new Stack<>();
            while(data.peek() != torem){
                int res = pop();
                buffer.push(res);
            }
            pop();
            // refilling
            while(buffer.size() > 0 ){
                int res = buffer.pop();
                push(res);
            }
            return torem;
        }
    }
}