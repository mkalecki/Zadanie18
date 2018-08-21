package SmartHome;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class StacjaPogodowa {
    private int temperature;
    private OpisPogody opisPogody;

    public StacjaPogodowa() {

        Random generator = new Random();
        this.temperature = generator.nextInt(60)-25;

        int x = generator.nextInt(3);
        if (x==0)
            this.opisPogody = OpisPogody.SLONECZNIE;
        if (x==1)
            this.opisPogody = OpisPogody.CZESCZACHM;
        if (x==2)
            this.opisPogody = OpisPogody.POCHMURNO;
        System.out.println("pobieram infermacje o pogodzie..." );
    }

    public int getTemperature() {
        return temperature;
    }

    public OpisPogody getOpisPogody() {
        return opisPogody;
    }

    public String info (){
        return "pobieram informacje o pogodzie... ";
    }
}
