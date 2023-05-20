import java.util.ArrayList;
import java.util.List;

public class pascalmemoization {
	public List<List<Integer>> generate(int numRows) {
	 List<List<Integer>> res = new ArrayList();
     List<Integer> nums;
	 for(int i = 0; i < numRows ; i++) {
		 nums = new ArrayList();
	for(int j = 0; j <= i ; j++)  {
    if( j == 0 || (j == i)){
		     nums.add(1);
 }else{
	if( (i - 1 > 0) && (j - 1 >= 0)){
 nums.add(res.get(i - 1).get(j) + res.get(i - 1).get(j - 1));
       }
     }
    }
   res.add(nums);
	 }
	 return res;
	 }
	}


