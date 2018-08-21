//package SmartHome;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//public class AppConfig {
//
//    @Bean
//    public StacjaPogodowa pogoda() {
//        System.out.println("Tworzę stacjePogodową");
//
//        StacjaPogodowa pogoda = new StacjaPogodowa();
//        return pogoda;
//    }
//
//    @Bean
//    public SterownikPieca piec(StacjaPogodowa pogoda) {
//        System.out.println("tworze ster pieca");
//        SterownikPieca piec = new SterownikPieca(pogoda);
//        return piec;
//    }
//
//    @Bean
//    public SterownikGlosnika glosnik(StacjaPogodowa pogoda) {
//        System.out.println("tworze ster glosnika");
//        SterownikGlosnika glosnik = new SterownikGlosnika(pogoda);
//        return glosnik;
//    }
//
//    @Bean
//    public SterownikRolet rolety(StacjaPogodowa pogoda) {
//        System.out.println("tworze ster rolet");
//        SterownikRolet rolety = new SterownikRolet(pogoda);
//        return rolety;
//    }
//
//
//}
