package offer.array;

import java.util.HashMap;
import java.util.Map;

/**
 * 数组中重复的数字
 */
public class Num1 {
    private static boolean duplicate(int numbers[],int length,int [] duplication) {
        Map<Integer,Integer> map = new HashMap<>();
        if(numbers == null || length < 1) {
            return false;
        } else {
            for (int number : numbers) {
                if(map.containsKey(number)) {
                    duplication[0] = number;
                    return true;
                } else {
                    map.put(number,number);
                }
            }
            return false;
        }
    }

    public static  void  main(String[] args) {
        int[] numbers = new int[]{2,1,0,4,3,1};
        int[] dupli = new int[1];
        System.out.print(duplicate(numbers,5,dupli) + ",");
        System.out.println(dupli[0]);
    }

}
