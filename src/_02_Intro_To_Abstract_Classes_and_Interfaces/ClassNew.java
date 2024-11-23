package _02_Intro_To_Abstract_Classes_and_Interfaces;

public class ClassNew extends AbstractClassDemo {
	int num;

	public ClassNew(int n) {
		num = n;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void abstractDemo() {
		System.out.println("yay!");
		// TODO Auto-generated method stub

	}

	@Override
	public int abstractNumDemo() {
		// TODO Auto-generated method stub
		return num;
	}

}
