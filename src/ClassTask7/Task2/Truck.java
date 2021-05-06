package ClassTask7.Task2;

public class Truck implements Traffic {
    @Override
    public double countCost(double weight, double len) {
        if (len > 1000 || weight > 60) {
            return -1;
        }
        return weight * len * 120;
    }
}
