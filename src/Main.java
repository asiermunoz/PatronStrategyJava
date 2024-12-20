import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        LinkedList<String> list = new LinkedList();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Programming");
        list.add("Language");
        list.add("Is");
        list.add("Fun");
        context.setStrategy(new Ascending());
        list = context.sortList(list);
        System.out.println("Ascending: " + String.valueOf(list));
        context.setStrategy(new Descending());
        list = context.sortList(list);
        System.out.println("Descending: " + String.valueOf(list));
        context.setStrategy(new Length());
        list = context.sortList(list);
        System.out.println("Length: " + String.valueOf(list));
    }
}
