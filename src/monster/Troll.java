/**
 Author: Cody Rose, codytrose@gmail.com, 12/8/16
*/
package monster;
/**
 This class is a derived class of Monster. It also uses the process of overriding.
*/
public class Troll extends Monster {
    
    private String name = "Troll";
    private double health;
    private double baseAttack;
    private double defense;
    private int level;
    
    public Troll() // Default constructor
    {
        super();
        health = 0;
        baseAttack = 0;
        defense = 0;
        level = 0;
    }
    
    public Troll(int playerLevel)
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
        health = 200 + (level * 10);
        return (int)health;
    }

    public double setBaseAttack()
    {
        baseAttack = 15 + (level - 10);
        return (int)baseAttack;    
    }

    public double setDefense()
    {
        defense = level - 10;
        return (int)defense;
    }
            
    public void getMonster()
{
    System.out.println("You are fighting a " + name);
    System.out.println("Level: " + level);
    System.out.println("Health: " + setHealth());
    System.out.println("Attack: " + setAttack());
    System.out.println("Defense: " + setDefense());
    
}
    
}
