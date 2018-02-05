package learn_package;
class Cat{
	
	
}

public class Puppy {
 int puppyAge;
 public Puppy(String name){
	 System.out.println("(String Method)name_of_the_dog:" + name);
 }
 
 public Puppy(int age){
	 System.out.println("Initla method Int");
 }
 public void setAge(int age){
	 puppyAge = age;
 }
 public int getAge(){
	 System.out.println("Age_of_the_dog:" + puppyAge);
	 return puppyAge;
 }
 public static void main(String[] args){
	 Puppy p1 = new Puppy(2);
	 Puppy myPuppy = new Puppy("tommy");
	 myPuppy.setAge(2);
	 myPuppy.getAge();
	 System.out.println("value_of_variable:" + myPuppy.puppyAge);
 }
}
