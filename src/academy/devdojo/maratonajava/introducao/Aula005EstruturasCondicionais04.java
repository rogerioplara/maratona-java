package academy.devdojo.maratonajava.introducao;

public class Aula005EstruturasCondicionais04 {
    public static void main(String[] args) {

        double income = 50000;

        double firstRange = 34712;
        double secondRange = 68507;

        double firstRangeRate = 0.097;
        double secondRangeRate = 0.3735;
        double finalRangeRate = 0.495;

        double liquidTax;

        if (income <= firstRange){
            liquidTax = income * firstRangeRate;
            System.out.printf("Tax rate: %.2f%% - Total: $%.2f", (firstRangeRate * 100), liquidTax);
        } else if (income <= secondRange) {
            liquidTax = income * secondRangeRate;
            System.out.printf("Tax rate: %.2f%% - Total: $%.2f", (secondRangeRate * 100), liquidTax);
        } else {
            liquidTax = income * finalRangeRate;
            System.out.printf("Tax rate: %.2f%% - Total: $%.2f", (finalRangeRate * 100), liquidTax);
        }
    }
}
