public class Task {
    Person[] patients = new Person[5];
    public static void main(String[] args) {
        Task t = new Task();
        t.run();
    }

    public void run(){
        Person bart = new ChildPatient();
        Diagnosticable lisa = new ChildPatient();
        ChildPatient maggie = new ChildPatient();
        AdultPatient homer = new AdultPatient();
        Employable marge = new AdultPatient();

        // Set the temperature of each child.

        ((ChildPatient)bart).setTemperature(101.2);
         maggie.setTemperature(100.1);
         lisa.setTemperature(100.6);

        // set the jobs

        homer.addJob("Nuclear Engineer");
        homer.addJob("Major");
        homer.addJob("Bar Owner");
        marge.addJob("House Keeper");

        //insert all of the sympsons in the patients array.

        this.patients[0] = bart;
        this.patients[1] = (ChildPatient) lisa;
        this.patients[2] = maggie;
        this.patients[3] = homer;
        this.patients[4] = (AdultPatient) marge;
    }

    public boolean isAdult(Person p){
        return p instanceof Employable;
    }
}