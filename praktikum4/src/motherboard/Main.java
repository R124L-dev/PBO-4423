package motherboard;

import java.util.Scanner;

class Motherboard {
    // static nested class
    static class USB {
        int getTotalPorts(int usb2, int usb3) {
            return usb2 + usb3;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // create an object of the static nested class
        // using the name of the outer class
        Scanner userInput = new Scanner(System.in);
        int usb2 = userInput.nextInt();
        int usb3 = userInput.nextInt();
        Motherboard.USB usb = new Motherboard.USB();
        System.out.println(usb.getTotalPorts(usb2, usb3));
    }
}
