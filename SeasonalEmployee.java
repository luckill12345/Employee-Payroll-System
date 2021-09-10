public class SeasonalEmployee extends Employee
{
    private static final int DEFAULT_HOUR = 520;
    public SeasonalEmployee(String name, int id, double hour, double hourlyWage)
    {
        super(name, id, hour, hourlyWage);
    }

    public SeasonalEmployee(String name, int id, double hourlyWage)
    {
        super(name, id, DEFAULT_HOUR, hourlyWage);
    }
}
