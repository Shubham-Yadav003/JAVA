//overriding
class animal{
public animal(){
System.out.println("Animal is created");
}
public void eat(){
System.out.println("eating something");
}}
class dog extends animal{
public dog(){
super();
System.out.println("dog is created");
}
public void eat(){
System.out.println("eating bread");
}
public void bark(){
System.out.println("barking");
}
public void work(){
super.eat();
eat();
bark();
}
}
public class Exam{
public static void main(String[] args){
dog bbu=new dog();
bbu.work();
}}