/**
 Author: Cody Rose, codytrose@gmail.com, 12/8/16
*/
package monster;
/**
 This class is a derived class of Monster.
 */
public class Goblin extends Monster {
    
    private int level;
    private String name = "Goblin";
    
    public Goblin() // Default constructor
    {
        super();
        level = 0;
    }
    
    public Goblin(int playerLevel)
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
    
    public void getMonster()
    {
        System.out.println("You are fighting a " + name);
        System.out.println("Level: " + level);
        System.out.println("Health: " + setHealth());
        System.out.println("Attack: " + setAttack());
        System.out.println("Defense: " + setDefense());  
    }
    
}
