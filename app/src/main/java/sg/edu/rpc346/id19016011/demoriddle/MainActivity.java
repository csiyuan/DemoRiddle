package sg.edu.rpc346.id19016011.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvQ1, tvQ2;
    Button btnRevealQ1, btnRevealQ2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvQ1 = findViewById(R.id.textViewQ1);
        tvQ2 = findViewById(R.id.textViewQ2);
        btnRevealQ1 = findViewById(R.id.buttonRevealQ1);
        btnRevealQ2 = findViewById(R.id.buttonRevealQ2);
        btnRevealQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AnswerActivity1.class);
                i.putExtra("Question","Q1");
                startActivity(i);
            }
        });

        btnRevealQ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AnswerActivity2.class);
                i.putExtra("Question", "Q2");
                startActivity(i);
            }
        });
    }
}
