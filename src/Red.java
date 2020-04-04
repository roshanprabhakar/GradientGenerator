public class Red extends Computer {

    @Override
    public double compute(double t) {
        return ((double)255/2) * Math.sin(-((double)1/100) * t) + ((double)255/2);
//        return (double)255/2 * Math.sin(t * ((double)1/50)) + (double)255/2;
//        return (double) (255) / (1000) * t;
//        return -(double) 255 / 2 * Math.cos(5 * Math.PI * t/10) + (double) 255 / 2;
    }
}
