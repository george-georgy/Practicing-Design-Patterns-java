package factory;

import java.util.Scanner;

// we encapsulated if statements in the old EnemyShipTesting by factory method
public class GoodClient {

    public static void main(String[] args) {
        EnemyShipFactory shipFactory = new EnemyShipFactory();

        EnemyShip theEnemy = null;

        Scanner userInput = new Scanner(System.in);

        System.out.println("What type Ship? (U / R / B)");

        if (userInput.hasNextLine()){
            String typeOfShip = userInput.nextLine();

            theEnemy = shipFactory.makeEnemyShip(typeOfShip);
        }


        if(theEnemy != null){
            doStuffEnemy(theEnemy);
        }else {
            System.out.println("Enter a U, R, or B");
        }
    }

    private static void doStuffEnemy(EnemyShip anEnemyShip) {

        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();

    }
}
