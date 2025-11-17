public class hello {

    public void function1(int a, int b) {
        System.out.println(a + b);
    }

    // Lambda 
    // (a,b)->{System.out.println(a+b);}

    public void name(String name){
        System.out.println("My Name Is : " + name);
    }
    // Lambda
    /// (name)-> { System.out.println("My Name Is : " + name);}
    /// 
    private int length(String str){ 
        return str.length(); 
    } 
    //lambda  
    //   (str) -> {return str.length();}

    public static void main(String[] args) {
        hello obj = new hello();
        obj.function1(4, 5);
        obj.name("vivek");
        obj.length("hello");
    }
}
