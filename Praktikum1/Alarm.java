package Praktikum1;

public class Alarm extends Devices{

    public Alarm(boolean isItWorking) {
        super(isItWorking);
    }
    public String AtHome(){
        if (isPersonAtHome()){
            boolean IsItWorking = false;
            return "Сигнализация выключена";
        }else{
            return "Сигнализация включена";
        }
    }

    public String Status(boolean IsItWorking){
        if (true){
            return "Сигнализация работает";
        }else{
            return "Сигнализация не работает";
        }
    }
}
