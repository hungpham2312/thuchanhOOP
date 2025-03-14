package baith10.bai2;

// Test class
public class Test {
    public static void main(String[] args) {
        Character knight = new Knight("Arthur");
        Character archer = new Archer("Robin");
        Character barbarian = new Barbarian("Conan");

        knight.fight();
        archer.fight();
        barbarian.fight();

        // Thay đổi vũ khí
        System.out.println("\nWeapon change:");
        knight.setWeapon(new AxeBehavior());
        archer.setWeapon(new SwordBehavior());

        knight.fight();
        archer.fight();
    }
}

