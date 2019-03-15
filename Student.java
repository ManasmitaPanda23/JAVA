package Arrays;


public class Student 
{
	int id;
	String name;
	double per;
	public Student(int id,String name,double per) 
	{
		this.id=id;
		this.name=name;
		this.per=per;
	}
		void print() 
		{
			System.out.println("id is"+id);
			System.out.println("name is"+name);
			System.out.println("per is"+per);
	    }

}


