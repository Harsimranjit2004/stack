package Stack;
import java.Util.*;

public class _8_reverseSubstringParenthesis{
    public static String reverseSubstring(String s){
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<s.lenght();i++){
            if(s.charAt(i) == ')'){
                Queue<Character> q = new LinkedList();
                while(st.peek() != '(' ){
                    q.add(st.pop());
                }
                st.pop();
                while(q.size()>0){
                    st.push(q.remove());
                }

            }else{
                st.push(s.charAt(i));
            }
        }
        char[] ans = new char[st.size()]
        int i  = ans.lenght-1;
        while(i>=0){
            ans[i] = st.pop();
            i++;
        }
        return new String(ans);
    }
}