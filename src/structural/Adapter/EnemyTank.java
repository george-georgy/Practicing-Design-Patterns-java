package structural.Adapter;

import java.util.Random;

// EnemyTank and EnemyAttacker are compatible interface
public class EnemyTank implements EnemyAttacker{

    Random gen = new Random();

    @Override
    public void fireWeapon() {
        int attackDamage = gen.nextInt(10) + 1;
        System.out.println("Enemy Tank Does " + attackDamage + " Damage");
    }

    @Override
    public void driveForward() {
        int movement = gen.nextInt(5) + 1;

        System.out.println("Enemy Tank Moves " + movement + " spaces");

    }

    @Override
    public void assignDriver(String driverName) {
        System.out.println(driverName + " is driving the tank");


    }
}
