public class switch_work {
      public static void main(String darsh[]) {
            int EmpFull_Time = 1;
            int Emp_Part_Time = 2;
            int Emp_Day_Hr = 0;
            int Emp_Wage_Hr = 20;
            int empcheck =(int) (Math.floor(Math.random() * 100) % 3);

            switch (empcheck)
            {
                case 1:
                    System.out.println("Employee is Full Time");
                    Emp_Day_Hr = 8;
                    System.out.println("Employee Daily Wages is " + Emp_Day_Hr * Emp_Wage_Hr);
                    break;
                case 2:
                    System.out.println("Employee is Part Time");
                    Emp_Day_Hr = 4;
                    System.out.println("Employee Daily Wages is " + Emp_Day_Hr * Emp_Wage_Hr);
                    break;
                case 0:
                    System.out.println("Employee is Not Working");
                    Emp_Day_Hr = 0;
                    System.out.println("Employee Daily Wages is " + Emp_Day_Hr * Emp_Wage_Hr);
//                default:
//                    System.out.println("Employee Record Not Found");

            }

        }
    }

