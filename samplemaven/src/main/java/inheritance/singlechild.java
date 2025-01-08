package inheritance;

public class singlechild extends singleparent {

	public static void main(String[] args) {
		singlechild obj = new singlechild();
		obj.display();
		obj.display1();

	}
public void display1()
{
	System.out.println("Hello All");
}
}
