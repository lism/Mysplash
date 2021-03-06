package com.wangdaye.mysplash.common.ui.adapter.multipleState;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wangdaye.mysplash.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MiniErrorStateAdapter extends RecyclerView.Adapter<MiniErrorStateAdapter.ViewHolder> {

    private OnRetryListener listener;

    class ViewHolder extends RecyclerView.ViewHolder {

        ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        void onBindView() {
            // do nothing.
        }

        @OnClick({R.id.item_multiple_state_error_mini_retryButton}) void retry() {
            listener.onRetry();
        }
    }

    public MiniErrorStateAdapter(@NonNull OnRetryListener l) {
        this.listener = l;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_multiple_state_error_mini, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBindView();
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public interface OnRetryListener {
        void onRetry();
    }
}
