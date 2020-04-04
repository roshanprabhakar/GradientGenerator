public class Blue extends Computer {

    @Override
    public double compute(double t) {
//        return Math.abs((Math.sin(((double)1/10) * t)/t) * 2054);
//        return (double)1/(((double)1/5000) * (t + 20));
//        return (double) 255;
        return (double) (255)/(1000) * t;
//        return (double) 255 / 2 * Math.sin(7 * Math.PI * t/10) + (double) 255 / 2;
    }

}
