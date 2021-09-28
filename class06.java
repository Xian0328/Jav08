class CCircle{
	double pi=3.14;
	double radius;
	void show_periphery() {
		System.out.println("periphery="+2*this.pi*this.radius);     //(c)
	}
}
public class class06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCircle cirl;                //(a)
		cirl=new CCircle();
		cirl.radius=3.0;             //(b)
		cirl.show_periphery();       //(d)
	}

}
