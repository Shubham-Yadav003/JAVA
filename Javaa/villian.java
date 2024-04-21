import java.util.Scanner; 
interface square{
int area(int s);
}
public class villian{
public  static void main(String[] args){
Scanner obj=new Scanner(System.in);
square answer=(s)-> s*s*s;
int s=obj.nextInt();
int result=answer.area(s);
System.out.println("volume of cube is:"+result);
}
} 





























