package restu.galih.projek.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InputActivity extends AppCompatActivity {
    Button btnPindah;
    EditText EtxPindah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        btnPindah=findViewById(R.id.btn_pindah);
        EtxPindah=findViewById(R.id.txt_input);
        btnPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Pindah = new Intent(InputActivity.this, LastActivity.class).putExtra("data",EtxPindah.getText().toString());
                startActivity(Pindah);
            }
        });
    }
}
