import java.util.*;


public class Main002 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] list = new int[n];
        
        for(int i = 0; i < n; i++){
            
            int p = sc.nextInt();
            list[i] = p;
            
            // list[i] = sc.nextInt();
            
        }
        
        int k = sc.nextInt();
        for(int i = 0; i < list.length; i++){
            if(list[i] == k) {
                System.out.println(i+1);
                break;
            }
        }
    }
}


