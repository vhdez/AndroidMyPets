package sla.org.androidmypets;

// Written by Paxton.

class Rock extends Pet {

    // Constructors
    Rock(int theAge, String theName, boolean eatsWhat, String owner) {
        super(theAge, theName, eatsWhat, owner);
        petType = "rock";
    }

    // Interface
    public String hiMessage() {
        return "....!";
    }

    public String description() {
        String desc = "This is my pet " + getPetType() + " named " + getName() + ".";
        desc = desc + "  Its owner is " + getOwner() + ".";
        desc = desc + "  It's " + getAge()*0.001 + " rock years old.";
        if (getEatsDryFood()) {
            desc = desc + "  It doesn't eat.";
        } else {
            desc = desc + "  It doesn't eat.";
        }
        return desc;
    }
}
