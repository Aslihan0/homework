package homework.asli.spring;

import org.springframework.stereotype.Component;

@Component // bu anotasyonu kullandım yoksa exception of No qualifying bean of type hatası alıyordum. burada getter ve setter  kullandım.
public class Technologies {
    private int techid;
    private String techname;

    public int getTechid() {
        return techid;
    }

    public void setTechid(int techid) {
        this.techid = techid;
    }

    public String getTechname() {
        return techname;
    }

    public void setTechname(String techname) {
        this.techname = techname;
    }
    public void tech()
    {
        System.out.println(" Successful");
    }
}
