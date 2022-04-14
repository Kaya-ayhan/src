package week11;

public class TVs {

    public int channel = 1;
    public int volumLevel = 1;
    public boolean on = false;




    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setChannel(int newChannel) {
        if (on && newChannel >= 1 && newChannel <= 120) {
            channel = newChannel;
        }
    }

    public void setVolume(int newVolume) {
        if (on && newVolume >= 1 && newVolume <= 120) {
            volumLevel = newVolume;
        }
    }

    public String toString() {
        return "TV{" +
                "channel=" + channel +
                ", volumLevel=" + volumLevel +
                ", on=" + on +
                '}';
    }

    public void channelUp() {
        if (on && channel < 120)
            channel++;

    }

    public void channelDown() {
        if (on && channel > 1)
            channel--;

    }

}


