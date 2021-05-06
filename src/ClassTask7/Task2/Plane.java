package ClassTask7.Task2;

public class Plane implements Traffic {
    @Override
    public double countCost(double weight, double len) {
        if (len > 500) {
            return weight * len * 750;
        } else {
            return -1;
        }
    }
}
