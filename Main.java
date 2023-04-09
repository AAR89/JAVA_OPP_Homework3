package JAVA_OPP_Homework3;

public class Main {
    public static void main(String[] args) {
        Team<Archer> archers = new Team<>();
        Team<Knight> knights = new Team<>();
        Archer archer1 = new Archer("Robin", 100, new Bow(20));
        Archer archer2 = new Archer("Bobin", 100, new Bow(15));
        Team<Archer> archers1 = archers.addPersons(archer1)
                .addPersons(archer2);
        knights.addPersons(new Knight("John", 150, new Knife()))
                .addPersons(new Knight("Adam", 150, new Knife()));
        Battle fight = new Battle(archer1, archer2);
        fight.run();
    }
}