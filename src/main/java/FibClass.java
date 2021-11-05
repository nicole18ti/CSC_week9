
public class FibClass {

    public static int fibRec(int n) {
        if (n <= 1) {
            return n;
        }
        return fibRec(n - 1) + fibRec(n - 2);
    }

    static int fibIter(int n) { /// O(n)
       
        int i, f[] = new int[n + 2]; 
        f[0] =f[1]= 0;
       
        for (i = 2; i <= n; i++) 
            f[i] = f[i - 1] + f[i - 2];
        
        return f[n];
        
       // This is mush slower then the Linear one > O(n)
       // T(n) = 1+ T(n - 1) + T(n - 2)
       // = 1 + 2T(n - 1)
       
       
       // O(2^n)
    }
}
    
