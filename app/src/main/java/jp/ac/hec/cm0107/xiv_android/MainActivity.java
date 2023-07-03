package jp.ac.hec.cm0107.xiv_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtFC;
    EditText edtChara;
    Button btnFC;
    Button btnChara;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtFC = findViewById(R.id.edtFCName);
        edtChara = findViewById(R.id.edtCharaName);
        btnFC = findViewById(R.id.btnFC);
        btnChara = findViewById(R.id.btnChara);



    }
}