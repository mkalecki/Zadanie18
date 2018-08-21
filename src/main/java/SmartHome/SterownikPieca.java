package SmartHome;

import org.springframework.stereotype.Component;

@Component
public class SterownikPieca {

    private boolean isOn;
    private String info;

    public SterownikPieca(StacjaPogodowa pogoda) {
        if (pogoda.getTemperature() < 15) {
            this.isOn = true;
            this.info = "Jest zimno, uruchamiam piec";
        } else {
            this.isOn = false;
            this.info = "Jest ciepło, nie uruchamiam pieca";
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public void run() {
        System.out.println(info);
    }

}
