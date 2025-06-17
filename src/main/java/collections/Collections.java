package collections;

import java.time.LocalDate;
import java.util.*;

public class Collections {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
    }

    /*Task 1.  HashSet from plants
Create a HashSet collection with element type String.
Add 10 strings to it: watermelon, banana, cherry, pear, melon, blackberry, shen-hen, strawberry, iris, potato.
Display the contents of the collection on the screen, each item on a new line.
See how the order of the added items has changed.*/
    public static void task1() {
        HashSet<String> hashcoll = new HashSet<>();
        hashcoll.add("watermelon");
        hashcoll.add("banana");
        hashcoll.add("cherry");
        hashcoll.add("pear");
        hashcoll.add("melon");
        hashcoll.add("blackberry");
        hashcoll.add("shen-hen");
        hashcoll.add("strawberry");
        hashcoll.add("iris");
        hashcoll.add("potato");
        hashcoll.forEach(System.out::println);
    }

    /*Task 2. HashMap from 10 pairs
Create a collection HashMap<String, String>, put there 10 pairs of strings: watermelon - berry, banana - herb, cherry - berry, pear - fruit,
melon - vegetable, blackberry - bush, ginseng - root, strawberry - berry, iris - flower, potato - tuber.

Display the contents of the collection on the screen, each item on a new line.

Output examlpe (only one line is shown here):
potato - tuber*/
    public static void task2() {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("watermelon", "berry");
        hashmap.put("banana", "herb");
        hashmap.put("cherry", "berry");
        hashmap.put("pear", "fruit");
        hashmap.put("melon", "vegetable");
        hashmap.put("blackberry", "bush");
        hashmap.put("ginseng", "root");
        hashmap.put("strawberry", "berry");
        hashmap.put("iris", "flower");
        hashmap.put("potato", "tuber");
        hashmap.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    /*Task 3. HashMap collection of cats
There is a Cat class, with a name field (name, String).
Create a collection HashMap<String, Cat>.
Add 10 cats to the collection, use cat name as a key.
Print the result on the screen, each item on a new line.*/
    public static void task3() {
        HashMap<String, Cat> hashmap = new HashMap<>();
        hashmap.put("Bandito", new Cat());
        hashmap.put("Snezhok", new Cat());
        hashmap.put("Bonya", new Cat());
        hashmap.put("Petrovich", new Cat());
        hashmap.put("Babay", new Cat());
        hashmap.put("Little lion", new Cat());
        hashmap.put("Mars", new Cat());
        hashmap.put("Bizzy Bone", new Cat());
        hashmap.put("Krazy Bone", new Cat());
        hashmap.put("Layzie Bone", new Cat());
        hashmap.forEach((key, value) -> System.out.println(value + ": " + key));
    }

    /*Task 4. Display the list of keys
    There is a collection of HashMap<String, String>, there are 10 different strings.
    Display the list of keys, each element with a new line.*/
    public static void task4() {
        HashMap<String, String> hashmapstrings = new HashMap<>();
        hashmapstrings.put("watermelon", "berry");
        hashmapstrings.put("banana", "herb");
        hashmapstrings.put("cherry", "berry");
        hashmapstrings.put("pear", "fruit");
        hashmapstrings.put("melon", "vegetable");
        hashmapstrings.put("blackberry", "bush");
        hashmapstrings.put("ginseng", "root");
        hashmapstrings.put("strawberry", "berry");
        hashmapstrings.put("iris", "flower");
        hashmapstrings.put("potato", "tuber");
        hashmapstrings.forEach((key, value) -> System.out.println(key));
    }

    /*Task 5. Display a list of values
    There is a collection of HashMap<String, String>, there are 10 different strings.
    Display a list of values on the screen, each element with a new line.*/
    public static void task5() {
        HashMap<String, String> hashmapstrings = new HashMap<>();
        hashmapstrings.put("watermelon", "berry");
        hashmapstrings.put("banana", "herb");
        hashmapstrings.put("cherry", "berry");
        hashmapstrings.put("pear", "fruit");
        hashmapstrings.put("melon", "vegetable");
        hashmapstrings.put("blackberry", "bush");
        hashmapstrings.put("ginseng", "root");
        hashmapstrings.put("strawberry", "berry");
        hashmapstrings.put("iris", "flower");
        hashmapstrings.put("potato", "tuber");
        hashmapstrings.forEach((key, value) -> System.out.println(value));
    }

    /*Task 6. HashMap collection from Object
    There is a collection HashMap<String, Object>, there are 10 different pairs of objects.
    Display the contents of the collection on the screen, each element on a new line.

    Output example (only one string is shown here):
    Sim - 5 */
    public static void task6() {

        HashMap<String, Collections> hashmap = new HashMap<>();
        hashmap.put("Bandito", new Collections());
        hashmap.put("Snezhok", new Collections());
        hashmap.put("Bonya", new Collections());
        hashmap.put("Petrovich", new Collections());
        hashmap.put("Babay", new Collections());
        hashmap.put("Little lion", new Collections());
        hashmap.put("Mars", new Collections());
        hashmap.put("Bizzy Bone", new Collections());
        hashmap.put("Krazy Bone", new Collections());
        hashmap.put("Layzie Bone", new Collections());
        hashmap.forEach((key, value) -> System.out.println(value + ": " + key));
    }

    /*Creating and using ArrayList
    Task 7. 5 different lines in the list
    1. Create a list of lines.
    2. Add 5 different lines to it.
    3. Display its size on the screen.
    4. Using a loop, display its contents on the screen, each value on a new line*/
    public static void task7() {
        List<String> myfirstarray = new ArrayList<>();
        myfirstarray.add("One");
        myfirstarray.add("Two");
        myfirstarray.add("Three");
        myfirstarray.add("Four");
        myfirstarray.add("Five");
        System.out.println("Size of ArrayList: " + myfirstarray.size() + "\nContent of the List:");
        for (int i = 0; i < myfirstarray.size(); i++) {
            System.out.println(myfirstarray.get(i));
        }
    }

    /*Task 8. The Longest line
    1. Create a list of strings.
    2. Read 5 strings from the keyboard and add them to the list.
    3. Using a loop, find the longest string in the list.
    4. Display the found string on the screen.
    5. If there are several such lines, print each line from a new line.*/
    public static void task8() {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("We need 5 strings. ");
        String str1 = "";
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter string " + (i + 1) + ":");
            String str2 = scan.nextLine();
            list.add(str2);
            if (str1.length() < str2.length()) {
                str1 = str2;
            } else if (str1.length() == str2.length()) {
                list2.add(str2);
            }
        }
        System.out.println("The longest string: " + str1);
        if (!list2.isEmpty()) {
            System.out.println("Also the same length as the longest one have following strings: " + list2);
        }
    }

    /*Task 9. The Shortest line
    1. Create a list of strings.
    2. Read 5 strings from the keyboard and add them to the list.
    3. Using a loop, find the shortest string in the list.
    4. Display the found string on the screen.
    5. If there are several such lines, print each line from a new line*/
    public static void task9() {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("We need your 5 strings.");
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter string " + (i + 1) + ":");
            list.add(scan.nextLine());
        }
        int minLength = list.get(0).length();
        for (String str : list) {
            if (str.length() < minLength) {
                minLength = str.length();
            }
        }
        for (String str : list) {
            if (str.length() == minLength) {
                list2.add(str);
            }
        }
        System.out.println("Shortest string(s):");
        for (String s : list2) {
            System.out.println(s);
        }
    }

    /*Task 10. 10 lines to the top of the list
1. Create a list of strings in the main method.
2. Add 10 lines to it from the keyboard, but only add not to the end of the list, but to the beginning.
3. Using a loop, print the contents to the screen, each value on a new line.*/
    public static void task10() {
        List<String> task10list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 10 strings:");
        for (int i = 0; i < 10; i++) {
            task10list.add(0, scan.nextLine());
        }
        for (int i = 0; i < task10list.size(); i++) {
            System.out.println(task10list.get(i));
        }
    }

    /*Task 11. Delete the last line and insert it at the beginning
    1. Create a list of strings.
    2. Add 5 lines to it from the keyboard.
    3. Delete the last line and insert it at the beginning. Repeat 13 times.
    4. Using a loop, display the contents on the screen, each value on a new line*/
    public static void task11() {
        List<String> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("We need your 5 strings.");
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter string " + (i + 1) + ":");
            list.add(scan.nextLine());
        }
        System.out.println("Initial list: " + list);
        String temp;
        for (int i = 0; i < 13; i++) {
            temp = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            System.out.println("\nDeleted last line " + (i + 1) + ": " + list);
            list.add(0, temp);
            System.out.println("Added as first in the list: " + list);
        }
        System.out.println("\nAs result we have this list: " + list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    /*Tasks for Set and Map
Task 12.
Create a set of strings (Set<String>), put into it 20 words with the letter "L".*/
    public static void task12() {
        Set<String> hashSet = new HashSet<>(20);
        hashSet.add("Lemon");
        hashSet.add("Love");
        hashSet.add("Life");
        hashSet.add("Label");
        hashSet.add("Legal");
        hashSet.add("Line");
        hashSet.add("Lamp");
        hashSet.add("Laptop");
        hashSet.add("Logic");
        hashSet.add("Lift");
        hashSet.add("Level");
        hashSet.add("Local");
        hashSet.add("Loyal");
        hashSet.add("Link");
        hashSet.add("Language");
        hashSet.add("Letter");
        hashSet.add("Ladder");
        hashSet.add("Launch");
        hashSet.add("Listen");
        hashSet.add("Label");  //Please NOTE that this is a duplicate and it won't be added.
        int i = 1;
        for (String str : hashSet) {
            System.out.println(i + ". " + str);
            i++;
        }
    }

    /*Task 13.
Create a set of numbers (Set<Integer>), put 20 different numbers in it.
Remove all numbers greater than 10 from the set.*/
    public static void task13() {
        Set<Integer> numbers = new HashSet<>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            int a = rand.nextInt(21);
            numbers.add(a);
        }
        System.out.println("Original set: " + numbers);
        for (int i = 0; i < numbers.size(); i++) {
            numbers.removeIf(n -> n > 10);
        }
        System.out.println("Updated set: " + numbers);
    }

    /*Task 14.
Create a dictionary (Map<String, String>) with ten entries according to the principle "Last Name" - "First Name".
Check how many people have the same first or last name as the given one.*/
    public static void task14() {
        Map<String, String> dic = new HashMap<>(10);
        dic.put("Shevchenko", "Taras");
        dic.put("Franko", "Ivan");
        dic.put("Kovalenko", "Oksana");
        dic.put("Kovalenko", "Andrii"); //Please NOTE that I added 11 entities to see that the same keys won`t be added.
        dic.put("Melnyk", "Olena");
        dic.put("Bondarenko", "Yurii");
        dic.put("Tkachenko", "Iryna");
        dic.put("Hrytsenko", "Nazar");
        dic.put("Zinchenko", "Sofia");
        dic.put("Pavlenko", "Nazar");
        dic.put("Test", "Test");
        System.out.println("Initial map: " + dic);
        Set<String> dicListKey = dic.keySet();
        Collection<String> dicListValue = dic.values();
        String[] valueArray = dicListValue.toArray(new String[0]);
        String[] keyArray = dicListKey.toArray(new String[0]);
        System.out.println("Last names: " + dicListKey);
        System.out.println("First names: " + dicListValue);
        int keyCount = 0;
        int valueCount = 0;
        for (int i = 0; i < dicListValue.size() - 1; i++) {
            for (int j = i + 1; j < dicListValue.size(); j++) {
                if (valueArray[i].equals(valueArray[j])) {
                    valueCount++;
                    System.out.println("Names that has duplicates: " + valueArray[i]);
                }
            }
        }
        System.out.println("Quantity of coincidences for first names: " + valueCount);
        for (int i = 0; i < dicListKey.size() - 1; i++) {
            for (int j = i + 1; j < dicListKey.size(); j++) {
                if (keyArray[i].equals(keyArray[j])) {
                    keyCount++;
                    System.out.println("Last names that has duplicates: " + keyArray[i]);
                }
            }
        }
        System.out.println("Quantity of coincidences for last names: " + keyCount);
    }

    /*Task 15.
Create a dictionary (Map<String, LocalDate>) and enter ten entries into it according to the principle: "last name" - "date of birth".
Remove all people born in summer from the dictionary.*/
    public static void task15() {
        Map<String, LocalDate> dic2 = new HashMap<>(10);
        dic2.put("Shevchenko", LocalDate.parse("2000-12-03"));
        dic2.put("Franko", LocalDate.parse("2000-06-25"));
        dic2.put("Kovalenko", LocalDate.parse("2000-01-05"));
        dic2.put("Koval", LocalDate.parse("2000-03-04"));
        dic2.put("Melnyk", LocalDate.parse("2000-07-05"));
        dic2.put("Bondarenko", LocalDate.parse("2000-08-15"));
        dic2.put("Tkachenko", LocalDate.parse("2000-09-05"));
        dic2.put("Hrytsenko", LocalDate.parse("2000-12-09"));
        dic2.put("Zinchenko", LocalDate.parse("2000-11-05"));
        dic2.put("Pavlenko", LocalDate.parse("2000-10-22"));
        System.out.println("Basic dictionary: " + dic2);
        Iterator<Map.Entry<String, LocalDate>> iterator = dic2.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, LocalDate> entry = iterator.next();
            int month = entry.getValue().getMonthValue();
            if (month >= 6 && month <= 8) {
                iterator.remove();
            }
        }
        System.out.println("Corrected dictionary: " + dic2);
    }

    /*Task 16.
    Create a dictionary (Map<String, String>) and enter ten entries in it according to the principle "last name" - "first name".
    Delete people who have the same names.*/
    public static void task16() {
        Map<String, String> dic3 = new HashMap<>(10);
        dic3.put("Shevchenko", "Taras");
        dic3.put("Franko", "Ivan");
        dic3.put("Kovalenko", "Iryna");
        dic3.put("Koval", "Andrii");
        dic3.put("Melnyk", "Olena");
        dic3.put("Bondarenko", "Yurii");
        dic3.put("Tkachenko", "Iryna");
        dic3.put("Hrytsenko", "Nazar");
        dic3.put("Zinchenko", "Sofia");
        dic3.put("Pavlenko", "Nazar");
        System.out.println("Basic dictionary: " + dic3);
        Map<String, Integer> nameCounts = new HashMap<>();
        for (String name : dic3.values()) {
            nameCounts.put(name, nameCounts.getOrDefault(name, 0) + 1);
        }
        Iterator<Map.Entry<String, String>> iterator = dic3.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            String nameExample = entry.getValue();
            if (nameCounts.get(nameExample) > 1) {
                iterator.remove();
            }
        }
        System.out.println("Corrected dictionary: " + dic3);
    }

    /*Task 17.
1. Create a Map dictionary (<String, String>) and add 10 people to it in the form "LastName"-"FirstName".
2. Let there be people with the same first name among these 10 people.
3. Let there be people with the same last names among these 10 people. Note the number of entries in the resulting collection.
4. Display the contents of the Map on the screen.*/
    public static void task17() {
        Map<String, String> dic4 = new HashMap<>(10);
        dic4.put("Shevchenko", "Taras");
        dic4.put("Franko", "Ivan");
        dic4.put("Kovalenko", "Iryna");
        dic4.put("Kovalenko", "Andrii");
        dic4.put("Melnyk", "Olena");
        dic4.put("Bondarenko", "Yurii");
        dic4.put("Tkachenko", "Iryna");
        dic4.put("Hrytsenko", "Nazar");
        dic4.put("Zinchenko", "Sofia");
        dic4.put("Pavlenko", "Nazar");
        System.out.println("Basic dictionary: " + dic4);
    }

    public String toString() {
        return "I am Collection";
    }
}












