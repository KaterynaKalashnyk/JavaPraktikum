package Praktikum1;

public class Praktikum1 {
    public static void main(String[] args) {
        Devices[] devices = {new Alarm(true),
                new Light(false),
                new TV(false),
                new Spulmachine(false, true)
        };
        for (int i = 0; i < devices.length; i++) {
            Devices device = devices[i];
            System.out.println(device.AtHome());
        }

    }


}
