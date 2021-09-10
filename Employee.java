public abstract class Employee
{
    private String name;
    private int id;
    private double hourlyWage;
    private double hour;

    public Employee(String name, int id, double hour, double hourlyWage)
    {
        this.name = name;
        this.id = id;
        this.hour = hour;
        this.hourlyWage = hourlyWage;
    }

    public void setHourlyWage(double hourlyWage)
    {
        this.hourlyWage = hourlyWage;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setHour(double hour)
    {
        this.hour = hour;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getHourlyWage()
    {
        return hourlyWage;
    }

    public int getId()
    {
        return id;
    }

    public double getHour()
    {
        return hour;
    }

    public String getName()
    {
        return name;
    }

    public double computeGrossPay()
    {
        if (this.hour > 2080)
        {
            return this.hourlyWage * (this.hour) + (this.hour - 2080) * this.hourlyWage * 1.50;
        }
        else
        {
            return (this.hour) * this.hourlyWage;
        }
    }

    public void CalculatedSickLeave()
    {
        double sickLeaveEarned = this.hour / 30;
        System.out.print(this + "             Sick leave hours earned this year: ");
        System.out.printf("%5.2f%n",sickLeaveEarned);
    }

    public void RaisedSalary(double percentage)
    {
        this.hourlyWage =  this.hourlyWage + this.hourlyWage * (percentage / 100);
        System.out.print(this + "      new wage for next year: ");
        System.out.printf("%5.2f%n", + hourlyWage);
    }

    @Override
    public String toString()
    {
        return  "name: " + name + "    id: " + id;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Employee)
        {
            Employee other = (Employee) obj;
            String otherName = other.name;
            int otherId = other.id;
            double otherHourlyWage = other.hourlyWage;
            double otherHour = other.hour;

            return otherId == id && otherHour == hour && otherHourlyWage == hourlyWage && otherName.equalsIgnoreCase(name);
        }
        return false;
    }

}
