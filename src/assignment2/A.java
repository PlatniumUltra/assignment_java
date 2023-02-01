package assignment2;

public class A extends Marks {
    double[] subjects;

    public A(double subject1,double subject2,double subject3,double subject4) {
        subjects = new double[4];
        subjects[0] = subject1;
        subjects[1] = subject2;
        subjects[2] = subject3;
        subjects[3] = subject4;

    }

    @Override
    void getPercentage() {
        double percent = 0;

        for ( double i: subjects) {
            percent+=i;
        }
        percent/=4;

        System.out.println(percent);
    }
}
