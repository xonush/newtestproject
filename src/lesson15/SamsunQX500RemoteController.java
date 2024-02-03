package lesson15;
//If you are extanding and implementing , then extend class should be first and then implement interface as second
//Only one class can be extended from,but
public class SamsunQX500RemoteController implements RemoteController,FireStick{


    @Override
    public void turnOn() {
        System.out.println("Turn on the QX TV and show all the applications available");
    }

    @Override
    public void turnOff() {
        System.out.println("Close all running applications and then turn off the TV with special effects");

    }

    @Override
    public int moveUp() {

        System.out.println("Move the cursor up "  + "steps");
        return 0;
    }

    @Override
    public void turnOnAmazonApp() {
        
    }

    @Override
    public void TurnOffAmazonApp() {

    }

    @Override
    public void openPrimeVideos() {

    }
}
