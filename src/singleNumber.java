//������ֻ����һ�ε�Ԫ��
import java.util.Arrays;

public class singleNumber 
{
	public static void main(String[] args) {
		int[] nums = {4,1,2,1,2};
		//System.out.println("������ֻ����һ�ε�Ԫ����:"+singlenumber1(nums));
		System.out.println("������ֻ����һ�ε�Ԫ����:"+singlenumber2(nums));
	}
	static int singlenumber2(int[] nums) {
        int ans = nums[0];
        for(int i=1,len=nums.length;i<len;i++)
            ans ^= nums[i];
        return ans;
	}

}
