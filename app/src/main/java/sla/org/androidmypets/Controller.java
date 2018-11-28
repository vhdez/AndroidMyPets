package sla.org.androidmypets;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Controller {
    private Button prevButton;
    private TextView petCountText;
    private Button nextButton;
    private TextView hiText;
    private TextView descriptiontext;

    private MyPets myPets;

    Controller(Button p, TextView pc, Button n, TextView ht, TextView dt) {
        prevButton = p;
        petCountText = pc;
        nextButton = n;
        hiText = ht;
        descriptiontext = dt;

        myPets = new MyPets();
        displayCurrentPet();

        prevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayPrevPet();
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayNextPet();
            }
        });

    }

    private void displayCurrentPet() {
        petCountText.setText("Pet #" + (myPets.currentIndex()+1) + " of " + myPets.count());
        hiText.setText(myPets.current().hiMessage());
        descriptiontext.setText(myPets.current().description());
    }

    private void displayNextPet() {
        myPets.next();
        displayCurrentPet();
    }

    private void displayPrevPet() {
        myPets.previous();
        displayCurrentPet();
    }
}
