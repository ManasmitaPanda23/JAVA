package Assignment;

public class Student 
{
          int id;
          String name;
          double marks;
 
  public Student(int id,String name,double marks) 
  {
	      this.id=id;
	      this.name=name;
	      this.marks=marks;
  }
  void print() 
  {
	  System.out.println("id="+id);
	  System.out.println("name="+name);
	  System.out.println("marks"+marks);
  }
}
