
package uml;

public class Employee {
    private String codemployee;
    private int iddepartament;
    private String firtsname;
    private String lastname;

    public Employee() {
    }

    public Employee(String codemployee, int iddepartament, String firtsname, String lastname) {
        this.codemployee = codemployee;
        this.iddepartament = iddepartament;
        this.firtsname = firtsname;
        this.lastname = lastname;
    }

    public String getCodemployee() {
        return codemployee;
    }

    public void setCodemployee(String codemployee) {
        this.codemployee = codemployee;
    }

    public int getIddepartament() {
        return iddepartament;
    }

    public void setIddepartament(int iddepartament) {
        this.iddepartament = iddepartament;
    }

    public String getFirtsname() {
        return firtsname;
    }

    public void setFirtsname(String firtsname) {
        this.firtsname = firtsname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
    
