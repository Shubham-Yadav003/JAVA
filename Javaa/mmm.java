class A{
private int a=5;
private int b=6;
void display(){
System.out.println("result:"+ (a+b));
}

public class B{
void display1(){
System.out.println("hello world!");
}
}
}

class mmm{
public static void main(String[] args){
A.B obj = new A.new B();
obj.display();
obj.display1();
}
}