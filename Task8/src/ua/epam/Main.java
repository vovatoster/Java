package ua.epam;





import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {

    public static void main(String[] args) {
        Queue queue = new Queue();
        Class clazz = queue.getClass();

        Method[] methods = clazz.getSuperclass().getDeclaredMethods();
        System.out.println("Superclass methods:");
        getMethodsInfo(methods);
        methods = clazz.getDeclaredMethods();
        System.out.println("=======================");
        System.out.println("Current class methods");
        getMethodsInfo(methods);
        System.out.println("=======================");
        System.out.print("Superclass name: ");
        System.out.println(queue.getClass().getSuperclass().getName());
    }

    private static void getMethodsInfo(Method[] methods) {
        for (Method method: methods){
            System.out.print((Modifier.toString(method.getModifiers())));
            System.out.print(" " +method.getName() + "(");
            Class[] types = method.getParameterTypes();
            for(Class type : types){
                System.out.print(type.getName());
            }
            System.out.println(")");
        }
    }
}
