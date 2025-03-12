package structural.Adapter;

// structural.Adapter
public class EnemyRobotAdapter implements EnemyAttacker {

    // reference of adaptee
    EnemyRobot theRobot;

    public EnemyRobotAdapter(EnemyRobot enemyRobot) {
        theRobot = enemyRobot;
    }

    @Override
    public void fireWeapon() {
        theRobot.smashWithHands();
    }

    @Override
    public void driveForward() {
        theRobot.walkForward();
    }

    @Override
    public void assignDriver(String driverName) {

        theRobot.reachToHuman(driverName);
    }
}
