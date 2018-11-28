package sla.org.androidmypets;

class Iguana extends Pet {

    // Constructors
    Iguana(int theAge, String theName, boolean eatsWhat, String owner) {
        super(theAge, theName, eatsWhat, owner);
        petType = "iguana";
    }

    // Interface
    public String hiMessage() {
        return "*silence*";
    }

    public String description() {
        String desc = "I'm a " + getPetType() + " named " + getName() + ".";
        desc = desc + "  My owner is " + getOwner() + ".";
        desc = desc + "  I'm " + getAge()*16 + " human years old.";
        if (getEatsDryFood()) {
            desc = desc + "  I eat dry food.";
        } else {
            desc = desc + "  I eat wet food.";
        }
        return desc;
    }

}
