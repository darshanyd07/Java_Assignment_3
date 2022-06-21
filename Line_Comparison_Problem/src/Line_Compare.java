import java.io.*;
public class Line_Compare {
    public static void main(String darsh[])throws IOException
    {
        DataInputStream d = new DataInputStream(System.in);
        {
            int x1, x2, x3, x4, y1, y2, y3, y4;
            int line1, line2;
            System.out.println("Enter the X and Y co-ordinates for first point of line 1 : ");
             x1 = Integer.parseInt(d.readLine());
             y1 = Integer.parseInt(d.readLine());

            System.out.println("Enter the X and Y co-ordinates for second point of line 1 :");
            x2 = Integer.parseInt(d.readLine());
            y2 = Integer.parseInt(d.readLine());

            System.out.println("Enter the X and Y co-ordinates for first point of line 2 : ");
            x3 = Integer.parseInt(d.readLine());
            y3 = Integer.parseInt(d.readLine());

            System.out.println("Enter the X and Y co-ordinates for second point of line 2 : ");
            x4 = Integer.parseInt(d.readLine());
            y4 = Integer.parseInt(d.readLine());

            line1=(int) Math.sqrt(((x2-x1)^2)*((x2-x1)^2)+((y2-y1)^2)*((y2-y1)^2));
            System.out.println("the distance of line 1 is "+line1);
            line2=(int) Math.sqrt(((x4-x3)^2*((x4-x3)^2)+((y4-y3)^2)*((y4-y3)^2)));
            System.out.println("the distance of line 2 is "+line2);

            if (line1==line2)
                System.out.println("the line 1 and line 2 both are equal");
            else if(line1>line2)
                System.out.println("the line 1 is greater than line 2");
            else
                System.out.println("the line 1 is less than line 2");


        }
    }
}
