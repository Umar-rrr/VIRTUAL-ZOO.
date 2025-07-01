
package Zoo1;

public abstract class Animal { 
    public String Name; 
    public String Type;

    public Animal(String name, String type) {
        this.Name = name;
        this.Type = type;
    }

    public String getName() {
        return Name;
    }

    public String getType() {
        return Type;
    }
    public abstract String makeSound();
}
