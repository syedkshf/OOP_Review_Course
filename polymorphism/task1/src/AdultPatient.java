import java.util.ArrayList;

public class AdultPatient extends Person implements Employable, Diagnosticable{
    ArrayList<String> jobs;
    double temperature;
    int systolic;
    int diastolic;


    @Override
    public ArrayList<String> getPreviousJobs()
    {
        return this.jobs;
    }

    @Override
    public void addJob(String job)
    {
        if(this.jobs==null)
            this.jobs = new ArrayList<String>();
        this.jobs.add(job);

    }

    @Override
    public double getTemperature()
    {
        return temperature;
    }

    @Override
    public int getSystolic()
    {
        return systolic;
    }

    @Override
    public int getDiastolic()
    {
        return diastolic;
    }

    @Override
    public void setTemperature(double t)
    {
        this.temperature = t;
    }

    @Override
    public void setSystolic(int s)
    {
       this.systolic = s;
    }

    @Override
    public void setDiastolic(int d)
    {
       this.diastolic = d;
    }
}
