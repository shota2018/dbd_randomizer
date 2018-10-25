package bacqua.dbd_random;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup_play;
    Button button_shuffle;
    TextView textView_perk;
    SubClass sc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_shuffle = findViewById(R.id.btn_shuffle);
        radioGroup_play = findViewById(R.id.rgp_play);
        textView_perk = findViewById(R.id.tv_perk);
        sc = new SubClass();

        button_shuffle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 選択されているラジオボタンの取得
                RadioButton radioButton = findViewById(radioGroup_play.getCheckedRadioButtonId());
                String rbtText = radioButton.getText().toString();

                switch (rbtText){
                    case "殺人鬼":
                        textView_perk.setText(sc.setResult(0));
                    case "生存者":
                        textView_perk.setText(sc.setResult(1));
                }
            }
        });

        }
}
