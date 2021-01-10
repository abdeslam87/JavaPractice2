package methodpractice;

public class StaticAndNonStatic {

    public static void main(String[] args) {
        StaticAndNonStatic staticAndNonStatic = new StaticAndNonStatic();
        staticAndNonStatic.printmyhaircolor();
        staticAndNonStatic.printmyeyescolor();
        printmygender();
        printmyhomecountry();

    }

    public static void printmygender() {             // static method
        System.out.println("male");


    }

    public static void printmyhomecountry() {        // static method
        System.out.println("algeria");


    }

    public void printmyhaircolor() {             // non static method
        System.out.println("black");


    }

    public void printmyeyescolor() {                // non static method
        System.out.println("brown");

    }


}
