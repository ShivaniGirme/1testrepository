import java.util.Arrays;
import java.util.Scanner;
//Enter The Number Of Elements :
//5
//[0, 1, 1, 2, 3]
//Enter The Number Of Elements :
//5
//[0, 1, 1, 2, 3]// Enter The Number Of Elements :
//5
//[0, 1, 1, 2, 3]// Enter The Number Of Elements :
//5
//[0, 1, 1, 2, 3]// Enter The Number Of Elements :
//5
//[0, 1, 1, 2, 3]// Enter The Number Of Elements :
//5
//[0, 1, 1, 2, 3]// Enter The Number Of Elements :
//5
//[0, 1, 1, 2, 3]// Enter The Number Of Elements :
//5
//[0, 1, 1, 2, 3]// Enter The Number Of Elements :
//5
//[0, 1, 1, 2, 3]
class Fibonacci{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number Of Elements : ");
		int no=sc.nextInt();
		int fibo[]=new int[no];
		 fibo[0]=0;
		 fibo[1]=1;
		for (int i=2; i<fibo.length; i++) {
			fibo[i]=fibo[i-1]+fibo[i-2];
		}
		System.out.println(Arrays.toString(fibo));
	}
}
// Enter The Number Of Elements :
// 5
// [0, 1, 1, 2, 3]
//Enter The Number Of Elements :
//5
//[0, 1, 1, 2, 3]// Enter The Number Of Elements :
//5
//[0, 1, 1, 2, 3]// Enter The Number Of Elements :
//5
//[0, 1, 1, 2, 3]// Enter The Number Of Elements :
//5
//[0, 1, 1, 2, 3]// Enter The Number Of Elements :
//5
//[0, 1, 1, 2, 3]// Enter The Number Of Elements :
//5
//[0, 1, 1, 2, 3]// Enter The Number Of Elements :
//5
//[0, 1, 1, 2, 3]// Enter The Number Of Elements :
//5
//[0, 1, 1, 2, 3]