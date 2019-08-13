
import java.io.*;
import java.util.*;

/**
 *
 * @Henderson Computer Science UIL team
 */
public class Main {
    public static boolean array6(int[] nums, int index) {
  if(index==nums.length) return false;
  if(nums[index]==6) return true;
  return array6(nums,index++);
}

    public static void main(String[] args) throws IOException {
        
        int arr[] = {1,6,4};
        System.out.println(array6(arr,0));
    }
}
