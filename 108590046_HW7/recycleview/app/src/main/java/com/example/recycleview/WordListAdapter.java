package com.example.recycleview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder>  {
    private LayoutInflater mInflater;
    private final LinkedList<String> mWordList;
    private final LinkedList<String> mWordList2;
    private Context context1;
    public WordListAdapter(Context context, LinkedList<String> wordList,LinkedList<String> wordList2) {
        mInflater = LayoutInflater.from(context);
        context1 = context;
        this.mWordList = wordList;
        this.mWordList2 = wordList2;
    }
    class WordViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener {
        public final TextView wordItemView;
        public final TextView wordItemView2;

        final WordListAdapter mAdapter;

        public WordViewHolder(View itemView, WordListAdapter adapter) {
            super(itemView);
            wordItemView = itemView.findViewById(R.id.word);
            wordItemView2 = itemView.findViewById(R.id.word2);

            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }
        @Override
        public void onClick(View v) {
            // Get the position of the item that was clicked.
            int mPosition = getLayoutPosition();
            // Use that to access the affected item in mWordList.
            String element = mWordList.get(mPosition);
            // Change the word in the mWordList.
            Intent intent=new Intent(context1, recipes.class);
            intent.putExtra("position",mPosition);
            context1.startActivity(intent);

            // Notify the adapter, that the data has changed so it can
            // update the RecyclerView to display the data.
            mAdapter.notifyDataSetChanged();
        }
    }


    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.wordlist_item, parent, false);
        return new WordViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(WordViewHolder holder, int position) {
        String mCurrent = mWordList.get(position);
        String mCurrent2 = mWordList2.get(position);

        holder.wordItemView.setText(mCurrent);
        holder.wordItemView2.setText(mCurrent2);
    }

    @Override
    public int getItemCount() {
        return mWordList.size();
    }
}
