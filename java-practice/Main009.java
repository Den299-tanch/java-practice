import java.util.*;


public class Main009 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String[] name = new String[n];
        Map<String, Integer> calc = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            name[i] = sc.next();
        }
        
        int t = sc.nextInt();
        
        for(int i = 0; i < t; i++){
            
            String a = sc.next();
            Integer b = sc.nextInt();
            
            calc.put(a, calc.getOrDefault(a, 0) + b);
        }
        
        String ans = sc.next();

        System.out.println(calc.getOrDefault(ans, 0));

    }
}
