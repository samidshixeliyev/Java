package sorting_comparing_iteration;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterableExample implements Iterable<String> {
    private List<String> items = Arrays.asList("Alma", "Banan", "Çiyələk"); // Meyvələr

    @Override
    public Iterator<String> iterator() {
        return items.iterator();
    }

    public static void main(String[] args) {
        IterableExample iterableExample = new IterableExample();
        for (String item : iterableExample) {
            System.out.println(item);
        }
    }
}
