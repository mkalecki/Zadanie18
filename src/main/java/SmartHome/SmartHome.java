package SmartHome;

public class SmartHome {


    public SmartHome() {

        StacjaPogodowa pogoda = new StacjaPogodowa();
        System.out.println(pogoda.info());

        SterownikGlosnika glosnik = new SterownikGlosnika(pogoda);
        System.out.println(glosnik.getKomunikat());

        SterownikPieca piec = new SterownikPieca(pogoda);
        System.out.println(piec.getInfo());

        SterownikRolet rolety = new SterownikRolet(pogoda);
        System.out.println(rolety.getInfo());
    }



}
