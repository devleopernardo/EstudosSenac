import accounts.Checkingaccount;
import accounts.Savingsaccount;
import animais.Catiorro;
import drivable.Bike;
import drivable.Car;
import people.Pupil;
import people.Teacher;

public class App {
    public static void main(String[] args) throws Exception {
        // Objeto da Classe Catiorro
        Catiorro cachorro = new Catiorro("PC");

        cachorro.latir();

        System.out.println("----------------------");

        // Object from class Teacher
        Teacher thander = new Teacher("Thander", 55, "Phisics");

        thander.show();

        System.out.println("----------------------");

        // Object from class Pupil
        Pupil leo = new Pupil("Leonardo", 26, "Desenv.Sistemas");

        leo.show();

        System.out.println("----------------------");

        // Object from class Savings Account
        Savingsaccount fortrip = new Savingsaccount("4 a Travel", 90500, 15);

        fortrip.showdetails();

        System.out.println("\n----------------------");

        // Object from class Checking Account
        Checkingaccount fordaily = new Checkingaccount("656598 for daily pourposes", 79560, 5400550);

        fordaily.showdetails();

        System.out.println("\n----------------------");

        // Object from class Car
        Car dailydriver = new Car("Fiat", 2011, 2);

        dailydriver.details();

        // Object from class Byke
        Bike dailyrider = new Bike("Suzuki", 2007, 125);

        dailyrider.details();

    }
}
