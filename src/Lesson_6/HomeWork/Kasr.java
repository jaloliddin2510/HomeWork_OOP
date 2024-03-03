package Lesson_6.HomeWork;

public class Kasr {
    int surat;
    int maxraj;

    Kasr(int surat, int maxraj) {
        this.surat = surat;
        this.maxraj = maxraj;
    }

    boolean isShortFraction() {
        int a, b;
        while (surat != 0 && maxraj != 0) {
            if (surat > maxraj) {
                surat = surat % maxraj;
            } else maxraj = maxraj % surat;
        }
        return (surat!=0 && surat!=1 && maxraj!=1);
    }
    Kasr pow(Kasr a, int degre){

        while (degre>1){

            degre--;
        }
        return a;
    }
}
