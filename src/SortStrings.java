import java.util.Scanner;
import java.util.Arrays;

public class SortStrings {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            int n = sc.nextInt();
            sc.nextLine(); // consume newline after n

            String[] names = new String[n];
            for (int i = 0; i < n; i++) {
                if (sc.hasNextLine()) {
                    names[i] = sc.nextLine();
                }
            }

            Arrays.sort(names);

            for (String name : names) {
                System.out.println(name);
            }
        }
    }
}
