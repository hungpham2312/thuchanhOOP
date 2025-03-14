package baith10.bai2;

public class Knight extends Character {
    public Knight(String name) {
        super(name);
        this.weapon = new SwordBehavior(); // Mặc định dùng kiếm
    }
}
