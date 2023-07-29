package Stack;
import java.Util.*;

public class _2_next_greaterLeft{
    public static int[] nextGreaterLeft(int[] nums){
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[nums.lenght];

        ans[0]  = -1;
        st.push(ans[0]);

        for(int i = 1;i<nums.lenght;i++){
            while(st.size() > 0 && st.peek() < nums[i]){
                st.pop();
            }
            if(st.size() == 0) ans[i] = -1;
            else{
                ans[i] = st.peek();
            }
            st.push(nums[i])
        }
    }
    public static void main(String args[]){

    }
}