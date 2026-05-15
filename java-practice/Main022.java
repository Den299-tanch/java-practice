import java.util.*;

class spot{
    
    private String word;
    private int pick1;
    private int pick2;
    
    public spot(String word, int pick1, int pick2){
        this.word = word;
        this.pick1 = pick1;
        this.pick2 = pick2;
    }
    
    public String getWord(){
        return word;
    }
    
    public int getPick1(){
        return pick1;
    }
    
    public int getPick2(){
        return pick2;
    }
    
}

public class Main022{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int s = sc.nextInt();
        ArrayList<spot> spList = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            spot temp = new spot(sc.next(), sc.nextInt(), sc.nextInt());
            spList.add(temp);
        }
        
        spot temp = spList.get(s - 1);
        System.out.print(temp.getWord());
        
        for(int i = 0; i < k; i++){
            int index = sc.nextInt();
            if(index == 1){
                temp = spList.get(temp.getPick1() - 1);
                System.out.print(temp.getWord());
            } 
            
            if(index == 2){
                temp = spList.get(temp.getPick2() - 1);
                System.out.print(temp.getWord());
            }
            
        }
        
    }
}