import java.util.*;


public class Main012 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int kirishima = 1;
        int paiza = 1;
        int count = 0;
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for(;;){
            
            if(kirishima > n){
                System.out.println(count);
                break;
            }
            
            kirishima = paiza * a + kirishima;
            paiza  = kirishima % b + paiza;
         
            count++;
               
        }
        
    }
}
