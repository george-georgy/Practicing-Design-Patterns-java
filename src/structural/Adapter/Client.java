package structural.Adapter;

public class Client {

    public static void main(String[] args) {

        // EnemyTank is an ordinary EnemyAttacker that use EnemyAttacker's methods ( does not want to use adapter).
        System.out.println("The Enemy Tank ");

        EnemyTank rx7tank = new EnemyTank();
        rx7tank.assignDriver("Frank");
        rx7tank.driveForward();
        rx7tank.fireWeapon();

        // Adaptee
        System.out.println("The robot");

        EnemyRobot fredTheRobot = new EnemyRobot();
        fredTheRobot.reachToHuman("George");
        fredTheRobot.walkForward();
        fredTheRobot.smashWithHands();


        // structural.Adapter
        System.out.println("The Robot with structural.Adapter");

        EnemyAttacker robotAdapter = new EnemyRobotAdapter(fredTheRobot);
        robotAdapter.assignDriver("Mark");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();

    }
}
