package reflection;


import java.lang.reflect.Field;

public class ReflectionFather {
    void getNameAndContent() throws IllegalAccessException {
        Class<?> clazz = this.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println(this.getClass() + "; Поле: " + field.getName() + ", значення: " + field.get(this));
        }
    }
}


