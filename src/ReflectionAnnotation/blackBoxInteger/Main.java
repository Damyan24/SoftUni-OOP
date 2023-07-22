package ReflectionAnnotation.blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {
        Scanner scan = new Scanner(System.in);
        Class<?> blackBox = Class.forName("ReflectionAnnotation.blackBoxInteger.BlackBoxInt");
        Constructor<?>[] constructors = blackBox.getDeclaredConstructors();




        Field[] fields = blackBox.getDeclaredFields();
        Method[]methods = blackBox.getDeclaredMethods();

        Field sum = fields[0];
        sum.setAccessible(true);



        Constructor<?>constructor = blackBox.getDeclaredConstructor();
        constructor.setAccessible(true);
        Object obj = constructor.newInstance();



        String command = scan.nextLine();
        while (!command.equals("END")){
            String [] info = command.split("_");
            String toDo = info[0];
            int number = Integer.parseInt(info[1]);

            doCommand(blackBox,obj,toDo,number);


            Field field = blackBox.getDeclaredField("innerValue");
            field.setAccessible(true);
            System.out.println(field.getInt(obj));
            command = scan.nextLine();
            }


        }







    public static void doCommand(Class<?> blackbox, Object obj, String toDo, int number) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = blackbox.getDeclaredMethod(toDo, int.class);
        method.setAccessible(true);
        method.invoke(obj, number);
    }
}