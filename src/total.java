public class total {
    public static void main(String darsh[]) {
        int EmpFull_Time = 1;
        int Emp_Part_Time = 2;
        int Emp_Day_Hr = 0;
        int Emp_Wage_Hr = 20;
        int totalSalary = 0;

        for(int day=1; day<=30; day++ )
        {
            double empcheck = (Math.floor(Math.random() * 100) % 3);
            if (empcheck == EmpFull_Time) {

                Emp_Day_Hr = 8;

            } else if (empcheck == Emp_Part_Time) {

                Emp_Day_Hr = 4;
            } else {

                Emp_Day_Hr = 0;
            }
        }
        System.out.println("Employee Total Monthly Wages is " + (Emp_Day_Hr * Emp_Wage_Hr)+totalSalary);
    }


}
