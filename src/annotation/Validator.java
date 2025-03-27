package annotation;
import java.lang.reflect.Field; // Reflection API-dən istifadə etmək üçün Field sinfi import edilir.

public class Validator {

    /**
     * Obyektin sahələrini yoxlayan metod.
     * @param obj Yoxlanılması nəzərdə tutulan obyekt
     * @throws Exception Əgər sahə boş və ya null olarsa, istisna atılır.
     */
    public static void validate(Object obj) throws Exception {
        // Obyektin sinifini əldə edirik
        Class<?> clazz = obj.getClass();

        // Sinifin bütün sahələrini əldə edirik (private, protected, public daxil olmaqla)
        Field[] fields = clazz.getDeclaredFields();

        // Hər bir sahə üçün dövrə başlayırıq
        for (Field field : fields) {

            // Sahənin @NotEmpty annotasiyası olub-olmadığını yoxlayırıq
            if (field.isAnnotationPresent(NotEmpty.class)) {

                // Private və ya protected sahəyə giriş imkanı yaradırıq
                field.setAccessible(true);

                // Sahənin dəyərini əldə edirik
                Object value = field.get(obj);

                // Dəyər boş və ya null olub-olmadığını yoxlayırıq
                if (value == null || value.toString().trim().isEmpty()) {
                    // Əgər boşdursa, istisna atırıq və sahənin adını bildiririk
                    throw new RuntimeException("Field " + field.getName() + " cannot be empty!");
                }
            }
        }

        // Əgər bütün yoxlamalar uğurlu olarsa, bu mesaj çap olunur
        System.out.println("Validation successful!");
    }
}
