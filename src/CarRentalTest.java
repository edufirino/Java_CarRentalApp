import menu.Menu;

public class CarRentalTest {
    public static void main(String[] args) {
        // String leftAlignFormat = "| %-9d | %-9d | %-28s | %-9s | %-18s | %-35s |
        // %-18s |%n";
        // String leftAlignFormat = "| %-35s | %-18s |%n";

        // System.out.printf(leftAlignFormat, "abacate", "abacate");

        String[] a = { "a", "b", "c" };
        String[] b = { " %-35s |", " %-18s |", " %-18s |" };

        System.out.printf("|");
        for (int i = 0; i < a.length; i++) {
            System.out.printf(b[i], a[i]);
        }
        System.out.printf("%n");

    }
}