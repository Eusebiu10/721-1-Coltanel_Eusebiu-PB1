
public class Unternehmen {
    private Integer id;
    private String Unternehmensname;
    private Unternehmensgröße un;
    private Integer anz;
    private Integer EK;
    private String Ort;

    public Unternehmen(Integer id,String Unternehmensname,Unternehmensgröße un,Integer anz,Integer EK,String Ort )
    {
        this.id=id;
        this.Unternehmensname=Unternehmensname;
        this.un=un;
        this.anz=anz;
        this.EK=EK;
        this.Ort=Ort;

    }

    public Integer getId() {
        return id;
    }

    public String getUnternehmensname() {
        return Unternehmensname;
    }

    public Unternehmensgröße getUn() {
        return un;
    }

    public void setAnz(Integer anz) {
        this.anz = anz;
    }

    public Integer getEK() {
        return EK;
    }

    public String getOrt() {
        return Ort;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUnternehmensname(String unternehmensname) {
        Unternehmensname = unternehmensname;
    }

    public void setUn(Unternehmensgröße un) {
        this.un = un;
    }

    public void setEK(Integer EK) {
        this.EK = EK;
    }

    public void setOrt(String ort) {
        Ort = ort;
    }


    @Override
    public String toString() {
        return "Unternehmen{" +
                "id=" + id +
                ", Unternehmensname='" + Unternehmensname + '\'' +
                ", un=" + un +
                ", anz=" + anz +
                ", EK=" + EK +
                ", Ort='" + Ort + '\'' +
                '}';
    }
}


