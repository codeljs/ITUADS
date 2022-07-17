import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;
public class Balance {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    private static boolean balance(){
        FastReader s = new FastReader();

        char[] test = s.next().toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < test.length; i++) {

            Character n = test[i];
            if(n == '['||n == '('){
                stack.push(n);
            }
            else if(stack.isEmpty()){
                return false;
            }else {
                char top = stack.pop();
                if(n-1 != top && n-2 !=top)return false;
                continue;

            }


        }

        return (stack.isEmpty());
    }

    public static void main(String[] args) {

// some time passes
        if(balance()){
            StdOut.println(1);
        }else
            StdOut.println(0);

    }
}
