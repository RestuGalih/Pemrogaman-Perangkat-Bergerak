package restu.galih.projek.hmjpolines;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DetailListHmj extends AppCompatActivity {
    private int hmj_id;
    ImageView imgDetail;
    TextView tvname, tvdesc;
    private ArrayList<Hmj> listHmj = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list_hmj);

        hmj_id = getIntent().getIntExtra("hmj_id", 0);
        tvname = findViewById(R.id.nama_hmj);
        tvdesc = findViewById(R.id.desc_detail);
        imgDetail = findViewById(R.id.img_detail);

        listHmj.addAll(HmjData.getListData());
        setLayout();
    }

    void setLayout() {
        tvname.setText((listHmj.get(hmj_id).getName()));
        tvdesc.setText((listHmj.get(hmj_id).getDescription()));
        Glide.with(this)
                .load(listHmj.get(hmj_id).getPhoto())
                .apply(new RequestOptions().fitCenter())
                .into(imgDetail);
    }
}

