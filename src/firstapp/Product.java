package firstapp;

public class Product {
   String name;
   int pid, stks, tep; 
   double price;
   
   public void addProduct(int pd, String nm,  double pr, int stk, int temp) {
    this.pid = pd;
    this.name = nm;
    this.price = pr;
    this.stks = stk;
    this.tep = temp;
}
   
   public void viewProduct(){
       double total = this.price * this.tep;
       String Status = (this.stks > 0) ? "Available" : "Out of Stock";
       
       
       System.out.printf("%-10d %-10s %-10.2f %-10d %-15s %-10.2f\n", this.pid, this.name, this.price, this.stks, Status, total);
   }
}
