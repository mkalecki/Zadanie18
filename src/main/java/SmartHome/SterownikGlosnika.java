package SmartHome;

public class SterownikGlosnika {

    private String komunikat;

    public SterownikGlosnika(StacjaPogodowa pogoda){
        komunikat = "Dzień dobry. Dzisiejsza temperatura to " + pogoda.getTemperature() +
                "*C, " + pogoda.getOpisPogody();
    }

    public String getKomunikat() {
        return komunikat;
    }

    public void setKomunikat(String komunikat) {
        this.komunikat = komunikat;
    }
}
