public class Array {
    public static void main(String[] args) {
        String[] firstnames = {"Jin", "Suga", "J-hope", "RM", "Jimin", "V", "JK"};
        int firstnamesLength = firstnames.length;

        //De waarde van de positie [firstnamesLength-1] wordt aangepast naar "Laatste naam"
        firstnames[firstnamesLength-1] = "laatste naam";


        //positie aangepast
        firstnames[1] = "Youngi";
        firstnames[3] = "Namjoon";


        System.out.println(firstnames[0]);
        System.out.println(firstnames[1]);
        System.out.println(firstnames[2]);
        System.out.println(firstnames[3]);
        System.out.println(firstnames[4]);
        System.out.println(firstnames[5]);
        System.out.println(firstnames[6]);

    }
}

