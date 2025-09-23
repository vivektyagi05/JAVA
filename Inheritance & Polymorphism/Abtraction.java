abstract class a{
    abstract void f1();
    abstract void f2();
}

class b extends a{
    void f1(){
        System.out.println("hello");
    }
}

class c extends b{
    void f1(){
        System.out.println("h1");
    }
    void f2(){
        System.out.println("h2");
    }
}


public class Abtraction {
    public static void main(String[] args) {
        b obj = new b();
        obj.f1();
        obj.f2();
    }
}
