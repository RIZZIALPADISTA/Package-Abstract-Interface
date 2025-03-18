package oop.rizzi;

public abstract class Penerbang {
    private String name;
    int age;
    String jenis;
    
    public void setPenerbang(String name, int age) {
        this.name = name;
        this.age = age;              
    }

    public String getName() {
        return this.name;
    }
    
    public abstract void setJenisTerbang(String jenis);
    public abstract void infoPenerbang();
    
}
