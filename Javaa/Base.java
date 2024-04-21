class Base{
Base(){
System.out.println("I am base class constructor");
}}

class Derived extends Base{
Derived(){
System.out.println("I am derived class constructor");
}}

class E{
public static void main(String[] args){
Derived D=new Derived();

}}