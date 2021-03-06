package info.xiantang.algorithm.collection.string;

import info.xiantang.algorithm.collection.algs4.Alphabet;
import info.xiantang.algorithm.collection.algs4.BinaryStdIn;
import info.xiantang.algorithm.collection.algs4.BinaryStdOut;

public class TestBinaryOut {
    public static void compress(){
        Alphabet DNA = new Alphabet("ACTG");
        String s = BinaryStdIn.readString();
        int N = s.length();
        BinaryStdOut.write(N);
        for (int i = 0; i <N ; i++) {
            int d = DNA.toIndex(s.charAt(i));
            BinaryStdOut.write(d,DNA.lgR());
        }
        BinaryStdOut.close();

    }
    public static void expend(){
        Alphabet DNA = new Alphabet("ACTG");
        int w = DNA.lgR();
        int N = BinaryStdIn.readInt();
        for (int i = 0; i <N ; i++) {
            char c = BinaryStdIn.readChar(w);
            BinaryStdOut.write(DNA.toChar(c));
        }


    }
    public static void main(String[] args) {
//        int i ;
//        int width = 16;
//
//        for ( i = 0; !BinaryStdIn.isEmpty() ; i++) {
//            if (i!=0 && i %width==0)StdOut.println();
//            if (BinaryStdIn.readBoolean()){
//                StdOut.print(0);
//            }
//
//            else StdOut.print(1);
//        }
//        System.out.println(i);
        compress();
    }
}
