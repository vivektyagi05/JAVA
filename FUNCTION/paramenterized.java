
class rectangle{
    int area(int length, int breadth){
        return length * breadth;
    }
}

public class paramenterized{
    public static void main(String[] args) {
        rectangle r1 = new rectangle();
        int result = r1.area(10,5);
        System.out.println("Area : " + result);
    }
}
