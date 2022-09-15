package mo.atef.amit.daythree.daythree.views.adapter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

public class ExclusiveRecyclerAdapter extends RecyclerView.Adapter<ExclusiveRecyclerAdapter.VersionViewHolder> {


    @NonNull
    @Override
    public VersionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull VersionViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class VersionViewHolder extends RecyclerView.ViewHolder{
        public VersionViewHolder(View itemView) {
            super(itemView);

        }
    }

}
