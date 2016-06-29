package thescone.myexercise5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Event Listeners - waiting for a click
    // Callback - code that will be happen

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonOne = (Button) findViewById(R.id.buttonOne);

        // Event Listeners for buttonOne
        buttonOne.setOnClickListener(
                new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        TextView textOne = (TextView) findViewById(R.id.textOne);
                        textOne.setText("Yeay! setOnClickListener");
                    }
                }
        );

        // tap and hold (>1 sec)
        buttonOne.setOnLongClickListener(
                new Button.OnLongClickListener() {

                    @Override
                    public boolean onLongClick(View v) {
                        TextView textOne = (TextView) findViewById(R.id.textOne);
                        textOne.setText("Yeay! setOnLongClickListener");

                        return true; // if false, when release the tap, will return to onClick
                    }
                }
        );
    }
}
