class MotherBoard {
    // static nested class
    static class USB{
        int getTotalPorts(){
            return usb2 + usb3;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        // create an object of the static nested class
        // using the name of the outer class
    }
}