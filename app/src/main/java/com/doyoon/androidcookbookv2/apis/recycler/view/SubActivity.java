package com.doyoon.androidcookbookv2.apis.recycler.view;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.doyoon.androidcookbookv2.CookbookActivity;
import com.doyoon.androidcookbookv2.R;

public class SubActivity extends CookbookActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // default code
        super.onCreate(savedInstanceState);
        setContentView(R.layout.apis_recycler_view_main_layout);

        main();
    }

    public void main() {
        inflateRecyclerView();
    }

    public void inflateRecyclerView() {

        RecyclerView recyclerView = findViewById(R.id.recyclerView_in_apis_main_recycler_view);

        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(lm);

        String[] dummyDataset = getDummyDataset();
        RecyclerView.Adapter adapter = new CustomAdapter(dummyDataset);
        recyclerView.setAdapter(adapter);
    }



    public class CustomAdapter extends  RecyclerView.Adapter<CustomViewHolder> {
        private String[] dataset;

        public CustomAdapter(String[] dataset) {
            this.dataset = dataset;
        }

        @NonNull
        @Override
        public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.apis_recycler_view_item_layout, viewGroup, false);
            return new CustomViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull CustomViewHolder customViewHolder, int i) {
            String msg = this.dataset[i];
            customViewHolder.setText("msg1 : " + msg, "msg2 : " + msg);
        }

        @Override
        public int getItemCount() {
            return dataset.length;
        }
    }


    public class CustomViewHolder extends  RecyclerView.ViewHolder {

        private TextView textView1;
        private TextView textView2;

        public CustomViewHolder(@NonNull View view) {
            super(view);
            textView1 = view.findViewById(R.id.textView1);
            textView2 = view.findViewById(R.id.textView2);
        }

        public void setText(String msg1, String msg2) {
            this.textView1.setText(msg1);
            this.textView2.setText(msg2);
        }
    }


    // private method
    private String[] getDummyDataset() {
        return new String[]{"A", "B", "C", "D", "E"};
    }



}
