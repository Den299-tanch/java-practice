import java.util.*;


public class Main014 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            String name = sc.next();
            int old = sc.nextInt();
            String birth = sc.next();
            String area = sc.next();
            
            System.out.println("User{");
            System.out.println("nickname : " + name);
            System.out.println("old : " + old);
            System.out.println("birth : " + birth);
            System.out.println("state : " + area);
            System.out.println("}");
            
        }
    }
}

