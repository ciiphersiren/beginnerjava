public interface MagicalCreature {
    void castSpell();

    void fly();

    void disappear();
}

class Dragon implements MagicalCreature {
    @Override
    public void castSpell() {
        System.out.println("The Dragon is casting a fire breath spell!");
    }

    @Override
    public void fly() {
        System.out.println("The Dragon is flying majestically in the sky!");
    }

    @Override
    public void disappear() {
        System.out.println("The Dragon is disappearing into a cloud of smoke!");
    }
}

class Unicorn implements MagicalCreature {
    @Override
    public void castSpell() {
        System.out.println("The Unicorn is casting a healing spell!");
    }

    @Override
    public void fly() {
        System.out.println("The Unicorn is flying over the rainbow!");
    }

    @Override
    public void disappear() {
        System.out.println("The Unicorn is disappearing into a mist!");
    }
}

class Phoenix implements MagicalCreature {
    @Override
    public void castSpell() {
        System.out.println("The Phoenix is casting a rebirth spell!");
    }

    @Override
    public void fly() {
        System.out.println("The Phoenix is soaring high with fiery wings!");
    }

    @Override
    public void disappear() {
        System.out.println("The Phoenix disappears in a burst of flames!");
    }
}

class MagicalAdventure {
    public static void main(String[] args) {
        MagicalCreature dragon = new Dragon();
        MagicalCreature unicorn = new Unicorn();
        MagicalCreature phoenix = new Phoenix();

        dragon.castSpell();
        dragon.fly();
        dragon.disappear();

        unicorn.castSpell();
        unicorn.fly();
        unicorn.disappear();

        phoenix.castSpell();
        phoenix.fly();
        phoenix.disappear();
    }
}
