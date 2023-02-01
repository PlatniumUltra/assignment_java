package assignment2;

public class B extends Marks {
    double[] subjects;

    public B(double subject1,double subject2,double subject3) {
        subjects = new double[3];
        subjects[0] = subject1;
        subjects[1] = subject2;
        subjects[2] = subject3;
    }

    @Override
    void getPercentage() {
        double percent = 0;

        for ( double i: subjects) {
            percent+=i;
        }
        percent/=3;

        System.out.println(percent);
    }
}
