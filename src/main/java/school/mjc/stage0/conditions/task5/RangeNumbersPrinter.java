package school.mjc.stage0.conditions.task5;

public class RangeNumbersPrinter {
    public void printRange(int number) {
        switch (number) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println(number);
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("out of range");
                break;
        }
    }
}
