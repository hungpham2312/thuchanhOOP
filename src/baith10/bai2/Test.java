package baith10.bai2;

// Test class
public class Test {
    public static void main(String[] args) {
        Character knight = new Knight("Arthur");
        Character king = new King("King Arthur");
        Character queen = new Queen("Queen Arthur");
        Character troll = new Troll("Troll Arthur");

        knight.fight();
        king.fight();
        queen.fight();
        troll.fight();


        // Thay đổi vũ khí
        System.out.println("\nWeapon change:");
        knight.setWeapon(new AxeBehavior());
        king.fight();
        queen.setWeapon(new SwordBehavior());
        queen.fight();
        troll.setWeapon(new ClubBehavior());
        troll.fight();

    }
}

