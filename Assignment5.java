class Assignment5{
    public static void main(String args[]){
        
        System.out.println("Enter the value of V: ");
        int V=new java.util.Scanner(System.in).nextInt();

        System.out.println("Enter the value of W: ");
        int W=new java.util.Scanner(System.in).nextInt();

        if((W%2!=0) || (W<=V) || (W<2))
            System.out.println("Invalid Input");
        else
        {
        int temp=(W-(2*V))/2;
        System.out.println("FW="+temp+" TW="+(V-temp));

        }
    }
}