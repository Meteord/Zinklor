package edu.hm.mjaumann.zinklor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

import edu.hm.mjaumann.zinklor.Data.DataTypes;
import edu.hm.mjaumann.zinklor.Data.Einheit;
import edu.hm.mjaumann.zinklor.Data.Geschwindigkeit;
import edu.hm.mjaumann.zinklor.Data.Kosten;
import edu.hm.mjaumann.zinklor.Data.Transport;

public class SearchActivity extends AppCompatActivity implements SearchView.OnQueryTextListener{
    private SearchView mSearchView;
    private ListView mListView;
    private Button addButton;
    private final String[] myErforschungen = {"schneller","weiter","höher"};
    private final String[] myUnits = {"troll","zwerg","uknowbro"};
    private final String[] myStaatsform = {"kommunismus","demokratie","Kolonialismus"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_units);
        mListView =  (ListView) findViewById(R.id.list_viewunits);
        mListView.setClickable(true);

        ArrayList<Einheit> arrayOfUnits = new ArrayList<Einheit>();
        arrayOfUnits.add(new Einheit("test", "tst", new Kosten(10, 20, 30, 40), 300, new Geschwindigkeit(4, 2), new Transport(100, 10), 0, true, "ffekt", "kommentar"));

        addButton = (Button) findViewById(R.id.addButton);

        //TODO onclick listener for list, wenn ausgewählt, passe das ausgewählte objekt zu der neuen aktivity, ändere es dort, wenn dort fertig, passe es wieder zurück.

        mSearchView = (SearchView) findViewById(R.id.search_viewUnits);
        mSearchView.setSubmitButtonEnabled(false);
        mSearchView.setIconified(false);

        final DataTypes whattoSearch = (DataTypes) getIntent().getSerializableExtra(GetTheGameStarted.SEARCH_DATA);
        switch (whattoSearch)
        {
            case Unit:
                mListView.setAdapter(new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1,
                        myUnits));
                addButton.setText("add Unit");
                break;
            case Staatsform:
                mListView.setAdapter(new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1,
                        myStaatsform));
                addButton.setText("add Staatsform");
                break;
            case Erforschung:
                mListView.setAdapter(new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1,
                        myErforschungen));
                addButton.setText("add Erforschung");
                break;
        }
        mListView.setTextFilterEnabled(true);
        setupSearchView();

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    private void setupSearchView() {
        mSearchView.setIconifiedByDefault(false);
        mSearchView.setOnQueryTextListener(this);
        mSearchView.setSubmitButtonEnabled(true);
        mSearchView.setQueryHint("Search Here");
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        if (TextUtils.isEmpty(newText)) {
            mListView.clearTextFilter();
        } else {
            mListView.setFilterText(newText.toString());
        }
        return true;
    }


}
