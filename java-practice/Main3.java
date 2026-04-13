import java.util.*;


public class Main3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String[] list = new String[n];
        for(int i = 0; i < n; i++){
            list[i] = sc.next();
        }
        
        int p = sc.nextInt();
        String[] list2 = new String[p];
        for(int i = 0; i < p; i++){
            list2[i] = sc.next();
        }
        
        for(int a = 0; a  < list.length; a++){
            for(int i = 0; i < list2.length; i++){
                
                if(list2[i].contains(list[a])){
                    System.out.println("YES");
                } else {System.out.println("NO");
                }
                
            }
        }
        
    }
}

