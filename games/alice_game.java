

public class alice_game {
    public static void main(String[] args) {
        int[] arr = {12, 21, 13, 15, 27, 11};

        int count = 0;
        for(int i=0; i<arr.length; i++){

            if(arr[i] % 3 == 0){
                count++;
            }
        }
        System.out.println(count);
       
    }
}
