/**
 *
 * @author Kulindu Kodithuwakku
 */
package com.mycompany.lab09_2;

public class Lab09_2 {

    public static void main(String[] args) 
    {
        Movements RegularPlayer = new RegularPlayer();
        RegularPlayer.MoveUp();
        RegularPlayer.MoveDown();
        RegularPlayer.MoveLeft();
        RegularPlayer.MoveRight();
        
        Movements JumpingPlayer = new JumpingPlayer();
        JumpingPlayer.MoveUp();
        JumpingPlayer.MoveDown();
        JumpingPlayer.MoveLeft();
        JumpingPlayer.MoveRight();
        
        Movements CrouchingPlayer = new CrouchingPlayer();
        CrouchingPlayer.MoveUp();
        CrouchingPlayer.MoveDown();
    }
}
