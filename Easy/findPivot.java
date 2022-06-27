import java.util.Arrays;
import java.util.Hashtable;
import java.util.OptionalInt;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class main {
    public static void main(String[] args) {
        int[] nums = {-1,-1,0,1,1,0};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        int pivot = -1;
        for(int i = 0; i < (nums.length); i++){
            if(getAllPrev(i, nums) == getAllFuture(i, nums)){
                pivot = i;
                return pivot;
            }
        }
        return pivot;

    }

    public static int getAllPrev(int index, int[] nums){
        int runTotal = 0;
        for(int i = 0; i < index; i++){
            runTotal = runTotal+nums[i];
        }
        return runTotal;
    }

    public static int getAllFuture(int index, int[] nums){
        int runTotal = 0;
        for(int i = (nums.length -1); i > index; i--){
            runTotal = runTotal+nums[i];
        }
        return runTotal;
    }

}
