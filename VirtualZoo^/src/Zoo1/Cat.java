/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Zoo1;

/**
 *
 * @author my-pc
 */
public class Cat extends Animal
{
    public Cat() {
        super("Cat", "Mammal");
    }

    @Override
    public String makeSound() {
        return "Meow!";
    }
    
}
