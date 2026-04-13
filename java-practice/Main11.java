import java.util.*;


public class Main11 {
    public static void main(String[] args) {
 
        int i = 10000;
 
        while(true){
            
            if(i % 13 == 0){
                System.out.println(i);
                break;
            }
            
            i++;
        }
    }
}