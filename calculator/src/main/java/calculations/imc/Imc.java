package calculations.imc;

public class Imc {

    public double calculate(double weight, double height){
        return weight/Math.pow(height, 2);
    }

}
