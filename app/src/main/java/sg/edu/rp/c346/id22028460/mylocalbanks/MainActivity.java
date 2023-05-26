package sg.edu.rp.c346.id22028460.mylocalbanks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvDBS;
    TextView tvOCBC;
    TextView tvUOB;
    String wordClicked = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDBS = findViewById(R.id.TVDBS);
        tvOCBC = findViewById(R.id.TVOCBC);
        tvUOB = findViewById(R.id.TVUOB);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        if (v==tvDBS){
            wordClicked = "DBS";
        }
        else if (v == tvOCBC){
            wordClicked = "OCBC";
        }
        else if (v == tvUOB) {
            wordClicked = "UOB";
        }

        menu.add(0,0,0,"Website");
        menu.add(0,1,1,"Contact Bank");
    }

}