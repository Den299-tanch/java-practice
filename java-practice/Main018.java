import java.util.*;

class Member{
    int number;
    String name;
    
}


public class Main018 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Member> members = new ArrayList<>();
        
        
        for(int i = 0; i < n; i++){
            String ins = sc.next();
            
            if(ins.equals("make")){
                Member m = new Member();
                m.number = sc.nextInt();
                m.name = sc.next();
                members.add(m); 
            } else if(ins.equals("getnum")){
                int gnum = sc.nextInt();
                System.out.println(members.get(gnum - 1).number);
            } else if(ins.equals("getname")){
                int gname = sc.nextInt();
                System.out.println(members.get(gname - 1).name);
            }
        }
        
    }
}