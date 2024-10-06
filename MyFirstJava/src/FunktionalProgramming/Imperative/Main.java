//package FunktionalProgramming;
//
//import java.util.List;
//
//import static FunktionalProgramming.Imperative.Main.Gender.*;
//
//public class Main {
//    public static void main(String[] args) {
//        List<Person> people = List.of(
//            new Person("John", MALE),
//            new Person("Maria", FEMALE),
//            new Person("Aisha", FEMALE),
//            new Person("Alex", MALE),
//            new Person("Alice", FEMALE)
//        );
//    }
//    static class Person{
//        private final String name;
//        private final Gender gender;
//
//        Person(String name, Gender gender) {
//            this.name = name;
//            this.gender = gender;
//        }
//
//        @Override
//        public String toString() {
//            return "Person{" +
//                    "name='" + name + '\'' +
//                    ", gender=" + gender +
//                    '}';
//        }
//    }
//    enum Gender{
//        MALE, FEMALE
//    }
//}





//
//package FunktionalProgramming;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static FunktionalProgramming.Imperative.Main.Gender.*;
//
//public class Main {
//    public static void main(String[] args) {
//        List<Person> people = List.of(
//                new Person("John", MALE),
//                new Person("Maria", FEMALE),
//                new Person("Aisha", FEMALE),
//                new Person("Alex", MALE),
//                new Person("Alice", FEMALE)
//        );
//        // Imperative Approach:
//        List<Person> females = new ArrayList<>();// jzt müssen wir durch die personen iterieren:
//        for (Person person : people) {
//            if (FEMALE.equals(person.gender)) {
//                females.add(person);
//            }
//        }
//
//        for (Person female : females) {// anstatt people mach ich das hier females.
//            System.out.println(female);
//        }
//        // wenn wir das jzt ausführen bekommen wir einen list von females, und darum gehts in imperative approach also wir müssen jeder kleine detail definieren, und wir können sehen das dass viel code ist, lass uns das aber mit deklarative approach machen.
////    }
//    static class Person{
//        private final String name;
//        private final Gender gender;
//
//        Person(String name, Gender gender) {
//            this.name = name;
//            this.gender = gender;
//        }
//
//        @Override
//        public String toString() {
//            return "Person{" +
//                    "name='" + name + '\'' +
//                    ", gender=" + gender +
//                    '}';
//        }
//    }
//    enum Gender{
//        MALE, FEMALE
//    }
//}








//
//package FunktionalProgramming.Imperative;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//import static FunktionalProgramming.Imperative.Main.Gender.*;
//
//public class Main {
//    public static void main(String[] args) {
//        List<Person> people = List.of(
//                new Person("John", MALE),
//                new Person("Maria", FEMALE),
//                new Person("Aisha", FEMALE),
//                new Person("Alex", MALE),
//                new Person("Alice", FEMALE)
//        );
//        System.out.println("imperative approach");
//        // Imperative Approach:
//        List<Person> females = new ArrayList<>();
//        for (Person person : people) {
//            if (FEMALE.equals(person.gender)) {
//                females.add(person);
//            }
//        }
//
//        for (Person female : females) {
//            System.out.println(female);
//        }
//        System.out.println("deklarative approach");
//        // Deklarative approach:
//        //        ein stream ermöglicht es uns auf abstrakt mode zu wechseln, damit wir ihm sagen können was wir genau machen müssen .
//        people.stream()
//                .filter(person -> FEMALE.equals(person.gender))
//                .collect(Collectors.toList())
//                .forEach(System.out::println);
//        }// also hier sage ich einfach was ich genau machen möchte, und zwar vom person array list möchte ich die Female personen, dann sammle ich die alle um sie in einer Liste hinzuzufügen, und dann am Ende iteriere ich durch diese personen um sie auszudrücken.
//    static class Person{
//        private final String name;
//        private final Gender gender;
//
//        Person(String name, Gender gender) {
//            this.name = name;
//            this.gender = gender;
//        }
//
//        @Override
//        public String toString() {
//            return "Person{" +
//                    "name='" + name + '\'' +
//                    ", gender=" + gender +
//                    '}';
//        }
//    }
//    enum Gender{
//        MALE, FEMALE
//    }
//}





//in java.util package gibt es viele funktionale interfaces die target types die in lambda-Ausdrücke und referenz methoden verwendet werden könnten. ein paar interfaces davon sind die BiConsumer, BiFunktion, BinaryOperator, BiPredicate, BooleanSupplier, Consumer, doubleBinaryOperator und doubleConsumer interface und vieles mehr, aber was wir am meisten verwenden sind die Functions, BiFunctions, Predicates, BiPredicates, consumer, BiConsumer, Supplier und BiSupplier.


// Predicate :
// präsentiert ein boolean value function mit einem Argument.

// in unserem Beispiel, wenn wir unser filter funktion extractieren, finden wir dass das ein predicate ist:
//
//
//package FunktionalProgramming.Imperative;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.function.Predicate;
//import java.util.stream.Collectors;
//
//import static FunktionalProgramming.Imperative.Main.Gender.*;
//
//public class Main {
//    public static void main(String[] args) {
//        List<Person> people = List.of(
//                new Person("John", MALE),
//                new Person("Maria", FEMALE),
//                new Person("Aisha", FEMALE),
//                new Person("Alex", MALE),
//                new Person("Alice", FEMALE)
//        );
//        System.out.println("imperative approach");
//        // Imperative Approach:
//        List<Person> females = new ArrayList<>();
//        for (Person person : people) {
//            if (FEMALE.equals(person.gender)) {
//                females.add(person);
//            }
//        }
//
//        for (Person female : females) {
//            System.out.println(female);
//        }
//        System.out.println("deklarative approach");
//        // Deklarative approach:
//
//        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);// also ein predicate akzeptiert einen person, und gibt true oder false zurück.
//        people.stream()
//                .filter(personPredicate)//********option+command+V
//                .collect(Collectors.toList())
//                .forEach(System.out::println);
//    }
//    static class Person{
//        private final String name;
//        private final Gender gender;
//
//        Person(String name, Gender gender) {
//            this.name = name;
//            this.gender = gender;
//        }
//
//        @Override
//        public String toString() {
//            return "Person{" +
//                    "name='" + name + '\'' +
//                    ", gender=" + gender +
//                    '}';
//        }
//    }
//    enum Gender{
//        MALE, FEMALE
//    }
//}









package FunktionalProgramming.Imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static FunktionalProgramming.Imperative.Main.Gender.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE)
        );
        System.out.println("imperative approach");
        // Imperative Approach:
        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if (FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println(female);
        }
        System.out.println("deklarative approach");
        // Deklarative approach:

        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);// also ein predicate akzeptiert einen person, und gibt true oder false zurück.
        people.stream()
                .filter(personPredicate)//********option+command+V
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
    static class Person{
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum Gender{
        MALE, FEMALE
    }
}







//Ich möchte eine neue package erstellen mit der name FunctionalInterface und innerhalb von dieser package erstelle ich eine klasse mit der name _Funtion

