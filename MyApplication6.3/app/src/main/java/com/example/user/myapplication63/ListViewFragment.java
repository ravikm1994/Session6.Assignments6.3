package com.example.user.myapplication63;

import android.app.ListFragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class ListViewFragment extends ListFragment {
    private List<ListViewItem> mItems;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mItems = new ArrayList<ListViewItem>();
        Resources resources = getResources();

        mItems.add(new ListViewItem(ContextCompat.getDrawable(getActivity().getApplicationContext(),R.drawable.you_tube),"You Tube","You Tube Description"));
        mItems.add(new ListViewItem(ContextCompat.getDrawable(getActivity().getApplicationContext(),R.drawable.blogger), "Blogger","Blogger description"));

        setListAdapter(new ListViewAdapter(getActivity(), mItems));
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getListView().setDivider(null);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        ListViewItem item = mItems.get(position);

        Toast.makeText(getActivity(), item.title, Toast.LENGTH_SHORT).show();
    }
}