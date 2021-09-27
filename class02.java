class Cbbb{
	double x;
	double y;
}
public class class02 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cbbb obj1;       //(a)
		Cbbb obj2;
		Cbbb avg;
		obj1=new Cbbb();
		obj2=new Cbbb();
		avg=new Cbbb();
		obj1.x=5.2; obj1.y=3.9;   //(b)
		obj2.x=6.5; obj2.y=4.6;   //(c)
		avg.x=(obj1.x+obj2.x)/2;  //(d)
		avg.y=(obj1.y+obj2.y)/2;  //(e)
		System.out.println("obj1:"+obj1.x+","+obj1.y);   //(f)
		System.out.println("obj2:"+obj2.x+","+obj2.y);
		System.out.println("avg:"+avg.x+","+avg.y);
	}

}
