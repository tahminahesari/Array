public class Voetbalclub {

        String naam;
        String afkorting;
        int jaar;

    public Voetbalclub(String naam, String afkorting, int jaar) {
        this.naam = naam;
        this.afkorting = afkorting;
        this.jaar = jaar;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getAfkorting() {
        return afkorting;
    }

    public void setAfkorting(String afkorting) {
        this.afkorting = afkorting;
    }

    public int getJaar() {
        return jaar;
    }

    public void setJaar(int jaar) {
        this.jaar = jaar;
    }
}


