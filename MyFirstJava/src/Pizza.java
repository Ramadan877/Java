public class Pizza {
//(1)
    String bread;
    String sauce;
    String cheese;
    String topping;

    Pizza(String bread, String sauce, String cheese, String topping) { // jzt um unsere pizza zu erstellen, wir brauchen passende Argumente.

        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }


//        (2)
        // Jzt, overloaded konstruktoren haben die gleiche name, aber unterschiedliche parameters,

    Pizza(String bread, String sauce, String cheese){// die gleiche parameters aber ohne den topping.

        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;


    }
    Pizza(String bread, String sauce){// die gleiche parameters aber ohne den topping und cheese.

        this.bread = bread;
        this.sauce = sauce;

    }
}
