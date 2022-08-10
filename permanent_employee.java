
/**
 * Write a description of class permanent_employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class permanent_employee extends Employee //This is the  permanent sub class that will inherit attributes/properties from the Employee class
{
     private String type;
   private static int count = 500;
   private final double RATE = 4.5;
     // default constructor
    public permanent_employee ()
    {
    }
    public permanent_employee(String name, String surname, String Employee_ID, String Phone_NO, double salary)
    {
       super(name, surname, Employee_ID, Phone_NO, salary);
       count++;
       setType(count);       
    }
        
    public String gettype()
    {
        return type;
    }
    
    public void setType(int count)
    {
       this.type= "Full time employee" + count;
    }
    
    public void withdraw(double amount)
    {
        double newsalary = super.getsalary() - amount;
        super.setsalary(newsalary);
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
    
   