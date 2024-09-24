package ch12.sec12;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnnotationExample {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Class c = Service.class;

        Method[] methods = c.getDeclaredMethods();

        for (Method method : methods) {
            PrintAnnotation annotation = method.getAnnotation(PrintAnnotation.class);

            printLine(annotation);

            method.invoke(new Service());

            printLine(annotation);

        }
    }

    private static void printLine(PrintAnnotation annotation) {
        if (annotation != null) {
            int number = annotation.number();
            String value = annotation.value();

            for (int i = 0; i < number; i++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
