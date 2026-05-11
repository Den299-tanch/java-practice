import java.util.*;


public class Main007 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String[] ab = new String[n];
        
        for(int i = 0; i < n; i++){
            
            String ringo = sc.next();
            String banana = sc.next();
            
            if(ringo.length() == 1){
                ringo = "0" + ringo;
            }
            
            if(banana.length() == 1){
                banana = "0" + banana;
            }
            
            ab[i] = ringo + banana;
        }
        
        Arrays.sort(ab, Collections.reverseOrder());
        
        for(int i = 0; i < n; i++){
            System.out.print(Integer.parseInt(ab[i].substring(0, 2)) + " ");
            System.out.println(Integer.parseInt(ab[i].substring(2, 4)));
        }
        
        
    }
}


