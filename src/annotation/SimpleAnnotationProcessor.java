package annotation;

import java.lang.reflect.Method;

public class SimpleAnnotationProcessor {
    public static void main (String[] args) throws Exception{
        SimpleExample simpleExample = new SimpleExample();
        Method [] methods = simpleExample.getClass().getDeclaredMethods();
        for (Method method : methods) {
            if(method.isAnnotationPresent(SimpleAnnotation.class)) {
                System.out.println("Annotation detected on method: " + method.getName());
                method.invoke(simpleExample);
            }
        }

    }
}
