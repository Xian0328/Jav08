class CCalculator
{
	int a;
	int b;
	int c;
	void set_value(int x,int y,int z)    //(a)
	{
		a=x;
		b=y;
		c=z;
	}
	void show()                          //(b)
	{
		System.out.print("�T�Ƥ��M=");
		this.add();
		System.out.print("a-b-c=");
		this.sub();
		System.out.print("�T�Ƥ����n=");
		this.mul();
		System.out.print("�T�Ƥ�������=");
		this.avg();
	}
	void add()             //(c)
	{
		int add=a+b+c;
		System.out.println(add);
	}
	void sub()             //(d)
	{
		int sub=a-b-c;
		System.out.println(sub);
	}
	void mul()             //(e)
	{
		int mul=a-b-c;
		System.out.println(mul);
	}
	void avg()              //(f)
	{
		double avg=(a+b+c)/3.0;
		System.out.println(avg);
	}
}
public class class09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCalculator obj=new CCalculator();      //(a)
		obj.set_value(25, 3, 7);                //(a)
		obj.show();
	}

}
