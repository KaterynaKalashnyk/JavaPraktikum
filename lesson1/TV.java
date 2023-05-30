package lesson1;

public class TV extends Devices{
    public TV(boolean isItWorking) {
        super(isItWorking);
    }
    public String AtHome(boolean PersonAtHome){
        if (true){
            boolean IsItWorking = true;
            return "Телевизор включен";
        }else{
            return "Телевизор выключена";
        }
    }
    public String Status(boolean IsItWorking){
        if (true){
            return " Телевизор работает";
        }else{
            return "Телевизор не работает";
        }
    }
}
