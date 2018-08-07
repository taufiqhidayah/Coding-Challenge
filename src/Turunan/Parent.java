package Turunan;

public class Parent {
   private String nama = "Nama ortu";
    private Integer umur = 13;
     String status="jomblo";
    public  String getJomblo(){
        return status;

    }
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    protected Integer getUmur() {
        return umur;
    }

    public void setUmur(Integer umur) {
        this.umur = umur;
    }
}
