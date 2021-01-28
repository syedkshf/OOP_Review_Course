public interface Diagnosticable {
    double getTemperature();
    int getSystolic();
    int getDiastolic();
    void setTemperature(double t);
    void setSystolic(int s);
    void setDiastolic(int d);
    default boolean hasFever(){return this.getTemperature()>100.4;}







}
