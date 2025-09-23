public class parmutation {
    public static void calculateper(String name, String parmutation){
        if(name.length() == 0){
            System.out.println(parmutation);
            return;
        }
        for(int i=0; i<name.length(); i++){
            char str = name.charAt(i);
            String newname = name.substring(0, i) + name.substring(i+1);
            calculateper(newname, parmutation+str);
        }
    }
    public static void main(String[] args) {
        String name = "abcdd";
        calculateper(name,"");
    }
}
