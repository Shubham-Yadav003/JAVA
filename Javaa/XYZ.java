//Method overloading
class Method{

public void add(int a, int b){
System.out.println(a+b);
}

public void add(float a, float b, float c , float d)
{
System.out.println(a+b+c+d);
}
public static void main(String[] args){
Method obj=new Method();
obj.add(1,2);
obj.add(1.1,2.2,3.3,4.4);
}}
 
