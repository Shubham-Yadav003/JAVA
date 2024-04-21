class Error2{
public static void main(String[] args){



String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred!");
        }

int a=5;
int b=0;
try{
int c=a/b;}

catch( ArithmeticException   f){
System.out.println(f);
}

int[] arr = new int[3];
        try {
            System.out.println(arr[5]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException occurred!");
        }

System.out.println("hip hip hurray");
}
}



