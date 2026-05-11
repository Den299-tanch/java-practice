import java.util.*;

class Employee{
    private int number;
    private String name;
    
    public Employee(int number, String name){
        this.number = number;
        this.name = name;
    }
    
    public int getNumber(){
        return number;
    }
    
    public String getName(){
        return name;
    }
    
    public void setNumber(int number){
        this.number = number;
    }
    
    public void setName(String name){
        this.name = name;
    }
}


public class Main19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Employee> empList = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            String ins = sc.next();
            if(ins.equals("make")){
                Employee emp = new Employee(sc.nextInt(), sc.next());
                empList.add(emp);
            } else if(ins.equals("getnum")){
                Employee index = empList.get(sc.nextInt() - 1);
                System.out.println(index.getNumber());
            } else if(ins.equals("getname")){
                Employee index = empList.get(sc.nextInt() - 1);
                System.out.println(index.getName());
            } else if(ins.equals("change_num")){
                Employee index = empList.get(sc.nextInt() - 1);
                index.setNumber(sc.nextInt());
            } else if(ins.equals("change_name")){
                Employee index = empList.get(sc.nextInt() - 1);
                index.setName(sc.next());
            }
        }
        
    }
}