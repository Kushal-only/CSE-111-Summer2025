//Task 02
 class CheckingAccount extends Account { 
   static int count;
   public CheckingAccount() {
     super(0.0);
     count++;
   }
   public CheckingAccount(double b) {
     super(b);
     count++;
   }
 }