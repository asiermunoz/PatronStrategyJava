import java.util.LinkedList;

public class Ascending implements SortingStrategy{
    public Ascending() {
    }

    public LinkedList<String> sortList(LinkedList<String> list) {
        list.sort((a, b) -> a.compareTo(b));
        return list;
    }
}
