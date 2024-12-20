import java.util.Collections;
import java.util.LinkedList;

public class Descending implements SortingStrategy {
    public Descending() {
    }

    public LinkedList<String> sortList(LinkedList<String> list) {
        list.sort((a, b) -> a.compareTo(b));
        Collections.reverse(list);
        return list;
    }
}
