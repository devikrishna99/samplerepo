package inheritance;

public class hierarchialchild2 extends hierarchialparent{

	public static void main(String[] args) {
		hierarchialchild2 obj1 = new hierarchialchild2();
		obj1.display();
		obj1.display2();

	}
public void display2() {
	System.out.println("Java is robust");
}
}
