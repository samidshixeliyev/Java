package annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) // Annotasiya runtime zamanı əlçatan olacaq
@Target(ElementType.METHOD) // Yalnız metodlarda istifadə olunur
public @interface SimpleAnnotation {
}
