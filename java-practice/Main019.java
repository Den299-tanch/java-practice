import java.util.*;

class Customer{
    
    protected int total = 0;
    protected boolean discount = false;
    
    public void order(String menu, int price){
        if(menu.equals("alcohol")){
            discount = true;
        }
        
        int finalprice = price;
        
        if(discount){
            if(menu.equals("food")){
                finalprice = price - 200;
            }
        }
        this.total += finalprice;
    }
    
    public int getTotal(){
        return total;
    }
}

class ChildCustomer extends Customer{
    
    @Override
    public void order(String menu, int price){
        if(menu.equals("alcohol")){
            return;
        }
        
        super.order(menu, price);
    }

}

public class Main019{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Customer[] cusList = new Customer[n];
        
        for(int i = 0; i < n; i++){
            int age = sc.nextInt();
            if(age < 20){
                cusList[i] = new ChildCustomer();
            } else {
                cusList[i] = new Customer();
            }
        }
        
        for(int i = 0; i < k; i++){
            int num = sc.nextInt();
            String menu = sc.next();
            int price = sc.nextInt();
            cusList[num - 1].order(menu, price);
        }
        
        for(int i = 0; i < n; i++){
            System.out.println(cusList[i].getTotal());
        }
        
    }
}
