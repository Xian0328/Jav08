//hw8_12
class CWin{
	int width;
	int height;
	String name;
	
	void setW(int w)//�]�w�e�ת����
	{
		width=w;
	}
	void setH(int h)//�]�w���ת����
	{
		height=h;
	}
	void setName(String s)//�]�w�����W��
	{
		name=s;
	}
	void setWindowx(int w,int h,String s)
	{
		width=w;
		height=h;
		name=s;
	}
	public void show() {
		System.out.println("Name="+name);
		System.out.println("W="+width+", H="+height);
	}
}
public class class12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CWin cw=new CWin();
		cw.setName("MY Windows");
		cw.setW(5);
		cw.setH(3);
		cw.setWindowx(5, 3, "My Windows");
		cw.show();
	}

}
