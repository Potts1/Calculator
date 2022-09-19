import java.util.Arrays;

public class Distance {
    double[] pair1 = new double[2];
    double[] pair2 = new double[2];

    public Distance(double[] pair1, double[] pair2) {
        this.pair1 = pair1;
        this.pair2 = pair2;
    }

    public String getDistance() {
        return String.valueOf(Math.abs(Math.sqrt(Math.pow(pair1[0] - pair2[0], 2) + Math.pow(pair1[1] - pair2[1], 2))));
    }

    public String getMidpoint() {
        double[] midpoint = new double[2];
        int b = 0;

        midpoint[0] = (pair1[0] + pair2[0]) / 2;
        midpoint[1] = (pair1[1] + pair2[1]) / 2;

        return Arrays.toString(midpoint);
    }

    public String toString() {
        return "Midpoint: " + this.getMidpoint() +
                "\nDistance: " + this.getDistance();
    }

}