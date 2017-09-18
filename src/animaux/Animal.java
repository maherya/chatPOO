package animaux;

public class Animal {
    protected String name;
    protected String carac;
    protected String color;

    public Animal() {
    }

    public Animal(String name, String carac, String color) {
        this.name = name;
        this.carac = carac;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarac() {
        return carac;
    }

    public void setCarac(String carac) {
        this.carac = carac;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void manger(){
        
    }
    
    public void dormir(){
        
    }
    
    public void crier(){
        
    }
    
    
}
