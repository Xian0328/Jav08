import java.util.*;
class CTest{
	void test(int n) {
		if (n==0) {
			System.out.println("���Ƭ�0");
		}
		if(n%2==0) {
			System.out.println("���Ƭ�����");
		}
		else {
			System.out.println("���Ƭ��_��");
		}
	}
}
public class class07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		CTest t=new CTest();
		t.test(n);
	}

}
