package ClassTask7.Task2;

public class Train implements Traffic {
    @Override
    public double countCost(double weight, double len) {
        if (len < 900) {
            return weight * len * 250;
        } else {
            return weight * len * 300;
        }
    }
}
