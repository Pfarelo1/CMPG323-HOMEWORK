
/**
 * Write a description of class TestEmployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestEmployee
{
    public static void main(String [] args)
    {
        System.out.print("\f"); 
       permanent_employee customer1 = new permanent_employee("Relo", "Mdu", "9407654230987", "0790302253", 7000);
       System.out.print(customer1.toString());
       System.out.printf("%sR%8.2f\n\n","Tax: ",customer1.calctax());
       
       Contract_employee customer2 = new Contract_employee("maru", "dumu", "956098123546", "0974864298", 1500);
       System.out.print(customer2.toString());
       System.out.printf("%sR%8.2f\n\n","Tax: ",customer2.calctax());
       
       permanent_employee customer3 = new permanent_employee("asim", "patel", "890213697854", "0725492908", 4968);
       System.out.print(customer1.toString());
       System.out.printf("%sR%8.2f\n\n","Tax: ",customer1.calctax());
       
       Contract_employee customer4 = new Contract_employee("Jenifer", "Smith", "74567893456", "0974864298", 1500);
       System.out.print(customer2.toString());
       System.out.printf("%sR%8.2f\n\n","Tax: ",customer2.calctax());
    }
}