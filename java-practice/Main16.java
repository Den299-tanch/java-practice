import java.util.*;

class Students{
    String name;
    int old;
    String birth;
    String state;
}

public class Main16{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Students[] student = new Students[n];
        
        for(int i = 0; i < n; i++){
            student[i] = new Students();
            student[i].name = sc.next();
            student[i].old = sc.nextInt();
            student[i].birth = sc.next();
            student[i].state = sc.next();
        }
        
        Arrays.sort(student, (a1, a2) -> a1.old - a2.old);
        
        for(int i = 0; i < n; i++){
            System.out.println(
                student[i].name + " " +
                student[i].old + " " +
                student[i].birth + " "+
                student[i].state);
        }
        
        
    }
}
