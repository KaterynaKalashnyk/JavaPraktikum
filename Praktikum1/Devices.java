package Praktikum1;

public abstract class Devices {
    private boolean IsItWorking;
    private boolean personAtHome;

    public boolean isPersonAtHome() {
        return personAtHome;
    }


    public Devices(boolean isItWorking) {
        IsItWorking = isItWorking;
    }

    public abstract String AtHome();
    public abstract String Status(boolean IsItWorking);

}
