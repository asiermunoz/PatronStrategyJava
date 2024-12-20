import java.util.LinkedList;

public class Context {
    private SortingStrategy strategy;

    public Context() {
    }

    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public LinkedList<String> sortList(LinkedList<String> list) {
        return this.strategy.sortList(list);
    }
}
