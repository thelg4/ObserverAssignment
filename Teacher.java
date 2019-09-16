
public class Teacher implements Observer {

	Subject watchman;
	
	public Teacher(Subject watchman) {
		this.watchman = watchman;
		watchman.registerObserver(this);
	}
	
	public void update(int warning)	{
		if (warning == 1)	{
			System.out.println("Teacher: Helps get every kid home safe");
		} else if (warning == 2)	{
			System.out.println("Teacher: Brings all students to the underground shelter");
		}
	}
}
