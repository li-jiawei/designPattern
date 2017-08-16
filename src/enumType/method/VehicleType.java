package enumType.method;

/**
 * Created by Jiawei on 7/10/17.
 */
public enum VehicleType {

    TRUCK{
        class Truck extends Vehicle {
        }

        @Override
        Vehicle getVehicle() {
            return new Truck();
        }
    },
    CAR{
        class Car extends Vehicle {
        }

        @Override
        Vehicle getVehicle() {
            return new Car();
        }
    },
    ELECTRIC{
        class ElectricCar extends Vehicle {
        }

        @Override
        Vehicle getVehicle() {
            return new ElectricCar();
        }
    };

    abstract Vehicle getVehicle();

    private class Vehicle {
    }
}
