/**
 Author: Cody Rose, codytrose@gmail.com, 12/8/16
*/
package monster;

/**
 This program was designed for me to practice my understanding of interfaces,
 inheritance and overriding. This program uses the Monster, Goblin, Troll and
 BossMonster classes. It also uses the interface as a parameter for a method.
*/
public class MonsterType {
    
    /**
     precondition: interface MonsterParameters, class Monster, int
     postcondition: displays the methods double attack.
    */ 
    public static void display(MonsterParameters show)
    {
        double attack =  show.setAttack();
        System.out.println("You are fighting an unknown Orc with an attakc of " +
                attack + ". \nPrepair yourself!");
    }
    
    public static void main(String[] args) {
        Monster monster1 = new Monster(15);    
        monster1.getMonster();
        
        System.out.println();
        
        Goblin goblin1 = new Goblin(15);
        goblin1.getMonster();
        
        System.out.println();
        
        Troll troll1 = new Troll(15);
        troll1.getMonster();
        
        System.out.println();
        
        BossMonster boss1 = new BossMonster(15);
        boss1.getMonster();
        
        System.out.println();
        
        MonsterParameters orc = new Monster(10);
        display(orc);
        
    }
    
}
