package lesson1;

public class Spulmachine extends Devices{
    boolean gibtEsGeschir;

    public Spulmachine(boolean isItWorking, boolean gibtEsGeschir) {
        super(isItWorking);
        this.gibtEsGeschir = gibtEsGeschir;
    }

    public String AtHome(boolean gibtEsGeschir){
        if (true){
            boolean IsItWorking = true;
            return "Посудомоечная машина включена";
        }else{
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
