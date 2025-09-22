public class flodystringle {
    public static void main(String[] args) {
        int rows = 1; 
        int num = 5;

        for (int i = 0; i < num; i++) {
            for (int j = 1; j <= i+1; j++) {
                
                System.out.print(rows++);
                
            }
            System.out.println();
        }
    }
}