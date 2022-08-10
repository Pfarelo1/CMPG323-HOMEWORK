
/**
 * Write a description of class Contract_employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Contract_employee extends Employee  //This is the  contract sub class that will inherit attributes/properties from the Employee class
{
    
    private String type;
   private static int count = 100;
   private final double RATE = 2.5;
     // default contructoers
    public Contract_employee()
    {
    }  
    public Contract_employee(String name, String surname, String Employee_ID, String Phone_NO, double salary)
    {
       super(name, surname, Employee_ID, Phone_NO, salary);
       count++;
       setType(count);        
    }
       
    public String getType()
    {
        return type;
    }
    public void setType(int count)
    {
        this.type = "part time employee" + count;
    }
    
    public void withdraw(double amount)
    {
        double result = super.getsalary() - amount;
        super.setsalary(result);
    }
    
    public double calctax()
    {
      double interest = super.getsalary() * (RATE/100);
      return interest;
    }
    @Override
    public String toString()
    {
        String str = String.format("%s%s%s\n",super.toString(),"Type: ", type );
        return str;
    }
}