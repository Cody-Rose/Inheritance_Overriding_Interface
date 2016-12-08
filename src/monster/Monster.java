/**
 Author: Cody Rose, codytrose@gmail.com, 12/8/16
*/
package monster;

/**
 This class is the base class of Goblin and Troll. The interface MonseterParameters
 has a description of all methods used.
*/
public class Monster implements MonsterParameters{

public static final int SUCCESS = 90;
public static final int FAILURE = 10;
private double baseAttack;
private double defense;
private double health;
private double attack;
public int level;

public Monster() // Default constructor
{
    attack = 0;
    defense = 0;
    health = 0;
    baseAttack = 0;
    level = 0;
}

public Monster(int playerLevel)
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
    health = 100 + (level * 10);
    return (int)health;
}



public double setBaseAttack()
{
    baseAttack = 10 + (level - 10);
    return (int)baseAttack;    
}

public double setDefense()
{
    defense = 5 + (level - 10);
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

public void getMonster()
{
    System.out.println("You are fighting a Generic Monster");
    System.out.println("Level: " + level);
    System.out.println("Health: " + setHealth());
    System.out.println("Attack: " + setAttack());
    System.out.println("Defense: " + setDefense());
    
}
}
