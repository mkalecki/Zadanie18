package SmartHome;

import org.springframework.stereotype.Component;

public enum OpisPogody {
    POCHMURNO("jest pochmurno"),
    CZESCZACHM("niebo jest częściowo zachmurzone"),
    SLONECZNIE("jest słonecznie");

    private String opis;

    private OpisPogody(String opis) {
        this.opis = opis;
    }

    public void printOpis(){
        System.out.println(this.opis);
    }

    @Override
    public String toString() {
        return opis;
    }
}
