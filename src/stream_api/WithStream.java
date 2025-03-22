package stream_api;
import java.util.Arrays;
import java.util.List;

public class WithStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream()
                .filter(n -> n % 2 == 0) // Cüt ədədləri seçirik
                .map(n -> n * n)         // Kvadratlarını alırıq
                .forEach(System.out::println);  // Çap edirik
    }
}
