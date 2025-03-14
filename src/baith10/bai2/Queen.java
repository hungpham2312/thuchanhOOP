package baith10.bai2;

public class Queen extends Character {
    public Queen(String name) {
        super(name);
        this.weapon = new KnifeBehavior(); // Mặc định dùng kiếm
    }
}
