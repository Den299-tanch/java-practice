import java.util.*;


public class Main5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        
        int count = 0;
        
        for (int i = 0; i < n; i++){
            count = 0;
            for(int t = 0; t < m; t++){
                
                int a = sc.nextInt();  
                if(a == k){
                    count += 1;
                }
            }

            System.out.println(count);
        }
    }
}
