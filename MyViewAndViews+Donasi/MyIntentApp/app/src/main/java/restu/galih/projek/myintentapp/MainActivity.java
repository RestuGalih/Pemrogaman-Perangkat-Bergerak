package restu.galih.projek.myintentapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements
        View.OnClickListener{
    Button btnMoveActivity;
    Button btnMoveWithDataActivity;
    Button btnDial;
    Button btnWeb;
    Button btnMove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                btnMoveActivity = findViewById(R.id.btn_move_activity);
                btnMoveActivity.setOnClickListener(this);
                btnMoveWithDataActivity = findViewById(R.id.btn_move_activity_data);
                btnMoveWithDataActivity.setOnClickListener(this);
                btnDial= findViewById(R.id.btn_dial);
                btnDial.setOnClickListener(this);
                btnWeb=findViewById(R.id.btn_web);
                btnWeb.setOnClickListener(this);
                btnMove=findViewById(R.id.btn_move);
                btnMove.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_move_activity:
                Intent moveActivity=new Intent(MainActivity.this, NewActivity.class);
                startActivity(moveActivity);
                break;
            case R.id.btn_move_activity_data:
        Intent moveWithDataInten = new Intent(MainActivity.this, MoveActivityWithData.class);
            moveWithDataInten.putExtra(MoveActivityWithData.EXTRA_NAME, "RESTU GALIH");
            moveWithDataInten.putExtra(MoveActivityWithData.EXTRA_AGE, 19);
            startActivity(moveWithDataInten);
            break;

            case R.id.btn_dial:
                String phoneNumber = "082325312882";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhoneIntent);
                break;

            case R.id.btn_web:
                String webPolines="http://www.polines.ac.id";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(webPolines)));
                break;

            case R.id.btn_move:
                Intent Move= new Intent(MainActivity.this, InputActivity.class);
                startActivity(Move);







        }
    }
}
