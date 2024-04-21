import java.io.*;
public class Character{
public static void main(String[] args){
try{
FileWriter writer = new FileWriter("output.txt");
writer.write("Hello,this is a character stream example ");
writer.close();
FileReader reader = new FileReader("output.txt");
int character;
while ((character = reader.read()) !=-1){
System.out.print((char)character);
}

reader.close();
}
catch(IOException e){
System.out.println("An error occured:"+e.getMessage());
}
}
}