public class SqFtCalculator {
    public static class SquareFootageCalculator {
        // Fields to store square footage values
        private double totalSquareFeet;

        // Constructor
        public SquareFootageCalculator() {
            // Initialize fields to default values
            totalSquareFeet = 0.0;
        }

        // Method to set the total square footage
        public void setTotalSquareFeet(double squareFeet) {
            this.totalSquareFeet = squareFeet;
        }

        // Method to calculate the remaining square footage after deducting an area
        public double calculateRemainingSquareFeet(double deductedSquareFeet) {
            if (totalSquareFeet >= deductedSquareFeet) {
                totalSquareFeet -= deductedSquareFeet;
                return totalSquareFeet;
            } else {
                return -1.0; // Returning -1 as an error code.
            }
        }

        // Method to get the current total square footage
        public double getTotalSquareFeet() {
            return totalSquareFeet;
        }
    }



}
