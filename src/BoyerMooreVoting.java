import java.util.Arrays;

//摩尔投票算法
public class BoyerMooreVoting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[] nums={2,2,1,1,1,2,2};
 System.out.println("数组"+Arrays.toString(nums)+"出现次数超过半数的数字是"+majorityElement(nums));//Arrays.toString是把数组输出作为字符串，待百度
	}
	static int majorityElement(int[] nums){
	int cand_num=nums[0],count=1;
	for(int i=1;i<nums.length;i++){
		if(cand_num==nums[i]){
			count++;
		}else if(count==0){
			cand_num=nums[i];
			count=1;
		}
	}return cand_num;
}
	
	
	
	
}
