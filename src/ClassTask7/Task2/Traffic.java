package ClassTask7.Task2;

public interface Traffic {
    int PLANE = 1;
    int TRAIN = 2;
    int TRUCK = 3;

    double countCost(double weight, double len);
}
