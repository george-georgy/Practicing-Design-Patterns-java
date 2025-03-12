package creational.factory;

import java.util.Scanner;
// bad client code here is why we need creational.factory pattern
public class BadClient {

    public static void main(String[] args) {

        EnemyShip theEnemy = null;

        Scanner userInput = new Scanner(System.in);

        String enemyShipOption = "";

        System.out.println("What type of ship (U/R)");

        if(userInput.hasNextLine()){
            enemyShipOption = userInput.nextLine();
        }

        if(enemyShipOption.equals("U")){
            theEnemy = new UFOEnemyShip();
        }else if(enemyShipOption.equals("R")){
            theEnemy = new RocketEnemyShip();

        }

        doStuffEnemy(theEnemy);
    }

    // the following solution is not dynamic
    private static void doStuffEnemy(EnemyShip anEnemyShip) {

        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();

    }
}
