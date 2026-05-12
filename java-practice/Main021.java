import java.util.*;

class Customer{
    
    protected int amount;
    
    public Customer(){
        this.amount = 0;
    }
    
    public void takeFood(int price){
        amount += price;
    }
    
    public void takeSoftdrink(int price){
        amount += price;
    }
    
    public void takeAlcohol(int price){}
    
    public void takeAlcohol(){
        takeAlcohol(500);
    }
    
    public void finish(){
        System.out.println(this.amount);
    }
    
}

class Adult extends Customer{
    
    boolean drunk;
    
    public Adult(){
        super();
        this.drunk = false;
    }
    
    @Override
    public void takeAlcohol(int price){
        drunk = true;
        amount += price;
    }
    
    @Override
    public void takeFood(int price){
        if(drunk){
            price -= 200;
        }
        super.takeFood(price);
    }
    
}

public class Main021{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Customer> customers = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            int age = sc.nextInt();
            if(age < 20){
                customers.add(new Customer());
            } else{
                customers.add(new Adult());
            }
        } 
        
        int count = 0;
        
        for(int i = 0; i < k; i++){
            int index = sc.nextInt() - 1;
            String order = sc.next();
            Customer cus = customers.get(index);
            
            if(order.equals("0")){
                cus.takeAlcohol();
            } else if(order.equals("A")){
                cus.finish();
                count++;
            } else{
                int price = sc.nextInt();
                
                if(order.equals("food")){
                    cus.takeFood(price);
                }
                
                if(order.equals("softdrink")){
                    cus.takeSoftdrink(price);
                }
                
                if(order.equals("alcohol")){
                    cus.takeAlcohol(price);
                }
                
            }
        }
        
        sc.close();
        System.out.println(count);
        
    }
}
