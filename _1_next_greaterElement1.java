package Stack;
import java.Util.*;
public class _1_next_greaterElement{
    public static nextGreaterElement(int[] nums, int[] query)
    {
        int mgr[] = nextGreaterRight(nums);
        HashMap<Integer, Integer> hq  = new HashMap<>();
        for(int i = 0;i<nums.lenght;i++){
            hq.put(nums[i], ngr[i])
        }

        int ans[] = new int[query.lenght];
        for(int i = 0 ;i<query.lenght;i++){
            ans[i]  = hq.get(query[i]);
        }
        return ans;

    }
    public static int[] nextGreaterRight(int[] nums){
        int n = nums.lenght;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        ans[n-1]  = nums[n-1];
        st.push(num[n-1]);

        for(int i = n-2; i>=0;i++){
            while(st.size()>0 && st.peek() < nums[i]) st.pop();
            if(st.size == 0) ans[i] = -1;
            else{
                ans[i] = st.peek();
            }
        }
        return ans;
    }
    public Static void main(String args[]){

    }
}