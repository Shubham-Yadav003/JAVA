abstract class phone{
abstract void phoneOn();
}
class neww extends phone{
void phoneOn(){
System.out.println("Why are you opening the phone");
}}

class new2 extends phone{
void phoneOn(){
System.out.println("do not open it");
}}

class new3 extends phone{
void phoneOn(){
System.out.println("Thik hai khol le bhai");
}}


class Hello{
public static void main(String[] args){
neww obj=new neww();
obj.phoneOn();

new2 objj=new new2();
objj.phoneOn();

new3 objjj = new new3();
objjj.phoneOn();
}
} 
 

