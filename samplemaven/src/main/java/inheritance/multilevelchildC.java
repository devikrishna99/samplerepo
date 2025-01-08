package inheritance;

public class multilevelchildC extends multilevelparent_B {

	public static void main(String[] args) {
		multilevelchildC obj = new multilevelchildC();
		obj.display();
		obj.display1();
		obj.display2();

	}
public void display2()
{
	System.out.println("Hello World");

}
}