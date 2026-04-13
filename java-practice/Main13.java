import java.util.*;


public class Main13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int count = 0;
        
        ArrayList<Integer> pAtkList = new ArrayList<>();
        ArrayList<Integer> mAtkList = new ArrayList<>();
        
        while(true){
            
            count++;
            
            if(count > 2){
                Integer mAtk = pAtkList.get(count-3) + pAtkList.get(count-2)*2;
                Integer pAtk = mAtkList.get(count-3) + mAtkList.get(count-2);
                
                H -= mAtk;
                
                if(H <= 0){
                    System.out.println(count);
                    break;
                }
                
                mAtkList.add(mAtk);
                pAtkList.add(pAtk);
                
            } else{
                pAtkList.add(1);
                mAtkList.add(1);
            
            H -= mAtkList.get(count-1);
            }
            
        }
    }
}