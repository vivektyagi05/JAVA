
public class fact {
    public static void cal_fact(int i,int n,int total) {
        if(i==n){
            total *= i;
            System.out.println("fact => "+total);
            return;
        }
        cal_fact(i+1,n,total*=i);
    }
    public static void main(String[] args) {
        int num = 1;
        cal_fact(1,num,1);
    }
}
