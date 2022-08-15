import java.util.Scanner;
import java.util.Vector;

public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int numCases = stdin.nextInt(); 
      
        Vector<Long> cache = new Vector<>();
        cache.add(1L);
        for (int i = 0; i < numCases; i++) {
            int numCycles = stdin.nextInt();
            while(cache.size() <= numCycles) {
                if (cache.size() % 2 == 0) {
                    cache.add(cache.lastElement() + 1);                
                } else {
                    cache.add(cache.lastElement() * 2);
                }
            }
            System.out.println(cache.get(numCycles));
        }
    }
}
