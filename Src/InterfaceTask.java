public class InterfaceTask {
    public static void main(String[] args) {
        Androids androidSmartphone = new Androids();
        IPhones iPhone = new IPhones();

        System.out.println("Android smartphones");
        androidSmartphone.call();
        androidSmartphone.sms();
        androidSmartphone.internet();
        androidSmartphone.okGoogle();

        System.out.println("\niPhones");
        iPhone.call();
        iPhone.sms();
        iPhone.internet();
        iPhone.helloSiri();
    }
}
