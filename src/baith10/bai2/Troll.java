package baith10.bai2;

public class Troll extends Character {
    public Troll(String name) {
        super(name);
        this.weapon = new ClubBehavior(); // Mặc định dùng
    }
}
