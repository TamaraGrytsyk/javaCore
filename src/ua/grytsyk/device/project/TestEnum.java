package ua.grytsyk.device.project;

enum Week {

    SUN(2),MON(3);
int x;

    Week(int x) {
        this.x = x;
    }
}

public class TestEnum {
    public static void main(String[] args) {
        Week w=Week.MON;
        Week w1=Week.SUN;
        System.out.println(w.x);
        System.out.println(w1.x);

        Week w2=Week.MON;

        switch (w2){
            case SUN:
                System.out.println("Sun 2");
                break;
            case MON:
                System.out.println("Mon 2");
                break;


        }
    }
}
