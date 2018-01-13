package android.dominando.ex03_orientacao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText edt;
    ArrayList<String> nomes;
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomes = new ArrayList<String>();
        edt = (EditText) findViewById(R.id.editText1);

        ListView listView = (ListView) findViewById(R.id.listView1);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,nomes);

        listView.setAdapter(adapter);

    }

    public void meuBotaoClick(View v){
        nomes.add(edt.getText().toString());
        edt.setText("");
        adapter.notifyDataSetChanged();;
    }
}
