import java.util.*;

class Customer{
    
    protected int amount;
    
    public Customer(){
        amount = 0;
    }
    
    public int getAmount(){
        return amount;
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
    
}

class Adult extends Customer{
    
    protected boolean drunk = false;
    
    public Adult(){
        super();
    }
    
    @Override
    public void takeFood(int price){
        if(drunk){
            price -= 200;
        }
        super.takeFood(price);
    }
    
    @Override
    public void takeAlcohol(int price){
        drunk = true;
        amount += price;
    }
    
}

public class Main020{
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
        
        for(int i = 0; i < k; i++){
            int index = sc.nextInt() - 1;
            String s = sc.next();
            
            if(s.equals("0")){
                customers.get(index).takeAlcohol();
            } else{
                int price = sc.nextInt();
                if(s.equals("food")){
                    customers.get(index).takeFood(price);
                }
                
                if(s.equals("softdrink")){
                    customers.get(index).takeSoftdrink(price);
                }
                
                if(s.equals("alcohol")){
                    customers.get(index).takeAlcohol(price);
                }
            }
        }
        
        for(Customer a : customers){
            System.out.println(a.getAmount());
        }
        
    }
}
