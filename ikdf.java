package whats.app.scoreboard_muj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    
    private TextView count;
    private Button one, two, three;
    private Button reset;
    private int grow=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        count=findViewById(R.id.tvCount);
        one=findViewById(R.id.button1);
        two=findViewById(R.id.button2);
        three=findViewById(R.id.button3);
        reset=findViewById(R.id.resetBtn);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grow++;
               count.setText((String.valueOf(grow)));
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grow=grow+2;
                count.setText((String.valueOf(grow)));
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grow=grow+3;
                count.setText((String.valueOf(grow)));
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count.setText("");
            }
        });


    }
}
