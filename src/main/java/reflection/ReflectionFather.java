package reflection;


import java.lang.reflect.Field;

public class ReflectionFather {

    public static void getNameAndContent(Object randomeObject) throws IllegalAccessException {
        Class<?> clazz = randomeObject.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println(randomeObject.getClass() + "; Поле: " + field.getName() + ", значення: " + field.get(randomeObject));

        }
    }
}


