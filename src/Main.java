public class Main {
    public static void main(String[] args) {

      /*  double nota = 9.5;

        if (nota == 10) {
            System.out.println("Studentul a primit nota maxima");
        } else if (nota == 9) {
            System.out.println("Studentul a primit nota 9");
        } else if (nota < 9 && nota > 8) {
            System.out.println("Studentul a primit nota intre 8 si 9");
        } else {
            System.out.println("Am executat ramura ELSE");
        } */

      /* String ziua = "duminica";
        if (ziua == "sambata") {
            System.out.println("azi este sambata");
        } else if (ziua == "duminica") {
            System.out.println("azi este duminica");
        } else {
            System.out.println("atrecut weekendul");
        }


        switch (ziua) {
            case"sambata":{
                System.out.println("Ziua samabata - switch");
            } case "duminica": {
                System.out.println("Ziua duminica - switch");
                break;
            } default: {
                System.out.println(" Nu este weekend - switch");
            }
        } */

        //tip nume
       /* String[] studenti;
        int numere[];

        studenti = new String[10];
        numere = new int[5];

        double[] duble = new double[7];

        studenti [0] = "Mihai";
        studenti [1] = "Ana";

        System.out.println(studenti[0]);
        System.out.println(studenti[1]);


        //Array Literal
        String[] literal = {"Alexandru", "mere", "masa"};
        System.out.println(literal[0]);
        System.out.println(literal[2]);
        System.out.println(literal[5]); */

        String [][] bidimensional = new String[3][6];
        String [][][] tridimensional = new String[2][3][1];

        bidimensional[0][0] = "curs";
        bidimensional[2][1] = "capitol";

        System.out.println(bidimensional[0][0]);
        System.out.println(bidimensional[2][1]);
        System.out.println(bidimensional[3][6]);

        String [][] multidimensional = {
                {"laptop", "masa"},
                {"tastatura"}};
        System.out.println(multidimensional[0][0]);
        System.out.println(multidimensional[0][1]);
        System.out.println(multidimensional[1][0]);
    }
}