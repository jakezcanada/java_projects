
public interface test {
	void flying();
}

class Airplane implements test{
	public void flying(){
		System.out.println("I am an airplane");
	}
}

class Bird implements test{
	public void flying(){
		System.out.println("I am a bird");
	}
	public void eat(){
		System.out.println("Bird can eat");
	}
}

class Print{
	public static void main(){
		Airplane fo = new Airplane();
		test fp = new Bird();
		fp.flying();
		((Bird)fp).eat();
	}
}