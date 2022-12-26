package homework.asli.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //bu projede implement ederek dependency ınjectıon kullandım.
public class Customers {
    private int custid;
    private String custname;
    private String coursename;
    @Autowired //bu anotasyonu kullanarak dı yaptım.
    private Technologies techdetail;

    public int getCustid() {
        return custid;
    }

    public void setCustid(int custid) {
        this.custid = custid;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public Technologies getTechdetail() {
        return techdetail;
    }

    public void setTechdetail(Technologies techdetail) {
        this.techdetail = techdetail;
    }


    public void display() {
        System.out.println("Object Returned Successfully");
        techdetail.tech();
    }
}
