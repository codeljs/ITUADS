public class Ex1 {
    //1.1.14
    public int largestInteger(int n){
        //corner case
        if(n < 0) return -1; // illegal input
        if(n == 1) return 0;
        int result = 1, counter = 0;
        while (result <= n) {
            result  = result << 1;
            counter++;
        }
        return counter - 1;

    }

    public int largestInteger2(int n){
        //corner case
        if(n < 0) return -1; // illegal input

        int k = 0;
        while (n > 1) {
            n = n>>1;   // n = n/2;
            k++;
        }
        return k;

    }




    //


    public static class disjointsets {



    }
}
