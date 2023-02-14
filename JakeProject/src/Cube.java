
public class Cube {
	int size;
	String color;
	
	public Cube(int s, String co){
		size = s;
		color = co;
	}
	public Cube(int s){
		size = s;
		color = "Black";
	}
	public Cube(){
		size = 1;
		color = "Black";
	}
	int findSurfaceArea(){
		int oneFace = size*size;
		return 6*oneFace;
	}
	public static void main(String[] args) {
		Cube a = new Cube(2,"Yellow");
		Cube b = new Cube(3,"Red");
		Cube c = new Cube();
		System.out.println(a.findSurfaceArea() + " " + b.findSurfaceArea() + " " + c.findSurfaceArea());
	}

}
