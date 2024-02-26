public class Account {
    private int accno;
    private static int saaccno = 1000;
    private String name;
    private String city;
    private int bal;

    public Account(String name, String city, int bal) {
        super();
        this.name = name;
        this.city = city;
        this.bal = bal;
        this.accno = ++saaccno;
    }

    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getBal() {
        return bal;
    }

    public void setBal(int bal) {
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "[accno=" + accno + ", name=" + name + ", city=" + city + ", balance=" + bal + "]";
    }
}
