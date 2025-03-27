package annotation;

import java.lang.reflect.Method;

public class InfoAnnotationProcessor {

    public static void main(String[] args) throws Exception {
        InfoExample example = new InfoExample();

        Method[] methods = InfoExample.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(InfoAnnotation.class)) {
                InfoAnnotation annotation = method.getAnnotation(InfoAnnotation.class);
                System.out.println("Method: " + method.getName());
                System.out.println("Author: " + annotation.author());
                System.out.println("Date: " + annotation.date());
                method.invoke(example);
            }
        }
    }
}
