import java.util.*;

class Student{
    String name;
    int old;
    String birth;
    String state;
}

public class Main017{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Student[] students = new Student[n];
        
        for(int i = 0; i < n; i++){
            students[i] = new Student();
            
            students[i].name = sc.next();
            students[i].old = sc.nextInt();
            students[i].birth = sc.next();
            students[i].state = sc.next();
        }
        
        for(int i = 0; i < k; i++){
            int a = sc.nextInt();
            students[a - 1].name =sc.next();
        }
        
        for(Student s : students){
            System.out.println(
                s.name + " " +
                s.old + " " +
                s.birth + " " +
                s.state);
        }
        
    }
}
