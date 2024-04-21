// use of super keyword in Inheritance
import java.util.Scanner;
class calculation{
public int num1, num2;
public  calculation(int num1, int num2){
this.num1=num1;
this.num2=num2;
}
public int add(){
return num1+num2;
}
}
class my_calculation extends calculation{
//public my_calculation(int num1, int num2){
//super(num1,num2);
//}
public int multiplication(int num1,int num2){
return num1*num2;
}
}
public class Maincalc{
public static void main(String[] args){
Scanner obj = new Scanner(System.in);
int num1=obj.nextInt();
int num2=obj.nextInt();
my_calculation obj2=new my_calculation(int num1, int num2);
int addition= obj2.add();
int multiplication=obj2.multiplication();
System.out.println("addition:"+addition);
System.out.println("multi:"+multiplication);
}}

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               //