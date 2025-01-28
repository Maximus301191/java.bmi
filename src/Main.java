public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double hightM = 1.87;
        int weightKg = 98;
        int BMI = service.calculate(weightKg, hightM);
        System.out.println(BMI);
    }
}