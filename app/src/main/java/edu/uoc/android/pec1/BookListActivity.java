package edu.uoc.android.pec1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

import edu.uoc.android.pec1.fragments.BookDetailFragment;
import edu.uoc.android.pec1.fragments.BookListFragment;

public class BookListActivity extends AppCompatActivity implements
        BookListFragment.onFragmentInterationListener, BookDetailFragment.onFragmentInterationListener {

    public boolean dosPaneles;
    BookListFragment fragmentList;
    BookDetailFragment fragmentDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(getTitle());

        if (findViewById(R.id.item_detail_container) != null) {
            // Si se trata de la tablet
            dosPaneles = true;
        }

        //cargamos el fragment en la activity
        fragmentList = new BookListFragment();
        getSupportFragmentManager().
                beginTransaction().
                replace(R.id.list_container,fragmentList).commit();
    }
}