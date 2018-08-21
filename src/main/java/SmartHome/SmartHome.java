package SmartHome;

import org.springframework.stereotype.Component;

@Component
public class SmartHome {

    private SterownikGlosnika glosnik;
    private SterownikPieca piec;
    private SterownikRolet roleta;

    public SmartHome(SterownikGlosnika glosnik, SterownikPieca piec, SterownikRolet roleta) {
        this.glosnik = glosnik;
        this.piec = piec;
        this.roleta = roleta;
    }

    public void run() {
        glosnik.run();
        piec.run();
        roleta.run();
    }


//        StacjaPogodowa pogoda = new StacjaPogodowa();
//        System.out.println(pogoda.info());
//
//        SterownikGlosnika glosnik = new SterownikGlosnika(pogoda);
//        System.out.println(glosnik.getKomunikat());
//
//        SterownikPieca piec = new SterownikPieca(pogoda);
//        System.out.println(piec.getInfo());
//
//        SterownikRolet rolety = new SterownikRolet(pogoda);
//        System.out.println(rolety.getInfo());


}
