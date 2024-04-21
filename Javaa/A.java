class static {
public static void main(String[] args){
A.staticfields=3;
A obj = new A(2);
A obj = new A(3);
System.out.println("static one is:"+A.staticfields);
}
}
class A{
public static int staticfields;
int a;
public A(int a){
this.a=a;
System.out.println(a);
}public A(){
System.out.println("Default Constructor");
}
} 
