package com.github.materialcolor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.LinearLayout;

import com.ornach.alex.materialcolor.Color;
import com.ornach.alex.materialcolor.MaterialColor;

public class MainActivity extends AppCompatActivity {

    Button btnRandBg, btnArrayColor;
    GridView gridView;
    LinearLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        container = (LinearLayout) findViewById(R.id.container);
        btnRandBg = (Button) findViewById(R.id.btn_rand_bg);
        btnArrayColor = (Button) findViewById(R.id.btn_color_grid);
        gridView = (GridView) findViewById(R.id.gridView);

        updateGridView();

        btnRandBg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /** for normal color **/
                container.setBackgroundColor(Color.getRandomColor());

                /** for Material color **/
                container.setBackgroundColor(MaterialColor.getRandomMaterialColor());
                
            }
        });

        btnArrayColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                updateGridView();
            }
        });
    }


    private void updateGridView(){
        /** get a array of material colors **/
        int[] colors = MaterialColor.getRandomMaterialColor(12);

        /** get a array of normal colors **/
        //int[] colors = Color.getRandomColors(12);

        Adapter adapter = new Adapter(this, colors);
        gridView.setAdapter(adapter);
    }
}
