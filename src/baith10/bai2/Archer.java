package baith10.bai2;

public class Archer extends Character {
    public Archer(String name) {
        super(name);
        this.weapon = new BowBehavior(); // Mặc định dùng cung
    }
}

