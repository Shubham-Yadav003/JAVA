class abc{
static void display(){
System.out.println("memebr of  class");
}
static class abc2{
void func(){
System.out.println("NONSTATIC Member");
display();
}
}
}

 
class original{
public static void main(String[] args){
abc.abc2 xyz = new abc.abc2();
xyz.func();
}
}