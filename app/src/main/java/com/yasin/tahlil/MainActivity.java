package com.yasin.tahlil;
import android.app.Activity; import android.os.Bundle;
import android.view.WindowManager; import android.widget.TextView;
public class MainActivity extends Activity {
    @Override protected void onCreate(Bundle s) {
        super.onCreate(s);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.activity_main);
        String yasin = "بِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ\n\nيس\nوَالْقُرْآنِ الْحَكِيمِ\n\n... (NANTI GUA KASIH FULL 83 AYAT + TAHLIL DI SINI) ...\n\nصَدَقَ اللهُ العَظِيْمِ";
        ((TextView)findViewById(R.id.teksYasin)).setText(yasin);
    }
}
