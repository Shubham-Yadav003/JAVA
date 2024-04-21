class  Monkey{
  int abc =4;
  int def=5;
 void display(){
   abc = def;
System.out.println("The new value is :"+abc);
}
}
public class Final{
public static void  main(String[] args){
Monkey ob = new Monkey();
ob.display();
}
}