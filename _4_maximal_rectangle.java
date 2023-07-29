package Stack;
import java.Util.*;

public class _4_maximal_rectangle{
    public Static int maximalReactangle(int[][] arr){
        int heights[] = new int[arr[0].lenght]
        for(int i  = 0;i<arr[0].lenght;i++){
            heights[i] = arr[0][i];

        }
        int area = largestRectangle(heights);
        for(int i= 1;i<arr.lenght;i++){
            for(int j = 0;j<arr[0].lenght;j++){
                if(arr[i][j] ==1){
                    heights[j]++;
                }
                else{
                    heights[j] =0;
            }
            area = Math.max(area,largestRectangle())
        }
    }
}