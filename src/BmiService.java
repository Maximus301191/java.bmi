public class BmiService {
    public int calculate(int weightKg, double hightM) //вес в кг и рост в метрах
    {
        double result = weightKg / Math.pow(hightM, 2);
        return (int) result;
    }
}

