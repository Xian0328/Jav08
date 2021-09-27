class CBox1{
	
	int length;
	int width;
	int height;
	void volume() {
		System.out.println("Åé¿n="+length*width*height);
	}    //(b)
	void surfaceArea() {
		System.out.println("ªí­±¿n="+(length*width*2+width*height*2+height*length*2));
	}    //(c)
	void showData() {
		System.out.println(length+","+width+","+height);
	}    //(d)
	void showAll() {
		System.out.println(length+","+width+","+height);
		surfaceArea();
		volume();
	}    //(e)
}
public class class05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CBox1 box;             //(a)
		box=new CBox1();
		box.length=1;
		box.width=1;
		box.height=1;
		box.showData();
		box.showAll();
	}

}
