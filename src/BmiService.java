public class BmiService {
    public int calculate(int weightKg, double hightM) //вес в кг и рост в метрах
    {
        double result = hightM / Math.pow(weightKg, 2);
        return (int) result;
    }
}

