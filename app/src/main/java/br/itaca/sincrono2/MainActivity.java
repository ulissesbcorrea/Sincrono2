package br.itaca.sincrono2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button bt;
    TextInputEditText et;

    RadioGroup rg;
    RadioButton rb1, rb2;
    CheckBox cb1, cb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textView);
        bt = findViewById(R.id.button);
        et = findViewById(R.id.et);

        rg = findViewById(R.id.rg);
        rb1 = findViewById(R.id.radioButton);
        rb2 = findViewById(R.id.radioButton2);
        cb1 = findViewById(R.id.checkBox);
        cb2 = findViewById(R.id.checkBox2);


    }
        public void onClickRB(View view) {
            switch (rg.getCheckedRadioButtonId()){
                case R.id.radioButton:
                    Toast.makeText(getApplicationContext(), "Você selecionou o Gênero :"+rb1.getText(), Toast.LENGTH_SHORT).show();

                    break;
                case R.id.radioButton2:
                    Toast.makeText(getApplicationContext(), "Você selecionou o Gênero :"+rb2.getText(), Toast.LENGTH_SHORT).show();

                    break;
            }
        }
        public void onClickTrocaTexto(View view){
            if(cb1.isChecked()) {
                tv.setText(tv.getText()+ " Primeiro Checkbox");
            }
            if(cb2.isChecked()) {
                tv.setText(tv.getText()+ " Segundo Checkbox");
            }

//        String texto = et.getText().toString();
//        if (texto.length() < 10){
//            Toast.makeText(getApplicationContext(), "Por favor digite algo de mais de 10 caracteres!", Toast.LENGTH_LONG).show();
//            Snackbar.make(bt,"Por favor digite algo de mais de 10 caracteres!", Snackbar.LENGTH_INDEFINITE).show();
//            et.setError("Por favor digite algo de mais de 10 caracteres!");
//        }else {
//            tv.setText(texto);
//        }
    }
}