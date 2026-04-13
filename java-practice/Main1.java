import java.util.*;


public class Main1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            int p = sc.nextInt();
            list.add(p);
        }
        
        if(list.contains(7)){
              System.out.println("YES");
        }else {
            System.out.println("NO");
        }
        
    }
}
