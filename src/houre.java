public class houre {
    public static void main(String[] darsh) {
        int totalworkinghoure = 100;
        int WagePerHour = 20;
        int TotalSum = 0;

        for(int i =1;i<=totalworkinghoure;i++)
        {
            TotalSum = TotalSum + (1 * WagePerHour);
        }
        System.out.println("Total Sum "+TotalSum);
    }
}
