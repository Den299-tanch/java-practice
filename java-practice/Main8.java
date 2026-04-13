import java.util.*;


public class Main8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String[] name = new String[n];
        int[] cash = new int[n];
        
        for(int i = 0; i < n; i++){
            name[i] = sc.next();
            cash[i] = sc.nextInt();
        }
        
        String ans = sc.next();
        
        for(int i = 0; i < n; i++){
            if(name[i].equals(ans)){
                System.out.println(cash[i]);
            }
        }
    }
}

