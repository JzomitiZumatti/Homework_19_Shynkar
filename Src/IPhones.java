public class IPhones implements Smartphones, IOS{

    @Override
    public void iosLoad() {
        System.out.println("Loading operating system, wait .... IOS loaded successful.");
    }

    @Override
    public void call() {
        System.out.println("Calling by using iPhone.");
    }

    @Override
    public void sms() {
        System.out.println("Type sms by using iPhone.");
    }

    @Override
    public void internet() {
        System.out.println("Surfing internet by using iPhone.");
    }

    @Override
    public void helloSiri() {
        System.out.println("Hello, I'm Siri. How can I help you?");
    }
}
