
/**
 * Abstract class Employee - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
// employee.Java Ths is the Super class from which permanent and temporary employees will inherit the attributes of this class
// A java program that will calculate tax rate depanding on the type of employment either temporary or permanent  
public abstract class Employee
{
    //Here we declare all of the superclass variables that will be used by both  permanent and temporary employees
    //These are attributes of all employee
   private String name;      
   private String surname;
   private String Employee_ID;
   private String Phone_NO;
   protected double salary; 
   
   public Employee()
   {
   }
  public Employee(String name, String surname, String Employee_ID, String Phone_NO, double salary)
    {
       setName(name);
       setSurname(surname);
       setEmployee_ID(Employee_ID);
       setPhone_NO(Phone_NO);
       setsalary(salary); 
     }
       
    public String getName()
    {
        return name;
    }
    public String getSurname()
    {
        return surname;
    }
    public String getEmployee_ID()
    {
        return Employee_ID;
    }
    public String getPhone_NO()
    {
        return Phone_NO;
    }
       
    public double getsalary()
    {
        return salary;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setSurname(String surname)
    {
        this.surname = surname;
    }
    public void setEmployee_ID(String Employee_ID)
    {
        this.Employee_ID = Employee_ID;
    }
    
    public void setPhone_NO(String newNumber)
    {
        Phone_NO = newNumber;
    }
        
    public void setsalary(double newsalary)
    {
        salary = newsalary;
    }
    
    public void deposit(double amount)
    {
        if (amount >= 0)
            salary = salary + amount;
    }
    
    public String toString()
    {
        String str = String.format("%s%s\n%s%s\n%s%s\n%sR%8.2f\n","Name: ", name + " " + surname , "Employee_ID: " , Employee_ID,"Contact number: ", Phone_NO, "salary: ", salary );
        return str;
    }
}

   
        
    