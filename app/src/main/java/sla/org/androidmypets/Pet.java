package sla.org.androidmypets;

class Pet implements Displayable {
    // Fields
    String petType;
    private int age;
    private String name;
    private boolean eatsDryFood;
    private String owner;

    // Constructors
    Pet(int theAge, String theName,
        boolean eatsWhat, String o) {
        age = theAge;
        name = theName;
        eatsDryFood = eatsWhat;
        owner = o;
        petType = "pet";
    }

    // Interface
    public String hiMessage() {
        return "I don't know.  Don't ask me.";
    }
    public String description() {
        return "I'm a pet.  My owner is " + owner;
    }

    // Methods

   int getAge() {
        return age;
    }

    String getPetType() {
        return petType;
    }

    String getName() {
        return name;
    }

    boolean getEatsDryFood() {
        return eatsDryFood;
    }

    String getOwner() {
        return owner;
    }

    void introduceOwner() {
        System.out.println("Owner is " + owner);
    }

    void sayHi() {
        System.out.println(hiMessage());
    }

    void describe() {
        System.out.println(description());
    }
}
