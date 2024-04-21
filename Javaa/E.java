class Base{
Base(){
System.out.println("I am base class constructor");
Base(int a){
System.out.println("called by super:"+a);
}
}}

class Derived extends Base{

Derived(){
super(3);
System.out.println("I am derived class constructor");
}
}

class E{
public static void main(String[] args){
Derived D=new Derived();

}
}