public class Green extends Computer {

    @Override
    public double compute(double t) {
//        return ((double) 255 / 2) * Math.cos(((double) 1 / 100) * t) + ((double) 255 / 2);
        return ((double) 255 / 2) * Math.cos(t * ((double) 1 / 50)) + ((double) 255 / 2);
//        return (double) 255 / 2 * Math.cos(5 * Math.PI * t/10) + (double) 255 / 2;
    }
}
