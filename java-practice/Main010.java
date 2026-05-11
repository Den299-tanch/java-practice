import java.util.*;


public class Main010 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        
        Map<Integer, Integer> root = new HashMap<>();
        Map<Integer, Integer> root2 = new HashMap<>();
        
        for(int i = 0; i < p; i++){
            Integer a = sc.nextInt();
            Integer b = sc.nextInt();
            
            root.put(a, b);
        }
        
        for(int i = 0; i < q; i++){
            Integer b = sc.nextInt();
            Integer c = sc.nextInt();
            
            root2.put(b, c);
        }

        Map<Integer, Integer> result = new TreeMap<>();

        for(int i = 1; i <= p; i++){
            Integer b = root.get(i);
            
            if(root2.containsKey(b)){
                Integer c = root2.get(b);
                result.put(i, c);
            }
        }
        
        for(Integer a : result.keySet()){
            System.out.println(a +  " " + result.get(a));
        }
        
    }
}


