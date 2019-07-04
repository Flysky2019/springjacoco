package test;

public class JacocoTest {

    public int maxNum(int... nums) {
        if (nums.length == 0) {
            throw new IllegalArgumentException("参数异常！");
        }
        int maxval = nums[0];
        for (int i : nums) {
            if (maxval >= i) {
                continue;
            }
            maxval = i;
        }
        return maxval;
    }

    public String print(int val) {
        if (val < 10) {
            return "0" + val;
        }
        return String.valueOf(val);
    }
}
