package stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WithoutStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // Cüt ədədləri seçmək üçün yeni siyahı yaradılır
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer num : numbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }
        // Cüt ədədlərin kvadratını tapmaq üçün yeni siyahı
        List<Integer> squaredNumbers = new ArrayList<>();
        for (Integer num : evenNumbers) {
            squaredNumbers.add(num * num);
        }

        // Nəticəni çap edirik
        for (Integer num : squaredNumbers) {
            System.out.println(num);
        }
    }

}
