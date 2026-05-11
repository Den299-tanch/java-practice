import java.util.*;


public class Main006 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] line = new int[n];
        
        for(int i = 0; i < n; i++){
            line[i] = sc.nextInt();
            
        }
        
        Arrays.sort(line);
        
        for(int i = n - 1; i >= 0 ; i--){
            System.out.println(line[i]);
        }
        
    }
}

