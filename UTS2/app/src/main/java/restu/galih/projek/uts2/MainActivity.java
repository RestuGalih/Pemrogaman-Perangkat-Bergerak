package restu.galih.projek.uts2;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this,getMylist());
        mRecyclerView.setAdapter(myAdapter);
    }
    private ArrayList<Model> getMylist(){

        ArrayList<Model> models = new ArrayList<>();

        Model model = new Model();
        model.setTitle("Melati Daeva");
        model.setDescription("Melati Daeva Oktavianti merupakan pemain bulu tangkis asal Indonesia. Atlet kelahiran Serang, 26 Oktober 1994ini merupakan pemain asal klub PB Djarum. Ia merupakan peraih medali emas Kejuaraan Dunia Junior BWF 2012 bersama Edi Subaktiar.Ia saat ini dipasangkan dengan Praveen Jordan di nomor ganda campuran");
        model.setImg(R.drawable.mel);
        models.add(model);

        model = new Model();
        model.setTitle("Yolla Yuliana");
        model.setDescription("Yolla Yuliana lahir di Bandung, 16 Mei 1994. Dunia voli sudah melekat pada keluarga Yolla. Ada pepatah buah jatuh tidak jauh dari pohonnya. Pepatah itu tepat sekali bagi Yolla karena ia memiliki seorang ibu yang juga mantan pemain voli handal");
        model.setImg(R.drawable.yolla);
        models.add(model);

        model = new Model();
        model.setTitle("Pungky Afriecia");
        model.setDescription("Pungky Afriecia, nama yang satu ini tentu sudah sering didengar oleh para pecinta voli Indonesia, maklum pevoli cantik kelahiran 21 tahun silam ini selalu menjadi pusat perhatian penonton ketika ia dan timnya berlaga. Pungky dianggap sebagai salah satu atlet tercantik Indonesia saat ini.");
        model.setImg(R.drawable.pungky);
        models.add(model);

        model = new Model();
        model.setTitle("Lindswell Kwok");
        model.setDescription("Lindswell Kwok. Lindswell (Hanzi: 郭利娟; pinyin: Guō Lìjuān, lahir di Binjai, 24 September 1991; umur 28 tahun) adalah seorang atlet wushu Indonesia yang berasal dari Sumatra Utara.");
        model.setImg(R.drawable.lindswell);
        models.add(model);

        model = new Model();
        model.setTitle("Dellie Threesyadinda");
        model.setDescription("Wanita yang akrab disapa Dinda ini lahir pada 12 Mei 1990. Ia adalah putri dari Denny Trisyanto dan atlet panahan senior Lilies Handayani. Wanita berparas cantik ini memang tumbuh di tengah-tengah keluarga atlet");
        model.setImg(R.drawable.del);
        models.add(model);

        return models;
    }
    public boolean onCreateOptionsMenu (Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.profil:
                Intent activity1 = new Intent(this, Toolbar.class);
                startActivity(activity1);
                return true;
            default:
                return true;
        }
    }
}
