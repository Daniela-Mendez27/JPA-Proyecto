package entity;

import javax.persistence.*;

@Entity
@Table (name="employes")
public class Employe {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private  int id;

    @Column (name = "first_name")
    private  String firsName;
    @Column (name = "pa_surname")
    private  String paSurname;
    @Column (name = "ma_surname")
    private  String maSurname;

    private  String email;
    private  Float Salary;

    public Employe() {
    }

    public Employe(int id, String firsName, String paSurname, String maSurname, String email, Float salary) {
        this.id = id;
        this.firsName = firsName;
        this.paSurname = paSurname;
        this.maSurname = maSurname;
        this.email = email;
        Salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getPaSurname() {
        return paSurname;
    }

    public void setPaSurname(String paSurname) {
        this.paSurname = paSurname;
    }

    public String getMaSurname() {
        return maSurname;
    }

    public void setMaSurname(String maSurname) {
        this.maSurname = maSurname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Float getSalary() {
        return Salary;
    }

    public void setSalary(Float salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", firsName='" + firsName + '\'' +
                ", paSurname='" + paSurname + '\'' +
                ", maSurname='" + maSurname + '\'' +
                ", email='" + email + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
