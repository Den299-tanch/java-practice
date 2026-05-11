import java.util.*;


public class Main015 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String[] name = new String[n];
        int[] age = new int[n];
        String[] birth = new String[n];
        String[] area = new String[n];
        
        for(int i = 0; i < n; i++){
            
            name[i] = sc.next();
            age[i] = sc.nextInt();
            birth[i] = sc.next();
            area[i] = sc.next();
            
        }
        
        int ans = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            if(age[i] == ans){
                System.out.println(name[i]);
            }
        }
        
    }
}
