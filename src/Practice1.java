
public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=0;i<5;i++){
	System.out.println("welcome to java!");//1.1��ʾwelcome to java!���
	}
System.out.println("---------------------");
int starLine = 9;//1.2ֱ����
for (int i1 = 0; i1 < starLine; i1++) {
	System.out.println("*");
}
System.out.println("---------------------");
int starLine2=11;   //1.3������
for(int i=1;i<=starLine2;i++) {
	   for(int j=1;j<=i;j++) {
		   System.out.print("*");
	   }
	   System.out.print("\n");//ʹ��System.out.println()���ǻ�һ�С� �ڶ���:ʹ��System.out.print("\n");��Ҳ�ǻ�һ��
	   }
System.out.println("---------------------");
	
int starLine3 = 9;   //�ı�starLine��ֵ�����ͬ��С��Ч��//1.4��������
for (int i = 1; i <= starLine; i++) {
	// forѭ������ո�
	for (int j = 1; j <= starLine - i; j++) {//��һ��ѭ��9���ո񣬵ڶ���ѭ��8���ո��Դ�����
		System.out.print(" ");
	}
	// forѭ�����*
	for (int k = 1; k <= 2 * i - 1; k++) {//��һ��ѭ��1���ǣ��ڶ���ѭ��3�����Դ�����
		System.out.print("*");
	}
	System.out.println();
}


System.out.println("---------------------");
	}
	
}
