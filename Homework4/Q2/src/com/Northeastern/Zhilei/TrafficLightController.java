package com.Northeastern.Zhilei;

public class TrafficLightController {
    public boolean RoadOneGreenIsOn = true;
    public static Object obj = new Object();
    public void carArrived(int carId, int roadId, int direction, Runnable turnGreen, Runnable crossCar) {
        synchronized(obj) {
            try {
                if ((roadId == 1 && !RoadOneGreenIsOn) || (RoadOneGreenIsOn && roadId == 2)) {
                    turnGreen.run();
                    RoadOneGreenIsOn = !RoadOneGreenIsOn;
                }
                crossCar.run();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
