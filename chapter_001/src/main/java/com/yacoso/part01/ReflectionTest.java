package com.yacoso.part01;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class ReflectionTest {

    public static void main(String[] args) {
        String name;

        if (args.length > 0){
            name = args[0];
        }else {
            Scanner in = new Scanner(System.in);
            System.out.println("enter class name: ");
            name = in.next();
        }

        try {
            Class<?> cl = Class.forName(name);
            Class<?> superclass = cl.getSuperclass();
            String modifiers = Modifier.toString(cl.getModifiers());
            if (modifiers.length() > 0){
                System.out.print(modifiers + " ");
            }
            System.out.print("class " + name);
            if (superclass != null && superclass != Object.class){
                System.out.print(" extends " + superclass.getName());
            }

            System.out.print("\n{\n");
            printConstructors(cl);
            System.out.println();
            printMethods(cl);
            System.out.println();
            printFields(cl);
            System.out.println("}");

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        System.exit(0);
    }

    public static void printConstructors(Class cl){

        Constructor[] constructors = cl.getDeclaredConstructors();

        for (Constructor c : constructors){
            String name = c.getName();
            System.out.print(" ");
            String s = Modifier.toString(c.getModifiers());
            if (s.length() > 0){
                System.out.print(s + " ");
            }
            System.out.print(name + "(");

            Class[] parameterTypes = c.getParameterTypes();
            for (int j = 0; j < parameterTypes.length; j++){
                if (j > 0){
                    System.out.print(", ");
                }
                System.out.print(parameterTypes[j].getName());
            }
            System.out.println(");");
        }

    }

    public static void printMethods(Class cl){

        Method[] methods = cl.getMethods();

        for (Method m : methods){

            Class<?> returnType = m.getReturnType();
            String name = m.getName();

            System.out.print(" ");
            String s = Modifier.toString(m.getModifiers());
            if (s.length() > 0){
                System.out.print(s + " ");
            }
            System.out.print(returnType.getName() + " " + name + "(");

            Class<?>[] parameterTypes = m.getParameterTypes();
            for (int j = 0; j < parameterTypes.length; j++){
                if (j > 0){
                    System.out.print(", ");
                }
                System.out.print(parameterTypes[j].getName());
            }

            System.out.println(");");
        }

    }

    public static void printFields(Class cl){
        Field[] fields = cl.getDeclaredFields();

        for (Field f : fields){
            Class<?> type = f.getType();
            String name = f.getName();
            System.out.print(" ");
            int modifiers = f.getModifiers();
            String s = Modifier.toString(f.getModifiers());
            if (s.length() > 0){
                System.out.print(s + " ");
            }
            System.out.println(type.getName() + " " + name + ";");
        }
    }
}
