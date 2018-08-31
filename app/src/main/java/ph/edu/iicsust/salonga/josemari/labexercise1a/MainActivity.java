package ph.edu.iicsust.salonga.josemari.labexercise1a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button pressMeButton = (Button) findViewById(R.id.pressMeButton);
        pressMeButton.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                EditText editText2 = (EditText) findViewById(R.id.editText2);
                EditText editText3 = (EditText) findViewById(R.id.editText3);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                int firstNum = Integer.parseInt(editText2.getText().toString());
                int secondNum = Integer.parseInt(editText3.getText().toString());
                if(firstNum>secondNum){
                    resultTextView.setText(firstNum + "");
                }else{
                    resultTextView.setText(secondNum + "");
                }
            }
        });

    }
}

