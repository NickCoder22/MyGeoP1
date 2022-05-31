package com.example.mygeop1;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class articleClas extends AppCompatActivity {
    private int[] pandtar={R.string.a1,R.string.a2,R.string.a3,R.string.a4,R.string.a5};
    private int position = 0;
    private TextView uftext;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arti1);
        uftext=findViewById(R.id.textArticle);
        useful();
    }
    private void useful(){
        Intent x=getIntent();
        if(x!=null){

            position=x.getIntExtra("position",0);

        }
        uftext.setText(pandtar[position]);


    }
}
