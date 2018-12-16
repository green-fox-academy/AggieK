import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Fibonacci {
    private static Map<Integer, Integer> fibbo = new HashMap<>();


    public static void main(String[] args) {
        fibbo.put(0, 0);
        fibbo.put(1, 1);
        fibbo.put(2, 1);
        System.out.println(fibonacciCounter(9));
    }

        public static Integer fibonacciCounter(Integer n){
            if (fibbo.containsKey(n)) return fibbo.get(n);
            else {
                Integer fibboNew = 0;
                int i;
                for (i = 3; i < n; i++)
                    fibboNew = (fibbo.get(i - 2) + fibbo.get(i - 1));
                fibbo.put(i, fibboNew);
            }
            return fibbo.get(n);
        }
    }
