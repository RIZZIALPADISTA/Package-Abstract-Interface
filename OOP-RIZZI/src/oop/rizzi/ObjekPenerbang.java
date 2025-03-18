package oop.rizzi;

public class ObjekPenerbang {
    public static void main(String[] args) {
        
        Pilot pilot = new Pilot();
        
        pilot.setJenisTerbang("Pesawat");
        pilot.setKecepatan(400);
        pilot.isMesin(true);
        
        pilot.infoPenerbang();
    }
}
