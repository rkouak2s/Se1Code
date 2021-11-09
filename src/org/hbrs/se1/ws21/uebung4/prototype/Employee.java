package org.hbrs.se1.ws21.uebung4.prototype;

public class Employee implements java.io.Serializable, Comparable<Employee> {

    private String vorname;
    private String name;
    private Integer pid;
    private String abteilung;
    private String expertise;
    private String rolle;

    public Employee(Integer pid, String vorname, String nachname, String rolle, String abteilung, String expertise) {
        this.pid = pid;
        this. name = nachname;
        this.vorname = vorname;
        this.abteilung = abteilung;
        this.expertise = expertise;
        this.rolle = rolle;
    }

    public Employee() {

    }

    public String getAbteilung() {
        return abteilung;
    }

    public String getExpertise() {
        return expertise;
    }

    public String getRolle() {
        return this.rolle;
    }

    public void setRolle(String rolle) {
        this.rolle = rolle;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    @Override
    public int compareTo(Employee o) {
        // Werte: 0, 1, -1 --> Pid vergleichen!
        return this.pid.compareTo(o.getPid());
    }
}

