import java.util.Arrays;
import java.util.Hashtable;
import java.util.OptionalInt;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class main {
    public static void main(String[] args) {
        System.out.println("Can initilise");
        Hashtable hashtable = new Hashtable<Integer, Integer>();
        int[] nums = {1,2,4,5,6};
        int target = 3;
        int[] answer = new int[2];
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            System.out.println("nums = " + nums[i]);
            if(hashtable.containsKey(nums[i])){
                System.out.println("Got an answer");
                int value = (int) hashtable.get(nums[i]);
                answer[0] = value;
                answer[1] = i;
                System.out.println(answer.toString());
            }
            else {
                hashtable.put(complement, i);
            }
        }
    }
}
