import java.util.Arrays;

//Ħ��ͶƱ�㷨
public class BoyerMooreVoting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[] nums={2,2,1,1,1,2,2};
 System.out.println("����"+Arrays.toString(nums)+"���ִ�������������������"+majorityElement(nums));//Arrays.toString�ǰ����������Ϊ�ַ��������ٶ�
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
