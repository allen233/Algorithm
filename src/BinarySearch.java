/**
 * 
 */
import java.util.Arrays;
/**
 * @author allen
 *
 */
public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[ ] args) {
		int[ ] arr = { 30,20,50,10,80,9,7,12,100,40,8};
		int searchWord = 20; // ��Ҫ���ҵ���
		//System.out.println(Arrays.toString(arr));
		Arrays.sort(arr); //���ַ�����֮ǰ��һ��Ҫ������Ԫ����������sort�������
		System.out.println(Arrays.toString(arr));
		System.out.println(searchWord+"Ԫ�ص������� "+binarySearch(arr,searchWord));
		}
		public static int binarySearch(int[ ] array, int value){
		int low = 0;
		int high = array.length - 1;
		while(low <= high){
		int middle = (low + high) / 2;
		if(value == array[middle]){
		return middle; //���ز�ѯ��������λ��
		}
		if(value > array[middle]){
		low = middle + 1;
		}
		if(value < array[middle]){
		high = middle - 1;
		}
		}
		return -1; //����ѭ����ϣ�˵��δ�ҵ�������-1
		}

}
