/**
 *
 * @author Kulindu Kodithuwakku
 */
package com.mycompany.lab09_2;

public class CrouchingPlayer extends Movements
{
    @Override
    public void MoveUp()
    {
        System.out.println("Player crouched UP by 2 spaces");
    }
    
    @Override
    public void MoveDown()
    {
        System.out.println("Player crouched DOWN by 2 spaces");
    }
    
    @Override
    public void MoveLeft()
    {
        System.out.println("Player crouched LEFT by 5 spaces");
    }
    
    @Override
    public void MoveRight()
    {
        System.out.println("Player crouched RIGHT by 5 spaces");
    }
}
