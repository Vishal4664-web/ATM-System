import java.util.Scanner;
class ATM {
    float Balance;
    int PIN = 5674;

    public void Checkpin(){
        System.out.println("enter your pin");
        Scanner sc = new Scanner(System.in) ;
        int enteredpin = sc.nextInt();
        if(enteredpin==PIN){
            menu();
        }
        else{
            System.out.println("Enter a valid number");
        }
    }
    public void menu(){
       System.out.println("Enter your choice:");
       System.out.println("1. Check your AC Balence");
       System.out.println("2. Withdraw Money");
       System.out.println("3. Deposite money");
       System.out.println("4. Exit");

       Scanner sc = new Scanner(System.in);
       int opt = sc.nextInt(); 

       if(opt == 1){
        checkbalance();
       }
       else if(opt == 2){
        withdrawmoney();
       }
       else if(opt == 3){
        depositmoney();
       }
       else if(opt == 4)
       {
            return;
       }
       else{
        System.out.println("enter a valid choice");
       }

    }
    public void checkbalance(){
        System.out.println("Balance:" + Balance);
        menu();
    }
    public void withdrawmoney(){
        System.out.println("Enter amount to withdraw");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficiant balance");

        }
        else{
            Balance =Balance - amount;
            System.out.println("money deposite sucessfully");
        }
        menu();
    }
    public void depositmoney(){
        System.out.println("Enter the amount");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money deposited sucesfully");
        menu();
    }
      
}
class project {
    public static void main(String args[]){
    ATM obj = new ATM();
    obj.Checkpin();  
    }
}
