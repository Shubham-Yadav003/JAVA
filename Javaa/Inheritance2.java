//Inheritance !!
import java.util.Scanner;
class A{
int avalue;
public int getAvalue(){
return avalue;
}
}
class B extends A{
int bvalue;
public int getBvalue(){
return bvalue;
}
} 
class Inheritance2{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
B b=new B();
b.avalue=scanner.nextInt();
b.bvalue=scanner.nextInt();
System.out.println("a:"+b.getAvalue());
System.out.println("b:"+b.getBvalue());
}
}
