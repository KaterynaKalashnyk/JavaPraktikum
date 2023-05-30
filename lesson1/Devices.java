package lesson1;

public abstract class Devices {
    boolean IsItWorking;

    public Devices(boolean isItWorking) {
        IsItWorking = isItWorking;
    }

    public abstract String AtHome(boolean PersonAtHome);
    public abstract String Status(boolean IsItWorking);

}
