import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dominoes<dominoes> {
    public static void main(String[] args) {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));

        Collections.sort(dominoes);
        System.out.println(dominoes);

        ArrayList<Things> todos = new ArrayList<Things>();
        todos.add(new Things("Get milk"));
        todos.add(new Things("Stand up"));
        todos.add(new Things("Remove milk"));
        todos.add(new Things("Write my code"));

        todos.get(1).complete();
        todos.get(3).complete();

        Collections.sort(todos);
        System.out.println(todos);
    }
}