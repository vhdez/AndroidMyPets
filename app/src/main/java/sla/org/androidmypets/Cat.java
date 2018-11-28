package sla.org.androidmypets;

class Cat extends Pet {

    // Constructors
    Cat(int theAge, String theName, boolean eatsWhat, String owner) {
        super(theAge, theName, eatsWhat, owner);
        petType = "cat";
    }

    // Interface
    public String hiMessage() {
        return "Meow!";
    }

    public String description() {
        String desc = "I'm a " + getPetType() + " named " + getName() + ".";
        desc = desc + "  My owner is " + getOwner() + ".";
        desc = desc + "  I'm " + getAge() + " human years old.";
        if (getEatsDryFood()) {
            desc = desc + "  I eat dry food.";
        } else {
            desc = desc + "  I eat wet food.";
        }
        return desc;
    }
}