package Adapter;

import java.util.Random;

// Adaptee
// EnemyRobot has no need for EnemyAttacker's methods ,we need to used adapter.
// EnemyRobot and EnemyAttacker are incompatible interfaces.
public class EnemyRobot {

    Random gen = new Random();


    public void smashWithHands(){
        int attackDamage =  gen.nextInt(10) + 1;

        System.out.println("Enemy Robot Causes " + attackDamage + " Damage With Its Hands");
    }

    public void walkForward(){
        int movement = gen.nextInt(5) + 1;

        System.out.println("Enemy Robot Walks Forward " + movement + " Spaces");

    }

    public void reachToHuman(String driverName){
        System.out.println("Enemy Robot Tramps on " + driverName);
    }


}
