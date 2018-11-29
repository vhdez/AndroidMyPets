package sla.org.androidmypets;

class MyPets {
    private Model[] pets;
    private int current;

    MyPets() {
        current = 0;

        // There are 12 pets.
        pets = new Model[12];

        pets[0] = new Dog(3, "Bowser", false, "Mr. Hernandez");
        pets[1] = new Dog(14, "Tully", true, "Mr. Hernandez");
        pets[2] = new Cat(15, "Ralph", false, "Mr. Hernandez");
        pets[3] = new Cat(17, "Buddy", true, "Donny");
        pets[4] = new Wolf(10, "Rexsivl", false, "Donny");
        pets[5] = new Cat(5, "Magnum", true, "Paxton");
        pets[6] = new Rock(7, "Rocky", false, "Paxton");
        pets[7] = new Dog(1, "George", false, "Andrew");
        pets[8] = new Iguana(5, "Iggy", false, "Andrew");
        pets[9] = new Dog(2, "Callie", true, "Eric");
        pets[10] = new Cat(5, "Salem", false, "Val");
        pets[11] = new Slothy(10, "Sleepy", true, "Val");
    }

    int count() {
        return pets.length;
    }

    int currentIndex() {
        return current;
    }

    Model current() {
        return pets[current];
    }

    void next() {
        // increment current to point to next pet
        if (current < pets.length - 1) {
            current = current + 1;
        } else {
            current = 0;
        }
    }

    void previous() {
        // increment current to point to previous pet
        if (current > 0) {
            current = current - 1;
        } else {
            current = pets.length - 1;
        }
    }
}