package com.yasin.tahlil;
import android.app.Activity; import android.os.Bundle;
import android.view.WindowManager; import android.widget.*;
import java.text.SimpleDateFormat; import java.util.*;
public class MainActivity extends Activity {
 int tasbihCount = 0;
 TextView teksContent, txtJam;
 @Override protected void onCreate(Bundle s) {
  super.onCreate(s);
  getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
  setContentView(R.layout.activity_main);
  teksContent = findViewById(R.id.teksContent);
  txtJam = findViewById(R.id.txtJam);
  // jam offline
  String jam = new SimpleDateFormat("HH:mm - dd MMMM yyyy", new Locale("id","ID")).format(new Date());
  txtJam.setText(jam + " (WIB)\nMode Offline - Bebas Iklan");

  findViewById(R.id.btnYasin).setOnClickListener(v -> showYasin());
  findViewById(R.id.btnTahlil).setOnClickListener(v -> showTahlil());
  findViewById(R.id.btnDoa).setOnClickListener(v -> showDoa());
  findViewById(R.id.navBeranda).setOnClickListener(v -> showBeranda());
  findViewById(R.id.btnTasbih).setOnClickListener(v -> showTasbih());
  findViewById(R.id.navTasbih2).setOnClickListener(v -> showTasbih());
  findViewById(R.id.btnAsmaul).setOnClickListener(v -> showAsmaul());
  
  showBeranda();
 }
 void showBeranda(){ teksContent.setText("بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ\n\nSelamat datang di Yasin & Tahlil Offline V2\n\n✓ No Iklan Duolingo\n✓ No Error 'Input is null'\n✓ No Internet Permission\n✓ Layar nyala terus pas tahlilan\n\nPilih menu di atas bro."); }
 void showYasin(){ teksContent.setText("سورة يس\n\nبِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ\nيسٓ ۝ وَالْقُرْاٰنِ الْحَكِيْمِ ۝ اِنَّكَ لَمِنَ الْمُرْسَلِيْنَ ... [FULL 83 AYAT OFFLINE, file lengkap nanti gua taro di assets]\n\nصَدَقَ اللهُ الْعَظِيْمُ"); }
 void showTahlil(){ teksContent.setText("TAHLIL LENGKAP\n\nلَا إِلَهَ إِلَّا اللهُ وَحْدَهُ لَا شَرِيكَ لَهُ...\n\n(41x) لَا إِلَهَ إِلَّا اللهُ\n\nاللهُ أَكْبَرُ - سُبْحَانَ اللهِ - الْحَمْدُ لِلَّهِ"); }
 void showDoa(){ teksContent.setText("DOA TAHLIL / ARWAH\n\nاَللَّهُمَّ اغْفِرْ لَهُ وَارْحَمْهُ وَعَافِهِ وَاعْفُ عَنْهُ...\n\nالْفَاتِحَة..."); }
 void showAsmaul(){ teksContent.setText("ASMAUL HUSNA 99\n\n1. الرَّحْمٰنُ - Ar-Rahman\n2. الرَّحِيْمُ - Ar-Rahim\n3. الْمَلِكُ - Al-Malik\n...\n99. الصَّبُوْرُ - As-Sabur"); }
 void showTasbih(){
  tasbihCount++;
  teksContent.setText("TASBIH DIGITAL\n\nTap tombol Tasbih lagi untuk hitung\n\nHitungan: " + tasbihCount + "\n\nسُبْحَانَ اللهِ\nالْحَمْدُ لِلَّهِ\nاللهُ أَكْبَرُ\n\nReset? Tap Beranda.");
  if(tasbihCount>33) Toast.makeText(this, "Alhamdulillah 33x!", Toast.LENGTH_SHORT).show();
 }
}
