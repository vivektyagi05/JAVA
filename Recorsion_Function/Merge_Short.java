public class Merge_Short {
    public static void conqur(int arr[], int in,int mid, int ei) {
        int marged[] = new int[ei - in+1];

        int first = in;
        int second = mid+1;
        int x = 0;

        while(first <= in && second <= ei){
            if
        }


    }
    public static void Divide(int arr[], int in, int ei) {
        if(in <= ei){
            return;
        }
        int mid = in + (ei - in)/2;
        Divide(arr, in, mid);
        conqur(arr, in, mid, ei);

    }
    public static void main(String[] args) {
        int arr[] = {7,8,1,4,5};
        int range = arr.length;

    }
}
