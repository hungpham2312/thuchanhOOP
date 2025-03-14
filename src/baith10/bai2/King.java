package baith10.bai2;

public class King extends Character {
    public King(String name) {
        super(name);
        this.weapon = new SwordBehavior(); // Mặc định dùng kiếm
    }
}
