public class remove_elements {
    public static void main(String[] args) {
        String name = "helljjjjjfoo";
        String count = "";
        for (int i = 0; i < name.length()-1; i++) {
            for (int j = 0; j < name.length()-i-1; j++) {
                if(name.charAt(i)==name.charAt(j+1)){
                    count += "";
                    System.out.println("1  ");
                    break;
                }else{
                    count += name.charAt(i);
                    System.out.println("h = "+count);
                    break;
                }
            }
        }
        System.out.print(count);
    }
}
