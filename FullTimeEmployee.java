public class FullTimeEmployee extends Employee
{
    private static final double DEFAULT_HOUR = 2080;
    public FullTimeEmployee(String name, int id, double hour, double hourlyWage)
    {
        super(name, id, hour, hourlyWage);
    }

    public FullTimeEmployee(String name, int id, double hourlyWage)
    {
        super(name, id, DEFAULT_HOUR, hourlyWage);
    }
}
