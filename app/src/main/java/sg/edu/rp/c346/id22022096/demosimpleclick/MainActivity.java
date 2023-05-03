package sg.edu.rp.c346.id22022096.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    //step 1 - declare field variables
    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tgbtn;
    RadioGroup rgGender;


    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //step 2 - link the field variables to UI elements in layout
        tvDisplay = findViewById(R.id.textviewDisplay);
        btnDisplay = findViewById(R.id.btn);
        etInput = findViewById(R.id.editTextInput);
        tgbtn = findViewById(R.id.toggleButtonEnabled);
        rgGender= findViewById(R.id.radioButtongenderm);
        rgGender= findViewById(R.id.radioButtongenderf);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            // Code for the action
            public void onClick(View view) {
                    String txt =etInput.getText().toString();
                    tvDisplay.setText(txt);
                Toast.makeText(MainActivity.this, txt, Toast.LENGTH_LONG).show();
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if (checkedRadioId == R.id.radioButtongenderm) {
                    tvDisplay.setText("he says "+ txt);
                } else {
                    if (checkedRadioId == R.id.radioButtongenderf) {
                        tvDisplay.setText("she says "+ txt);
                    }
                }
                }

        });

        tgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            //Code for the action
            public void onClick(View view) {
                if (tgbtn.isChecked()){
                    etInput.setEnabled(true);
                }else{
                    etInput.setEnabled(false);
                }


            }

        });

    }
}