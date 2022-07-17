package itu;
import edu.princeton.cs.algs4.UF;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;
import java.util.stream.IntStream;

public class disjointsets {
    private int[] parent;
    private byte[] rank;
    public disjointsets(int n){
        parent = new int[2*n];
        for (int i = 0; i <n ; i++) {
            parent[i] = n+i;
        }
        for (int i = n; i <2*n ; i++) {
            parent[i] = i;
        }


        rank = new byte[2*n];
    }
    public int query(int p, int q){

        return find(p) == find(q)?1:0;

    }

    private int find(int p){
        return (p == parent[p])?p:find(parent[p]);
    }

    public void union(int p, int q){
        int rootP = find(p);
        int rootQ = find(q);

        if(rank[p]<=rank[q]){
            parent[rootP] = rootQ;
            rank[rootP]++;
        }else{
            parent[rootQ] = rootP;
            rank[rootQ]++;
        }
    }
    public void move(int p, int q){
        parent[p] = find(q);
    }








    public static void main(String[] args) {
        int n = StdIn.readInt();
        int m = StdIn.readInt();
        disjointsets set = new disjointsets(n);
        for (int i = 0; i < m; i++) {
            int op = StdIn.readInt();
            int v = StdIn.readInt();
            int w = StdIn.readInt();
            if(op == 0){
                int result = set.query(v,w);
                StdOut.println(result);
            }else if(op == 1){
                set.union(v,w);
            }else{
                set.move(v,w);
            }
        }


    }
}
