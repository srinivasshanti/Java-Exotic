import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            //Math.abs converts the negative value to positive value
            int catADist = Math.abs(x-z);
            int catBDist = Math.abs(y-z);            
   
            
            if (catADist == catBDist) {
                System.out.println("Mouse C");
            } else if (catADist < catBDist) {
                System.out.println("Cat A");
            } else {
                System.out.println("Cat B");
            }
            
        }
    }
}
