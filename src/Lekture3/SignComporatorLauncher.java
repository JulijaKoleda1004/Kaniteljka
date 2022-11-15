package Lekture3;

public class SignComporatorLauncher {
    public static void main(String[] args) {
        SignComporator signComporator = new SignComporator();
        System.out.println(signComporator.compare(0));
        System.out.println(signComporator.compare(-1));
        System.out.println(signComporator.compare(1));

    }
}
