package testing;

public class Demo {
	int result;
	public static int classint;
	void add(int int1,int int2){
		this.result =  int1+int2;
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo demo1 =  new Demo();
		Demo demo2 =  new Demo();
		demo1.add(5, 1);
		demo2.add(8, 1);

		System.out.println(demo1.result); //6
		System.out.println(demo2.result); //9
		
		classint = demo1.result;
		Demo.classint = demo2.result;

		System.out.println(demo1.classint);//9
		System.out.println(demo2.classint);//9
		Demo.classint =0;
		System.out.println(classint);//9
		System.out.println(demo1.classint);//9
		System.out.println(demo2.classint);//9
	}

}
