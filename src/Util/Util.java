package Util;

import java.util.Random;

import model.Customer;
import model.car.Car;
import model.car.Family;
import model.car.Luxury;
import model.car.Sport;
import model.staff.CEO;
import model.staff.ITNerd;
import model.staff.Receptionist;
import model.staff.Staff;

public class Util {

        static String[] name = { "Brian Sparks", "Neve West", "Fiza Hendrix", "Vikki Villegas", "Sadiyah Gates",
                        "Roy Flynn", "Macey Stephenson", "Asmaa Fitzgerald", "Regan Herrera", "Julia Copeland",
                        "Reginald Carlson", "Adina Parra", "Denise Ayers", "Elly Johnson", "Aadam Woods", "Xander Bean",
                        "Ciara Conner", "Eloisa Rubio", "Kaila Kline", "Jenna Bannister", "Willem Broadhurst",
                        "Eliot Beltran", "Brady Talbot", "Marcia Finnegan", "Adam Davis", "Jedd Foley",
                        "Giacomo Hernandez", "Tymoteusz Christensen", "Frances Moore", "Jardel Greer", "Dougie Oconnor",
                        "Donna Haynes", "Masuma Mckay", "Kalem Garza", "Ridwan Barber", "Leonard Douglas",
                        "Kevin Herbert", "Nyla Solis", "Mehmet Kearns", "Asa Snyder", "Edna Rankin", "Dante Pace",
                        "Kain Mitchell", "Aayush Goodwin", "Darrell Kerr", "Chelsea Barnett", "Kiya Ashley",
                        "Corben Zhang", "Rumaisa Finney", "Sharon Lloyd", "Nakita Blankenship", "Pranav Oconnell",
                        "Georgia Terrell", "Ehsan Villalobos", "Pierre Sinclair", "Zander Corona", "Tulisa Hodson",
                        "Zhane Rodriguez", "Reegan Guy", "Hareem Shah", "Arnie Norris", "Samia Whitehead",
                        "Anton Clements", "Barnaby Hopper", "Kayla Sierra", "Nikola Mcbride", "Priyanka Rivers",
                        "Edgar Justice", "Raja Price", "Alena Jeffery", "Renzo Gamble", "Agnes Thorpe",
                        "Chardonnay Gill", "Emir Garrison", "Omar Salinas", "Macaulay Cabrera", "Azra Mcnamara",
                        "Skylah Murray", "Conner Mackie", "Harry Head", "Kaiser Fowler", "Chloe-Ann Krause",
                        "Saqlain Sharples", "Sahil Brook", "Emil Irwin", "Isla Beck", "Josephine Ashton",
                        "Patience Melia", "Lianne Norton", "Inez Harmon", "Bear Carr", "Bella-Rose Mcpherson",
                        "Kole Noel", "Cassandra Becker", "Carlos Churchill", "Evie-Mae Maguire", "Charlton Robinson",
                        "Usmaan Fellows", "Constance Feeney", "Cecelia Harper", "Terry Judson", "Castillo Hipolito",
                        "Thornton Elwood", "Berg Adan", "Randall Jamal", "Jennings Georgette", "Lutz Rosalyn",
                        "Hodges Marco", "Moses Petra", "Reeves Oswaldo", "Giles Elliot", "Kane Kelly", "Mendoza Rocky",
                        "Riddle Jason", "Campbell Lewis", "Riggs Avery", "Lee Elmo", "Craig Myra", "Turner Leigh",
                        "Stanton Chad", "Braun Deborah", "JohnsonGregg", "Mcpherson Karen", "Holt Monica",
                        "Escobar Anna", "Simpson Jacqueline", "Erickson Alexandria", "Mcfarland Kerry", "Stone Tania",
                        "Miller Trust" };
        static String[] dataOfBirth = { "08/11/1979", "09/02/1989", "19/03/2000", "30/06/1985", "15/12/1986",
                        "19/06/1985", "24/10/1994", "19/03/1988", "20/04/1990", "15/10/1991", "05/06/1993",
                        "09/07/1984", "10/02/1990", "06/07/1978", "19/03/1990", "12/12/1995", "05/05/1977",
                        "24/07/1994", "03/10/1990", "11/03/1994", "26/04/1983", "24/08/1998", "08/10/1996",
                        "20/02/1983", "06/10/1976", "06/11/1979", "26/01/1992", "20/03/1992", "30/11/1993",
                        "10/03/1990" };
        static String[] creditCardNumber = { "4916522687392702", "4024007119381688", "4024007110775024389",
                        "2221005305615237", "5455951950759467", "2221001291704580", "374303666715129",
                        "376785859091334", "376488024325709", "6011208887146614", "6011533515820888",
                        "6011100407337835224", "3533132277356813", "3528794964923705", "3530248671776558176",
                        "5505633796686860", "5560111866542828", "5479000829387472", "30534944877051", "30531659381337",
                        "30551017684313", "36068300209637", "36564441540237", "36743104520674", "5038868719342110",
                        "5018194931952980", "5038349670099841", "4026952752619217", "4026913464578638",
                        "4913846332039720" };
        static String[] make = { "Renault", "Peugeot", "BMW", "Audi", "Volkswagen", "Porsche", "Fiat", "Ferrari",
                        "Lamborghini", "Suzuki", "Toyota", "Honda" };
        static String[] model = { "Sedan", "Coupe", "Sports Car", "Station Wagon", "Hatchback", "Convertible",
                        "Sport-utility Vehicle", "Minivan", "Pickup Truck" };
        static String[] numberSeats = { "2", "3", "4", "5", "6", "7" };

        public static void main(String[] args) {
                /*
                 * Car c = randomCar();
                 * 
                 * for (int i = 0; i < 10; i++) { c = randomCar();
                 * System.out.println(c.getRegNumber()); System.out.println(c.getType());
                 * System.out.println(c.getMake()); System.out.println(c.getModel());
                 * System.out.println(c.getNumberSeats()); c.displaySpeciality(); }
                 */

                /*
                 * Staff s = randomStaff();
                 * 
                 * for (int i = 0; i < 100; i++) { s = randomStaff();
                 * System.out.println(s.getName()); System.out.println(s.getId());
                 * System.out.println(s.getSalaryLevel()); System.out.println(s.getTask());
                 * 
                 * }
                 */

                Customer c = null;

                for (int i = 0; i < 10; i++) {
                        c = randomCustomer();

                        System.out.println(c.getName());
                        System.out.println(c.getCreditCardNumber());
                        System.out.println(c.getDateOfBirth());

                }

        }

        public static Customer randomCustomer() {
                Customer customer = new Customer(randomItem(name), randomItem(creditCardNumber),
                                randomItem(dataOfBirth));
                return customer;
        }

        public static Car randomCar() {

                Car car = null;

                String makeRandom = randomItem(make);
                String modelRandom = randomItem(model);
                String numberSeatsRandom = randomItem(numberSeats);

                switch (randomNumber(3)) {
                        case 0:
                                car = new Family(makeRandom, modelRandom, numberSeatsRandom);
                                break;
                        case 1:
                                car = new Sport(makeRandom, modelRandom, numberSeatsRandom);
                                break;
                        case 2:
                                car = new Luxury(makeRandom, modelRandom, numberSeatsRandom);
                                break;
                        default:
                                break;
                }

                return car;
        }

        public static Staff randomStaff() {

                Staff staff = null;

                String nameRandom = randomItem(name);

                switch (randomNumber(3)) {
                        case 0:
                                staff = new Receptionist(nameRandom);
                                break;
                        case 1:
                                staff = new ITNerd(nameRandom);
                                break;
                        case 2:
                                staff = new CEO(nameRandom);
                                break;
                        default:
                                break;
                }

                return staff;
        }

        public static int randomNumber(int max) {
                return new Random().nextInt(max);
        }

        public static String randomItem(String[] array) {
                return array[randomNumber(array.length)];
        }
}