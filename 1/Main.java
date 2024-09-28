import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] var0) {
        int var1 = 0;

        String var2;
        for(var2 = ""; !StdIn.isEmpty(); ++var1) {
            String var3 = StdIn.readString();
            boolean var4 = StdRandom.bernoulli(1.0 / ((double)var1 + 1.0));
            if (var4) {
                var2 = var3;
            }
        }

        StdOut.println(var2);
    }
}