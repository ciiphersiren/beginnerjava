import magic.potions.HealingPotion;
import magic.potions.InvisibilityPotion;
import magic.potions.StrengthPotion;

public class PotionShop {
    public static void main(String[] args) {
        HealingPotion healingPotion = new HealingPotion();
        InvisibilityPotion invisibilityPotion = new InvisibilityPotion();
        StrengthPotion strengthPotion = new StrengthPotion();

        healingPotion.brew();
        invisibilityPotion.brew();
        strengthPotion.brew();
    }
}
