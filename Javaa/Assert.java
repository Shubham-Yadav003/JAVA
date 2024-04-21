class Assertion{
 public static boolean checkAge(int age){
assert(age>60 && age<110);
if(age>60){
return true;
}
else{
return false;
}
}
}

public class Assert{
public static void main(String[] args){
Assertion db = new Assertion();
boolean result=db.checkAge(100);
System.out.println(result);
}
}


