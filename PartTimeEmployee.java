public class PartTimeEmployee extends Employee
{
    private static final double DEFAULT_HOUR = 1040;
    public PartTimeEmployee(String name, int id, double hour, double hourlyWage)
    {
        super(name, id, hour, hourlyWage);
    }

    public PartTimeEmployee(String name, int id,  double hourlyWage)
    {
        super(name,id, DEFAULT_HOUR, hourlyWage);
    }
}
