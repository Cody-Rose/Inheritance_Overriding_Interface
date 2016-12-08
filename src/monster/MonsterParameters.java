/**
 Author: Cody Rose, codytrose@gmail.com, 12/8/16
*/
package monster;
/**
 An interface for methods that define a monster.
 precondition: double indicating players level.
*/
public interface MonsterParameters {
    //Defines minimum number needed for a critical success.
    public static final int SUCCESS = 90;
    //Defines maximun number possible for a critical failure.
    public static final int FAILURE = 10;
    /** Sets the monsters health. */
    public double setHealth();
    /** 
     Sets the monsters attack before checking to see if critical damage 
     should be added or subtracted. 
    */
    public double setBaseAttack();
    /** Sets the monsters defense. */
    public double setDefense();
    /** Decides if the monsters attack is normal, or a critical success or failure */
    public double setAttack();
    /** Prints out the monsters stats. */
    public void getMonster();
    
}
