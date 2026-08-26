

    public static void main(String[] args) {

        // data for each shoe brand
        int[] nike = {100, 88, 75, 65};
        int[] adidas = {150, 92, 45, 95};
        int[] reebok = {70, 103, 90, 175};

        // Calculate totals
        int nikeTotal = calculateTotal(nike);
        int adidasTotal = calculateTotal(adidas);
        int reebokTotal = calculateTotal(reebok);

        // Calculate averages
        double nikeAverage = calculateAverage(nike);
        double adidasAverage = calculateAverage(adidas);
        double reebokAverage = calculateAverage(reebok);

        // heading
        System.out.println("ULTIMATE SHOE SALES");
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-10s %-12s %-12s %-12s%n",
                "QUARTER", "NIKE", "ADIDAS", "REEBOK");
        System.out.println("------------------------------------------------------------");

        //Quarterly sales
        for (int i = 0; i < 4; i++) {
            System.out.printf("%-10s %-12d %-12d %-12d%n",
                    "Q" + (i + 1), nike[i], adidas[i], reebok[i]);
        }

        System.out.println("------------------------------------------------------------");

        // Totals
        System.out.printf("%-10s %-12d %-12d %-12d%n",
                "TOTAL:", nikeTotal, adidasTotal, reebokTotal);

        // Averages
        System.out.printf("%-10s %-12.1f %-12.1f %-12.1f%n",
                "AVERAGE:", nikeAverage, adidasAverage, reebokAverage);

        // Minimum values
        System.out.printf("%-10s %-12d %-12d %-12d%n",
                "MIN:", findMinimum(nike),
                findMinimum(adidas),
                findMinimum(reebok));

        // Maximum values
        System.out.printf("%-10s %-12d %-12d %-12d%n",
                "MAX:", findMaximum(nike),
                findMaximum(adidas),
                findMaximum(reebok));

        System.out.println("------------------------------------------------------------");
    }

    // Calculate total sales
    public static int calculateTotal(int[] sales) {
        int total = 0;

        for (int sale : sales) {
            total += sale;
        }

        return total;
    }

    //Calculate average sales
    public static double calculateAverage(int[] sales) {
        return (double) calculateTotal(sales) / sales.length;
    }

    // Find minimum sales
    public static int findMinimum(int[] sales) {
        int minimum = sales[0];

        for (int sale : sales) {
            if (sale < minimum) {
                minimum = sale;
            }
        }

        return minimum;
    }

    // Find maximum sales
    public static int findMaximum(int[] sales) {
        int maximum = sales[0];

        for (int sale : sales) {
            if (sale > maximum) {
                maximum = sale;
            }
        }

        return maximum;
    }

