import static java.lang.Math.*;

public class employee {
    public static void main(String darsh[]) {
        int isEmPresent = 1;
        double empcheck = Math.floor(Math.random() * 10) % 2;
        if (empcheck == isEmPresent) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Emloyee is Absent");
        }
    }
}