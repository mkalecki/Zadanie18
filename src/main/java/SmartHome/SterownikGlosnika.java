package SmartHome;

import org.springframework.stereotype.Component;

@Component
public class SterownikGlosnika {

    private StacjaPogodowa stacjaPogodowa;

    public SterownikGlosnika(StacjaPogodowa pogoda){
        stacjaPogodowa = pogoda;
    }

    public void run() {
        System.out.println("Dzień dobry. Dzisiejsza temperatura to " + stacjaPogodowa.getTemperature() +
                "*C, " + stacjaPogodowa.getOpisPogody());
    }

}
