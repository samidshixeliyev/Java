package sorting_comparing_iteration;
import java.util.*;
public class Iterator1 {
        public static void main(String[] args) {
            List<String> names = Arrays.asList("Ali", "Veli", "Ayşe");

            Iterator<String> iterator = names.iterator();

            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }

