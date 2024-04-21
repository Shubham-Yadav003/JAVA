// single inheritance
import java.util.Scanner;
class account{
String accountname;
double balance;
public void inputDetails(){
Scanner scanner = new Scanner(System.in);
accountname=scanner.nextLine();
}
public void displayBalance(){
System.out.println("current balance:"+balance);
}}
class transaction extends account{
double amount;
public void inputAmount(){
Scanner scanner=new Scanner(System.in);
System.out.println("enter trqansaction amount");
amount=scanner.nextInt();
}
public void perform(){
balance+=amount;
System.out.println("trqansaction succesfull");
displayBalance();
}}
public class Banking{
public static void main(String[] args){
transaction old=new transaction();
old.inputDetails();
old.displayBalance();
old.inputAmount();
old.perform();
}}