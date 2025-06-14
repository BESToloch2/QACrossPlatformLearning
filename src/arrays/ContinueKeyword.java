package arrays;

public class ContinueKeyword {
    public static void main(String[] args) {

        int[]nums={1,53,6734,-6,234,-255,99};

        for (int i=0; i<nums.length;i++){

            if (nums[i]%2==0) continue;

            System.out.println(nums[i]);

        }




    }
}
