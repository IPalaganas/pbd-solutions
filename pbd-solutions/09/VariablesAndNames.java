// nothing happens since there is no need for decimals in this
// a floating point number means there are decimals
// 
public class VariablesAndNames {
    public static void main(String[] args) {
        int cars, drivers, passengers, carsNotDriven, carsDriven;
        double spaceInCar, carpoolCapacity, averagePassengersPerCar;
        // there are 100 cars
        cars = 100;
        // there are 4 spaces in each car
        spaceInCar = 4.0;
        // there are 30 drivers 
        drivers = 30;
        // there are 90 passengers
        passengers = 90; 
        // the cars that arent driven are the # of cars mninus the drivers (100 - 30)=70
        carsNotDriven = cars - drivers;
        // cars driven are the same as the number of drivers = 30
        carsDriven = drivers;
        // the capacity of people that can carpool is the amount of cars driven times the space in each car (30*4)=120
        carpoolCapacity = carsDriven * spaceInCar;
        // the average amount of passengers per car is the amount of passengers divided by the cars driven (90/30)=3
        averagePassengersPerCar = passengers / carsDriven;
        
        System.out.println("There are " + cars + " cars available.");
        System.out.println("There are only " + drivers + " drivers available.");
        System.out.println("There will be " + carsNotDriven + " empty cars today.");
        System.out.println("We can transport " + carpoolCapacity + " people today.");
        System.out.println("We have " + passengers + " to carpool today.");
        System.out.println("We need to put about " + averagePassengersPerCar + " in each car.");
    }
}   
        
