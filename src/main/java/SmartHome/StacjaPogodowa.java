package SmartHome;

import java.util.Random;

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

    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public OpisPogody getOpisPogody() {
        return opisPogody;
    }

    public void setOpisPogody(OpisPogody description) {
        this.opisPogody = description;
    }

//    }

    public String info (){
        return "pobieram informacje o pogodzie... ";
    }
}
