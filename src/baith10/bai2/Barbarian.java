package baith10.bai2;

public class Barbarian extends Character {
    public Barbarian(String name) {
        super(name);
        this.weapon = new AxeBehavior(); // Mặc định dùng rìu
    }
}
