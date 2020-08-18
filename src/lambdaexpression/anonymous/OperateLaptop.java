package lambdaexpression.anonymous;

public class OperateLaptop {

    public static void main(String[] args) {
        //Please implement anonymous class for interface laptop
        Laptop laptop = new Laptop() {
            @Override
            public void ramSize(int memorySize) {
                System.out.println("Laptop ram size is " + memorySize);
            }

            @Override
            public void monitorSize(int screenSize){
                System.out.println("Monitor size is "+ screenSize);
            }
        };

        laptop.monitorSize(16);
        laptop.monitorSize(15);

        Phone phone = new Phone(){
            @Override
            public void cellularNetwork(String provider){
                System.out.println("cell provider is " + provider);
            }
        };
        phone.cellularNetwork("Verizon");
        //please implement anonymous function for Phone FunctionalInterface
    }
}
