package Util;

import java.util.Random;

public class Util {

    static String[] name = { "Bradley Arnoldo", "Clay Trey", "Bird Carroll", "Swanson Hugo", "Randolph Rogelio",
            "Farmer Ilene", "Parrish Rosanna", "Morrison Jay", "Knapp Catherine", "Norman" };
    static String[] salaryLevel = { "Low", "Medium", "High" };
    static String[] dataOfBirth = { "08/11/1979", "09/02/1989", "19/03/2000", "30/06/1985", "15/12/1986", "19/06/1985",
            "24/10/1994", "19/03/1988", "20/04/1990", "15/10/1991", "05/06/1993", "09/07/1984", "10/02/1990",
            "06/07/1978", "19/03/1990", "12/12/1995", "05/05/1977", "24/07/1994", "03/10/1990", "11/03/1994",
            "26/04/1983", "24/08/1998", "08/10/1996", "20/02/1983", "06/10/1976", "06/11/1979", "26/01/1992",
            "20/03/1992", "30/11/1993", "10/03/1990" };
    static String[] creditCardNumber = { "4916522687392702 ", "4024007119381688 ", "4024007110775024389",
            "2221005305615237", "5455951950759467", "2221001291704580", "374303666715129", "376785859091334",
            "376488024325709", "6011208887146614", "6011533515820888", "6011100407337835224", "3533132277356813",
            "3528794964923705", "3530248671776558176", "5505633796686860", "5560111866542828", "5479000829387472",
            "30534944877051", "30531659381337", "30551017684313", "36068300209637", "36564441540237", "36743104520674",
            "5038868719342110", "5018194931952980", "5038349670099841", "4026952752619217", "4026913464578638",
            "4913846332039720" };
    static String[] customer = { "Terry Judson", "Castillo Hipolito", "Thornton Elwood", "Berg Adan", "Randall Jamal",
            "Jennings Georgette", "Lutz Rosalyn", "Hodges Marco", "Moses Petra", "ReevesOswaldo", "Giles Elliot",
            "Kane Kelly", "Mendoza Rocky", "Riddle Jason", "Campbell Lewis", "Riggs Avery", "Lee Elmo", "Craig Myra",
            "Turner Leigh", "Stanton Chad", "Braun Deborah", "JohnsonGregg", "Mcpherson Karen", "Holt Monica",
            "Escobar Anna", "Simpson Jacqueline", "Erickson Alexandria", "Mcfarland Kerry", "Stone Tania", "Miller" };
    static String[] make = { "Renault", "Peugeot", "BMW", "Audi", "Volkswagen", "Porsche", "Fiat", "Ferrari",
            "Lamborghini", "Suzuki", "Toyota", "Honda" };
    static String[] model = { "Sedan", "Coupe", "Sports Car", "Station Wagon", "Hatchback", "Convertible",
            "Sport-utility Vehicle", "Minivan", "Pickup Truck" };
    static String[] numberSeats = { "2", "3", "4", "5", "6", "7" };

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(randomItem(make));

        }
    }

    public static String randomItem(String[] array) {
        String item = array[new Random().nextInt(array.length)];
        return item;
    }
}