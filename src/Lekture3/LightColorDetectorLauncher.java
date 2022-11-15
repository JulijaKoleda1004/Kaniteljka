package Lekture3;

public class LightColorDetectorLauncher {
    public static void main(String[] args) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        System.out.println(lightColorDetector.derector(300));
        System.out.println(lightColorDetector.derector(381));
        System.out.println(lightColorDetector.derector(450));
        System.out.println(lightColorDetector.derector(495));
        System.out.println(lightColorDetector.derector(590));
        System.out.println(lightColorDetector.derector(570));
        System.out.println(lightColorDetector.derector(620));
    }
}
