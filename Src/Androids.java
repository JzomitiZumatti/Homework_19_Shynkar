public class Androids implements Smartphones, LinuxOS {

    @Override
    public void linuxOSLoad() {
        System.out.println("Loading operating system, wait .... Linux OS loaded successful.");
    }
    @Override
    public void call() {
        System.out.println("Calling by using Android smartphone.");
    }

    @Override
    public void sms() {
        System.out.println("Type sms by using Android smartphone.");
    }

    @Override
    public void internet() {
        System.out.println("Surfing internet by using Android smartphone.");
    }

    @Override
    public void okGoogle() {
        System.out.println("Hello, I'm Google assistant. How can I help you?");
    }
}
