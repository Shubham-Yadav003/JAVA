class Throww{
    public static void main(String[] args){
        int a=5;
        int b=0;
        try{
            try{
                int c=a/b;
            } catch(ArithmeticException e){
                System.out.println(e);
            }
            throw new ArithmeticException("Arithmetic");
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Resolved");
        }
    }
}
