package intermediate_19_Oops1;

public class Oops1 {

	public static void main(String[] args) {
		Student s1 = new Student();
	       s1.age = 10;
	       s1.name = "A";

	       Student s2 = new Student();

	       String tempName = s1.name;
	       s1.name = s2.name;
	       s2.name = tempName;

	       s1.display();

	}

}//main class

 class Student {
	   int age;
	   String name;

	   void display(){
	       System.out.println("My name is " + this.name + ". I am "  + this.age + " years old");
	   }
	   
	   void sayHello(String name){
	       System.out.println(this.name + " says hello to " + name);
	   }


}