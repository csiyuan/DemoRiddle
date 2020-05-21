package sg.edu.rpc346.id19016011.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AnswerActivity1 extends AppCompatActivity {

    TextView tvAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);

        tvAnswer = findViewById(R.id.textView);
        tvAnswer.setText("In Second Activity");

        Intent intentReceived = getIntent();
        String questionsSelected = intentReceived.getStringExtra("Question");
        tvAnswer.setText(questionsSelected + " answer is: Queue");

    }
}
