package stream_api;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        // 1. List-dən Stream yaratmaq
        List<String> names = Arrays.asList("Ali", "Veli", "Ayşe");
        Stream<String> stream1 = names.stream();
        // Stream-i istifadə edərək hər bir elementi çap edək
            stream1.forEach(System.out::println);
        // 2. Array-dən Stream yaratmaq
        String[] nameArray = {"Ali", "Veli", "Ayşe"};
        Stream<String> stream2 = Arrays.stream(nameArray);
               stream2.filter(name -> name.startsWith("A")) // "A" ilə başlayanları seç
                      .map(String::toUpperCase)      // Böyük hərflərə çevir
                      .forEach(System.out::println); // Çap et
        // 3. Birbaşa Stream yaratmaq
        Stream<Integer> stream3 = Stream.of(1, 2, 3, 4, 5);
        stream3 .filter(n -> n>2)
                .forEach(System.out::println);
        System.out.println(stream3);
    }
}
