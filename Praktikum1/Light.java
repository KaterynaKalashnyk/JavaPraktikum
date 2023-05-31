package Praktikum1;

public class Light extends Devices{
    public Light(boolean isItWorking) {
        super(isItWorking);
    }

    public String AtHome(){
        if (isPersonAtHome()){
            boolean IsItWorking = true;
            return "Свет включен";
        }else{
            return "Свет выключен";
        }
    }
    public String Status(boolean IsItWorking){
        if (true){
            return "Свет работает";
        }else{
            return "Свет не работает";
        }
    }
}
