
public class Problem01 {
    
    public static void func1(int n){
        int i=1,j=1,k=1;
        int x=0,y=0;

        for ( ; i<=n; i++){
            for (; j<=n;  j=j*2){
                 //System.out.print("A'");
                 x++;
            }
        }
         for (;k<=j*j; k++){
            //System.out.print("A'");
            y++;
         }

         System.out.print(" \n x= "+x +" y= "+y);
    
    }
   
    
    public static int func2(int n){
        int k,j,i=n, counter = 0;
        while(i>1){
            j=1;
            while(j<n){
                k=0;
                while(k<n){
                    k=k+2;
                    counter++;
                   
                }
                j=j*2;
            }
            i=i/2;
        }
        return counter;

       
    }
    // O(n/2 * log(n) * log(n))
    
   public static void main(String[] args){
        System.out.println(func2(1024));
        
    }
    
    
   // also discuss T(n) = 3 T(n/4) + n
   // O(n)
    
    
}
