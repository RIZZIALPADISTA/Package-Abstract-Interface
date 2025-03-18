package oop.rizzi;

public class Pilot extends Penerbang implements InterfacePenerbang {
    String jenis;
    boolean status;
    int kecepatan;
    @Override
    public void setJenisTerbang(String jenis) {
        this.jenis = jenis;
    }

    @Override
    public void setKecepatan(int kecepatan) {
       this.kecepatan = kecepatan;
    }

    @Override
    public void isMesin(boolean status) {
        this.status = status;
    }
    
    @Override
    public void infoPenerbang() {
        System.out.println("Kecepatan: " + this.kecepatan);
        System.out.println("Status mesin: " + this.status);
        System.out.println("Jenis: " + this.jenis);       
    }
}
