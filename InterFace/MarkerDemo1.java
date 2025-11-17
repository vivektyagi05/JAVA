interface Permission {}

class Admin implements Permission {
    String name;
    Admin(String name) {
        this.name = name;
    }

}

class Guest {
    String name;
    Guest(String name) {
        this.name = name;
    }
}

class Checker {
    void access(Object obj) {
        if (obj instanceof Permission) {
            // Access allowed
            String name = getName(obj);
            System.out.println("Access Permission granted to: " + name);
        } else {
            // Access denied
            String name = getName(obj);
            System.out.println("No Access Permission for: " + name);
        }
    }
}


public class MarkerDemo1 {
    public static void main(String[] args) {
        Admin a = new Admin("Vivek");
        Guest b = new Guest("Sumukh");
        Checker c = new Checker();

        c.access(a); 
        c.access(b); 
    }
}
