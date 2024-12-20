import java.util.LinkedList;

public class Length implements SortingStrategy{
    public Length() {
    }

    public LinkedList<String> sortList(LinkedList<String> list) {
        list.sort((a, b) -> a.length() - b.length());
        return list;
    }
}
