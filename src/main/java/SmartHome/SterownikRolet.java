package SmartHome;

import org.springframework.stereotype.Component;

@Component
public class SterownikRolet {

    private boolean closed;
    private String info;

    public SterownikRolet(StacjaPogodowa pogoda) {
        if (pogoda.getOpisPogody() == OpisPogody.SLONECZNIE) {
            this.closed = true;
            this.info = "jest słonecznie, zasłaniam rolety";
        } else {

            this.closed = false;
            this.info = "Na niebie są chmury, nie będę zasłaniać rolet";
        }
    }

    public boolean isClosed() {
        return closed;
    }


    public void run() {
        System.out.println(info);
    }


}
