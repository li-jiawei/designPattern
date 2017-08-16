package patterns.adapter.example2;

/**
 * Created by Jiawei on 7/12/17.
 */

// This is the Target Interface : This is what the client
// expects to work with. It is the adapters job to make new
// classes compatible with this one.

public interface EnemyAttacker {

    public void fireWeapon();

    public void driveForward();

    public void assignDriver(String driverName);

}