package restu.galih.projek.myviewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.WeaherViewHolder> {
   private ArrayList<WeatherItems>mData=new ArrayList<>();
   public void setData(ArrayList<WeatherItems>items){
       mData.clear();
       mData.addAll(items);
       notifyDataSetChanged();
   }
    @NonNull
    @Override
    public WeaherViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
       View mView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.weather_items,viewGroup,false);
       return new WeaherViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull WeatherAdapter.WeaherViewHolder holder, int position) {
       holder.bind(mData.get(position));

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class WeaherViewHolder extends RecyclerView.ViewHolder {
       TextView textViewNamaKota;
       TextView textViewTemperature;
       TextView textViewDescription;

        public WeaherViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewNamaKota=itemView.findViewById(R.id.textKota);
            textViewTemperature=itemView.findViewById(R.id.textTemp);
            textViewDescription=itemView.findViewById(R.id.textDesc);
        }

        public void bind(WeatherItems weatherItems) {
            textViewNamaKota.setText(weatherItems.getName());
            textViewTemperature.setText(weatherItems.getTemperature());
            textViewDescription.setText(weatherItems.getDescription());
        }
    }
}
