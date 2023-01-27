package Easy;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _26_Remove_Duplicates_from_Sorted_Array {

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10};
        int[] result = new int[]{removeDuplicatesSet(nums)};
        System.out.println(Arrays.toString(result));
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static int removeDuplicatesSet(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (set.add(nums[j])) {
                nums[i++] = nums[j];
            }
        }
        return i;
    }
}
