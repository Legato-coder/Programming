package streams.Intermediate;

public class A1 {
    private String ename;
    private int esalary; // salary field

    public A1(String ename, int esalary) {
        this.ename = ename;
        this.esalary = esalary;
    }

    public int getEsalary() {
        return esalary;
    }

    public String getEname() {
        return ename;
    }

    @Override
    public String toString() {
        return "Name: " + ename + ", Salary: " + esalary;
    }
}
