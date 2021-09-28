class CSphere{
	private double pi=3.14;
	private int x;       //��ߪ�x�y��
	private int y;       //��ߪ�y�y��
	private int z;       //��ߪ�z�y��
	private int radius;  //��ߪ��b�|
	void setLocation(int a,int b,int c)//(a) 
	{
		x=a;
		y=b;
		z=c;
	}
	void setRadius(int r)//(b)
	{
		radius=r;
	}
	double surfaceArea()//(c)
	{
		return 4*pi*radius*radius;
		//return area;
	}
	double volume()//(d)
	{
		return 4*pi*radius*radius*radius/3;
		//return V;
	}
	void showCenter()//(e)
	{
		System.out.println("��߮y��="+x+","+y+","+z);
	}
}
public class class16 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		CSphere circle=new CSphere();
		circle.setLocation(3, 4, 5);
		circle.setRadius(1);
		circle.surfaceArea();
		circle.volume();
		circle.showCenter();
	}

}
