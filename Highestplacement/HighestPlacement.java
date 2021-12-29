import java.util.Scanner;
public class HighestPlacement{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students placed in CSE : ");
        int CSE=sc.nextInt();
        System.out.println("Enter the number of students placed in ECE : ");
        int ECE=sc.nextInt();
        System.out.println("Enter the number of students placed in Mech : ");
        int Mech=sc.nextInt();
        
        if(CSE==ECE&&CSE==Mech)
        {
            System.out.println("None of the department got higest placement");
        }
        else if(CSE<0||ECE<0||Mech<0)
        {
            System.out.println("Invalid");
        }
        else if(CSE==ECE&&CSE>Mech)
        {
            System.out.println("Highest Placement : ");
            System.out.println("CSE");
            System.out.println("ECE");
        }
        else if(ECE==Mech&&ECE>CSE)
        {
            System.out.println("Higest Placement : ");
            System.out.println("ECE");
            System.out.println("Mech");
        }
        else if(CSE==Mech&&CSE>ECE)
        {
            System.out.println("Higest Placement : ");
            System.out.println("CSE");
            System.out.println("Mech");
        }
        else if(CSE>ECE&&CSE>Mech)
        {
            System.out.println("Higest Placement : ");
            System.out.println("CSE");
        }
        else if(ECE>CSE&&ECE>Mech)
        {
            System.out.println("Higest Placement : ");
            System.out.println("CSE");
        }
        else if(Mech>ECE&&Mech>CSE)
        {
             System.out.println("Higest Placement : ");
            System.out.println("Mech");
        }
        
        
    }
}
