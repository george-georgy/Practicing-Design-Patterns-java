package structural.Adapter;

// Target
// This is the client expects to work with
public interface EnemyAttacker {

     void fireWeapon();
     void driveForward();
     void assignDriver(String driverName);
}
