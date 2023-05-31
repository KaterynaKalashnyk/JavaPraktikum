package Praktikum1;

public class Spulmachine extends Devices{
    private boolean gibtEsGeschir;

    public Spulmachine(boolean isItWorking, boolean gibtEsGeschir) {
        super(isItWorking);
        this.gibtEsGeschir = gibtEsGeschir;
    }

    public boolean isGibtEsGeschir() {
        return gibtEsGeschir;
    }

    public String AtHome() {
        if (isPersonAtHome() && gibtEsGeschir) {
            boolean IsItWorking = true;
            return "Посудомоечная машина включена";
        } else if (!isPersonAtHome() && gibtEsGeschir){
            boolean IsItWorking = true;
            return "Посудомоечная машина включена";
        }else {
            return "Посудомоечная машина выключена";
        }
    }
    public String Status(boolean IsItWorking){
        if (true){
            return " Посудомоечная машина работает";
        }else{
            return "Посудомоечная машина не работает";
        }
    }
}
