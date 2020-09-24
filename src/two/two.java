package two;

import java.util.ArrayList;
import java.util.LinkedList;

public class two {
        public static void  main(String[] args) {
            ArrayList<Double> ArrayList = new ArrayList<>();
            LinkedList<Double> LinkedList = new LinkedList<>();
            int k = 1000000;
            for (int i = 0; i < k; i++) {
                ArrayList.add(Math.random());
                LinkedList.add(Math.random());
            }
            long startTime = System.currentTimeMillis();
            int n = 100000;
            for (int i = 0; i < n; i++){
                ArrayList.get((int) Math.random());
            }
            System.out.println(System.currentTimeMillis() - startTime);

            startTime = System.currentTimeMillis();
            for (int i = 0; i < n; i++){
                LinkedList.get((int) Math.random());
            }
            System.out.println(System.currentTimeMillis() - startTime);
        }
}
