package baith10.bai2;

// Lớp Character - đại diện cho các nhân vật trong trò chơi
abstract class Character {
    protected String name;
    protected WeaponBehavior weapon;

    public Character(String name) {
        this.name = name;
    }

    public void setWeapon(WeaponBehavior w) {
        this.weapon = w;
        System.out.println(name + " has switched to a new weapon.");
    }

    public void fight() {
        System.out.print(name + " is fighting: ");
        if (weapon != null) {
            weapon.useWeapon();
        } else {
            System.out.println("No weapon equipped!");
        }
    }
}

