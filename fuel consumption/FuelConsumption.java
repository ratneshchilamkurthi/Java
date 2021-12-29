import java.util.Scanner;
public class FuelConsumption {
public static void main(String args[])
{
System.out.println("Enter the no of liters to fill the tank");
Scanner sc=new Scanner(System.in);
float l=sc.nextInt();
if(l<0)
{
System.out.println((int)l+" is an Invalid Input");
}
else{
System.out.println("Enter the distance covered");
}
float d=sc.nextInt();
if(d<0)
{
System.out.println((int)d+" is an Invalid Input");
}
else
{
float cons=(l/d)*100;
double Kmc=d*0.6214;
double Litc=l*0.2642;
double Final=Kmc/Litc;
System.out.printf("Liters/100KM \n%.2f\n",cons);
System.out.printf("Miles/gallon \n%.2f",Final);
}
}
}





