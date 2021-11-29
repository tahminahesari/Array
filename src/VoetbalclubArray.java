public class VoetbalclubArray {

    public static void main(String[] args) {
        Voetbalclub ajax = new Voetbalclub("Ajax Amsterdam", "AFCA", 1902);
        Voetbalclub psv = new Voetbalclub("PSV Eindhoven", "PSV", 1903);
        Voetbalclub utrecht = new Voetbalclub("FC Utrecht", "030", 1970);
        Voetbalclub az = new Voetbalclub("AZ Alkmaar", "AZ", 1980);

        Voetbalclub[] clubs = {ajax,psv,utrecht,az};

        System.out.println("Club op positie 0:" + clubs[2].getNaam());

    }
}
