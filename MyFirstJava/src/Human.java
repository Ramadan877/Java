public class Human {

    // für unsere konstruktur müssen wir eine name, age und weight definieren, aber das muss ausßerhalb unseres Konstruktur :

    String name ;
    int age;
    double weight;


    Human(String name, int age, double weight){// in diesem fall wir müssen genau diese Parameters in unserem konstruktur  verwenden!
//        (1)




        this.name = name;
        this.age = age;
        this.weight = weight;


//        (3)
        // aber wie können wir auf die Human Konstruktur vom Human klasse selber zugreifen !, lass uns sagen Human hat jetzt zwei methoden :

    }
    void eat(){
        System.out.println(this.name + " is eating!");
    }
    void drink(){
        System.out.println(this.name + " is drinking!");
    }
}