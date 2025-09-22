public class totalpath{
    public static int countpath(int i, int j, int n, int m) {
        
        if(i == n-1 && j == m-1){
            return 1;
        }
        // move downward
        int movedownward = countpath(i+1, j, n, m);

        // move right
        int moveright = countpath(i, j+1, n, m);
        return  movedownward + moveright;
    }
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int total = countpath(0,0,n,m);
        System.out.println(total);
    }
}

