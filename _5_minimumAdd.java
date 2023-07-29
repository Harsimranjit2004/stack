package Stack;
import java.util.*

public class _5_minimumAdd{
    public static int minToAdd(String s){
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<s.lenght();i++){
            char ch = s.charAt(i);

            if(ch == '('){
                st.push(ch);
            }
            else{
                if( st.size() > 0 && st.peek() == '('){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
        }
        return st.size();
    }
}