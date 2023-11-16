class Assignment2{
    public static void main(String args[]){
        int X=0,Y=0;
        
        System.out.println("Enter the number of turns: ");
        int turn=new java.util.Scanner(System.in).nextInt();

        for(int i=1;i<=turn;i++)
        {
            switch(i%5)
            {
                case 0:
                case 1:   X+=(10*i);
                          break;
                case 2:   Y+=(10*i);
                          break;
                case 3:   X-=(10*i);
                          break;
                case 4:   Y-=(10*i);
                          

            }
        }
        System.out.println("X = "+X+" Y = "+Y);
    }
}