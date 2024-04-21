//Override !!
import java.util.Scanner;
class Person{
String name;
int age;

public void get_info(){
Scanner abc = new Scanner(System.in);
name = abc.nextLine();
age=abc.nextInt();
}

public void display_info(){
Scanner xyz = new Scanner(System.in);
System.out.println("name:"+name);
System.out.println("age:"+age);
}

}
class student extends Person{
int roll;
public void get_info(){
super.get_info();
Scanner m= new Scanner(System.in);
roll=m.nextInt();
}

public void display_info(){
super.display_info();
System.out.println("roll:"+roll);
}
}

public class Instance{
public static void main(String[] args){
student obj = new student();
obj.get_info();
obj.display_info();
}
}
