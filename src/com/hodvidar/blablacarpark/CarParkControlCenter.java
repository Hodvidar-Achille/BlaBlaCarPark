package com.hodvidar.blablacarpark;

/**
 * Interface between the car park and the outside world.
 */
public interface CarParkControlCenter {

    /**
     *
     * @return the number of Sas allowing to make vehicles enter and leave the car park.
     */
    int getNumberOfSas();

    /**
     *
     * @return the number of vehicles currently inside the car park.
     */
    int getNumberOfVehiclesInside();

    /**
     *
     * @return the number of seconds needed before the car park can handle another action.
     */
    int getTimeBeforeNextPossibleAction();
}
