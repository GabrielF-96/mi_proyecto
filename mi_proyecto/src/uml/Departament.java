
package uml;

public class Departament {
    
    private int iddepartament;
    private String departament_name; 
    private String address;
    private int phonnumber; 

    public Departament() {
    }

    public Departament(int iddepartament, String departament_name, String address, int phonnumber) {
        this.iddepartament = iddepartament;
        this.departament_name = departament_name;
        this.address = address;
        this.phonnumber = phonnumber;
    }

    public int getIddepartament() {
        return iddepartament;
    }

    public void setIddepartament(int iddepartament) {
        this.iddepartament = iddepartament;
    }

    public String getDepartament_name() {
        return departament_name;
    }

    public void setDepartament_name(String departament_name) {
        this.departament_name = departament_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhonnumber() {
        return phonnumber;
    }

    public void setPhonnumber(int phonnumber) {
        this.phonnumber = phonnumber;
    }
    
    
    
}
