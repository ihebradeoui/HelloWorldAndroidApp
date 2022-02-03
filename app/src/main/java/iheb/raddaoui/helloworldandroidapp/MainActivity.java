package iheb.raddaoui.helloworldandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button greetingButton = (Button) findViewById(R.id.greeting_button);
        TextView helloTextView = (TextView) findViewById(R.id.hello_text_view);
        greetingButton.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        helloTextView.setText("hello Iheb");
                    }
                }
        );
    }
}