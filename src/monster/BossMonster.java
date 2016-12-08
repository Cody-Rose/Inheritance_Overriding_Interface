/**
 Author: Cody Rose, codytrose@gmail.com, 12/8/16
*/
package monster;
/**
 This class was made to show that multiple classes can follow one interface. The
 interface MonseterParameters has a description of all methods used.
*/
public class BossMonster implements MonsterParameters{
    
    public static final int SUCCESS = 80;
    public static final int FAILURE = 10;
    private double baseAttack;
    private double defense;
    private double health;
    private int level;
    private double attack;
    private double secondaryAttack; // For a secondary attack.

    public BossMonster() // Default constructor
    {
        attack = 0;
        defense = 0;
        health = 0;
        level = 0;
        baseAttack = 0;
        secondaryAttack = 0;
    }
    
    public BossMonster(int playerLevel)
    {
        int sign = (int) (Math.random() * 2 + 1);
        int random = (int) (Math.random() * 3);
                
        if(sign == 1)
        {
            level = playerLevel - random;
        }
        else
        {
            level = playerLevel + random;
        }
    }
    
    public double setHealth()
    {
        health = 500 + (level * 10);
        return (int)health;
    }
    
    
    
    public double setBaseAttack()
    {
        baseAttack = 20 + (level - 10);
        return (int)baseAttack;    
    }
    
    public double setDefense()
    {
        defense = 10 + (level - 10);
        return (int)defense;
    }
    
    public double setAttack()
    {
        int random = (int) (Math.random() * 100 + 1);
        if (random >= FAILURE) // Critical failure
        {
            attack = setBaseAttack() - (setBaseAttack() * 0.25); 
        }
        else if(random <= SUCCESS) // Critical attack
        {
            attack = setBaseAttack() + (setBaseAttack() * 0.25);
        }
        else // Normal attack
        {
            attack = setBaseAttack();
        }
        return (int)attack;
    }    
    /**
     Sets up a secondary attack for the Boss Monster to use. 
    */
    public double setSecondaryAttack()
    {
        double random = (int) (Math.random() * setBaseAttack() + 1);
        secondaryAttack = setBaseAttack() - (random/2);
        return (int)secondaryAttack;
    }
    
    public void getMonster()
    {
        System.out.println("You are fighting The Boss Monster");
        System.out.println("Level: " + level);
        System.out.println("Health: " + setHealth());
        System.out.println("Attack: " + setAttack());
        System.out.println("His massive attack causes a shockwave that hits you" 
                + " for" + secondaryAttack);
        System.out.println("Defense: " + setDefense());    
    }    
}
