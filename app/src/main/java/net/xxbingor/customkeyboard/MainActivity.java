package net.xxbingor.customkeyboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import net.xxbingor.customkeyboard.R;

import net.xxbingor.cuskblib.KeyBoardDialogUtils;

public class MainActivity extends AppCompatActivity {

    private KeyBoardDialogUtils keyBoardDialogUtils;
    private EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = findViewById(R.id.et_ssssss);
        keyBoardDialogUtils = new KeyBoardDialogUtils(this);
        et.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                keyBoardDialogUtils.show(et, "ssss");
            }
        });
    }
}
