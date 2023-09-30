import java.util.*;

class _1TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] { map.get(target - nums[i]), i };
            }
            map.put(nums[i], i);
        }
        return nums;
    }

    public String print(int[] arr) {
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        _1TwoSum obj = new _1TwoSum();
        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 6;
        int[] ans = obj.twoSum(arr, target);
        System.out.println(obj.print(ans));
    }
}
