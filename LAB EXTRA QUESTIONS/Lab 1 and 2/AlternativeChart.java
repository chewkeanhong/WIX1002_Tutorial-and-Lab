package alternativechart;

public class AlternativeChart {
    public static void main(String[] args) {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun"};
        int[] sales = {2500, 1600, 2000, 2700, 3200, 800};

        // Find the maximum sales value for scaling
        int max = 0;
        for (int s : sales) {
            if (s > max) max = s;
        }

        int height = max / 100; // Scale down

        System.out.println("==== Total Sales of Product A (2016) ====\n");

        // Draw chart from top to bottom
        for (int i = height; i > 0; i--) {
            for (int j = 0; j < sales.length; j++) {
                if (sales[j] / 100 >= i) {
                    System.out.print(" **** ");  // Thick bar part
                } else {
                    System.out.print("      ");  // Empty space
                }
            }
            System.out.println();
        }

        // Print separator line
        for (int i = 0; i < months.length; i++) {
            System.out.print("------");
        }
        System.out.println();

        // Print month labels
        for (String month : months) {
            System.out.printf("%4s  ", month);
        }
        System.out.println();
    }
}

