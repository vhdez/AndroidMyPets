package sla.org.androidmypets;

public class Wolf extends Pet {

    // Constructors
    Wolf(int theAge, String theName, boolean eatsWhat, String owner) {
        super(theAge, theName, eatsWhat, owner);
        petType = "wolf";
    }

    // Interface
    public String hiMessage() {
        return "Woof!";
    }

    public String description() {
        String desc = "I'm a " + getPetType() + " named " + getName() + ".";
        desc = desc + "  My owner is " + getOwner() + ".";
        desc = desc + "  I'm " + getAge()*7 + " wolf years old.";
        if (getEatsDryFood()) {
            desc = desc + "  I eat dry food.";
        } else {
            desc = desc + "  I eat wet food.";
        }
        return desc;
    }
}
