public class lexicographical {
    public static void main(String[] args) {
    

        //  deteremmine if a lexicographical larger than b
        String str1 = "apple";
        String str2 = "banana";
        if(str1.compareTo(str2) > 0) {
            System.out.println(str1 + " is lexicographically larger than " + str2);
        } else if (str1.compareTo(str2) < 0) {
            System.out.println(str1 + " is lexicographically smaller than " + str2);
        } else {
            System.out.println(str1 + " is equal to " + str2);
        }

    
        String input = "hello";
        String input1 = "world";

        int l1 = input.length();
        int l2 = input1.length();

        String data ;

        if(input.compareTo(input1) < 0){
            data  = "No";
        }else{
            data = "Yes";
        }


        System.out.println(l1+l2+ " " + data + " "+ input +" "+ input1);
    }
}
