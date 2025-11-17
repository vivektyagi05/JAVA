public class calculator {
    public static void main(String[] args) {
        calc<Integer> cal=new calc(23, 223);
        System.out.println(cal.val_a()+cal.val_b());
        System.out.println(cal.val_a()-cal.val_b());
        System.out.println(cal.val_a()*cal.val_b());
        System.out.println(cal.val_a()/cal.val_b());

    }
}
class calc <T>{
    T a;
    T b;
    public calc(T a,T b) {
        this.a=a;
        this.b=b;
    }
    T val_a(){
        return a;
    }
    
    T val_b(){
        return b;
   }
}