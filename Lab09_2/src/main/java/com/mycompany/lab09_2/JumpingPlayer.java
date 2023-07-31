/**
 *
 * @author Kulindu Kodithuwakku
 */
package com.mycompany.lab09_2;

public class JumpingPlayer extends Movements
{
    @Override
    public void MoveUp()
    {
        System.out.println("Player jumped UP by 5 spaces");
    }
    
    @Override
    public void MoveDown()
    {
        System.out.println("Player jumped DOWN by 5 spaces");
    }
    
    @Override
    public void MoveLeft()
    {
        System.out.println("Player jumped LEFT by 5 spaces");
    }
    
    @Override
    public void MoveRight()
    {
        System.out.println("Player jumped RIGHT by 5 spaces");
    }
}
