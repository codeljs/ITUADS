// import java.util.HashMap;
// import java.util.HashSet;
import java.util.Scanner;
import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
public class EX2 {

    public static boolean balance() {
        Stack<Character> stack  = new Stack<>();
        Scanner sc = new Scanner(System.in);
        // Character m = StdIn.readChar();
        // stack.push(m);
//        HashMap<Character,Character> tmp = new HashMap<>();
//        tmp.put('[',']');
//        tmp.put('(',')');
        int count = 0;
        while (StdIn.hasNextLine()){
            count++;
            Character n = StdIn.readChar();
            if(n == '\n')break;
//
//            if(n == '['||n == '('){
//                stack.push(n);
//            }else if(n == ']'||n == ')'){
//                if(stack.isEmpty()){
//                    return false;
//                }
//                else{
//                    Character t = stack.pop();
//                    if(n-1== t||n-2==t){
//                        continue;
//                    }else return false;
//                }
//            }else break;

        }

        StdOut.println(count);
        return (stack.isEmpty());



    }

    public static void main(String[] args) {
        System.out.println("Please input:");
        long start = System.currentTimeMillis();
// some time passes

        if(balance()){
            StdOut.println(1);
        }else
            StdOut.println(0);

        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        StdOut.println(elapsedTime);
    }

}





