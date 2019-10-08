package restu.galih.projek.signup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LoginJActivity extends AppCompatActivity {
    Button btnMove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_j);
        btnMove=findViewById(R.id.btnRegister);
        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              startActivity(new Intent(LoginJActivity.this,MainActivity.class));
            }
        });
    }

}
