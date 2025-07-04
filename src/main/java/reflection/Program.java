package reflection;

import java.lang.reflect.Field;
import java.util.Random;

import static reflection.ReflectionFather.getNameAndContent;

public class Program {
    public static void main(String[] args) throws IllegalAccessException {
        ReflectionDaughter daughter = new ReflectionDaughter();
        fillFields(daughter);
        getNameAndContent(daughter);

        ReflectionSon son = new ReflectionSon();
        fillFields(son);
        getNameAndContent(son);
    }

    /*Create a parent class that has several successor classes and a Program class.
    Each of the descendant classes contains only private String fields and an empty constructor.
    Implement a method in the Program class that will take an Object and populate each field with random data.
    Implement a method in the parent class that will return the value and name of each field in the successor class and output to the console.*/
    public static String generateRandomString(int length) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(alphabet.length());
            stringBuilder.append(alphabet.charAt(index));
        }
        return stringBuilder.toString();
    }

    public static void fillFields(Object randomeObject) {
        Class<?> clazz = randomeObject.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            if (field.getType() == String.class) {
                try {
                    String randomValue = generateRandomString(8);
                    field.set(randomeObject, randomValue);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


