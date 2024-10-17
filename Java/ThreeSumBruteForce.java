import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ThreeSumBruteForce {

    List<List<Integer>> threeSum(int[] nums, int target){
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        for(int i=0; i<n-2; i++) {
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    if(nums[i] + nums[j] + nums[k] == target){
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        result.add(triplet);
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args){
        ThreeSumBruteForce obj = new ThreeSumBruteForce();
        int[] nums = {3, -1, 0, 1, 2, -1, -4, 2};
        int target = 5;

        List<List<Integer>> result = obj.threeSum(nums, target);
        System.out.println(result);
    }
}
