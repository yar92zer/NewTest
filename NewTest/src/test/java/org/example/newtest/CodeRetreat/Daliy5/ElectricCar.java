package org.example.newtest.CodeRetreat.Daliy5;

class ElectricCar  extends Car {
    private int batteryLevel = 100;

    public ElectricCar(String model, int price, String vin){
        super(model, price,vin);
    }
    public void testDrive(){
        if (batteryLevel >=20){
            batteryLevel -=20;
        }else{
            System.out.println(model + ": Not enough batter for test drive!");
        }
    }
    @Override
    public String toString(){
        return "EV: "+ model + " ($" + price + ") VIN: " + vin +", Battery: " + batteryLevel + "%";
    }
}