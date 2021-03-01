
public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=0;i<5;i++){
	System.out.println("welcome to java!");//1.1显示welcome to java!五次
	}
System.out.println("---------------------");
int starLine = 9;//1.2直线星
for (int i1 = 0; i1 < starLine; i1++) {
	System.out.println("*");
}
System.out.println("---------------------");
int starLine2=11;   //1.3阶梯星
for(int i=1;i<=starLine2;i++) {
	   for(int j=1;j<=i;j++) {
		   System.out.print("*");
	   }
	   System.out.print("\n");//使用System.out.println()这是换一行。 第二种:使用System.out.print("\n");这也是换一行
	   }
System.out.println("---------------------");
	
int starLine3 = 9;   //改变starLine的值输出不同大小的效果//1.4金字塔星
for (int i = 1; i <= starLine; i++) {
	// for循环输出空格
	for (int j = 1; j <= starLine - i; j++) {//第一次循环9个空格，第二次循环8个空格以此类推
		System.out.print(" ");
	}
	// for循环输出*
	for (int k = 1; k <= 2 * i - 1; k++) {//第一次循环1个星，第二次循环3个星以此类推
		System.out.print("*");
	}
	System.out.println();
}


System.out.println("---------------------");
	}
	
}
