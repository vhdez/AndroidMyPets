package sla.org.androidmypets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private Controller controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button prevButton = findViewById(R.id.prevButton);
        TextView petCountText = findViewById(R.id.petCountText);
        Button nextButton = findViewById(R.id.nextButton);
        TextView hiText = findViewById(R.id.hiText);
        TextView descriptiontext = findViewById(R.id.descriptionText);

        controller = new Controller(prevButton, petCountText, nextButton, hiText, descriptiontext);
    }
}
