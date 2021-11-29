public class VoetbalclubArray {
    public VoetbalclubArray(String ajax_amsterdam, String afca, int i) {
    }

    public static void main(String[] args) {
        VoetbalclubArray ajax = new VoetbalclubArray("Ajax Amsterdam", "AFCA", 1902);
        VoetbalclubArray psv = new VoetbalclubArray("PSV Eindhoven", "PSV", 1903);
        VoetbalclubArray utrecht = new VoetbalclubArray("FC Utrecht", "030", 1970);
        VoetbalclubArray az = new VoetbalclubArray("AZ Alkmaar", "AZ", 1980);

        VoetbalclubArray[] clubs = {ajax,psv,utrecht,az};
        //runt niet
        System.out.println("Club op positie 0:" + clubs[0].getNaam());

    }
}
