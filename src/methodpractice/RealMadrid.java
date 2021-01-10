package methodpractice;

public class RealMadrid {
    public static void main(String[] args) {
        stadiumname();
        RealMadrid realMadrid = new RealMadrid();
        realMadrid.bestplayer();


    }

    // static method
    public static void stadiumname() {
        System.out.println("bernabeu");


    }

    // non static method
    public void bestplayer() {
        System.out.println("messi");

    }
}


