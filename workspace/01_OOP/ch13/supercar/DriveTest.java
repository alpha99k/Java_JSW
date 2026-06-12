package ch13.supercar;

public class DriveTest {
    static void main(String[] args) {
        GasolineCar gCar = new GasolineCar(3);
        HybridCar hCar = new HybridCar(5);
        ElectricCar eCar = new ElectricCar(7);
        PluginHybridCar pCar = new PluginHybridCar(9);
        Driver driver = new Driver();
        driver.drive(gCar);
        driver.drive(hCar);
        driver.drive(eCar);
        driver.drive(pCar);


        System.out.println("프로그램 종료");

    }
}
