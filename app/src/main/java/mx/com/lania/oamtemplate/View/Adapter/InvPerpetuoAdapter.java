package mx.com.lania.oamtemplate.View.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import mx.com.lania.oamtemplate.POJOS.InvPerpetuo;
import mx.com.lania.oamtemplate.R;

public class InvPerpetuoAdapter extends RecyclerView.Adapter<InvPerpetuoAdapter.InvPerpetuoViewHolder> {

    private ArrayList<InvPerpetuo> data;

    public InvPerpetuoAdapter(ArrayList<InvPerpetuo> data) {
        this.data = data;
    }

    @Override
    public InvPerpetuoAdapter.InvPerpetuoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new InvPerpetuoAdapter.InvPerpetuoViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview_inv_perpetuos, parent, false));
    }

    @Override
    public void onBindViewHolder(InvPerpetuoAdapter.InvPerpetuoViewHolder holder, int position) {
        InvPerpetuo invPerpetuo = data.get(position);
        holder.tvNombreDesc.setText(invPerpetuo.getNombre());
        holder.tvImporteDesc.setText(String.valueOf(invPerpetuo.getImporte()));
        holder.tvCuentaDesc.setText(invPerpetuo.getCuenta());
        holder.tvNaturalezaDesc.setText(invPerpetuo.getNaturaleza());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class InvPerpetuoViewHolder extends RecyclerView.ViewHolder {
        TextView tvNombreDesc;
        TextView tvImporteDesc;
        TextView tvCuentaDesc;
        TextView tvNaturalezaDesc;

        public InvPerpetuoViewHolder(View itemView) {
            super(itemView);
            tvNombreDesc = itemView.findViewById(R.id.tvNombreDesc);
            tvImporteDesc = itemView.findViewById(R.id.tvImporteDesc);
            tvCuentaDesc = itemView.findViewById(R.id.tvCuentaDesc);
            tvNaturalezaDesc = itemView.findViewById(R.id.tvNaturalezaDesc);
        }
    }
}