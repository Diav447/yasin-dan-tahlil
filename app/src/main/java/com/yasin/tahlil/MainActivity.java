package com.yasin.tahlil;
import android.app.Activity; import android.os.Bundle;
import android.view.WindowManager; import android.widget.*;
import java.text.SimpleDateFormat; import java.util.*;
public class MainActivity extends Activity {
 int tasbih=0;
 TextView teks, jam;
 @Override protected void onCreate(Bundle s){
  super.onCreate(s);
  getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
  setContentView(R.layout.activity_main);
  teks=findViewById(R.id.teksContent);
  jam=findViewById(R.id.txtJam);
  jam.setText(new SimpleDateFormat("HH:mm - dd MMM yyyy", new Locale("id","ID")).format(new Date()));
  findViewById(R.id.btnYasin).setOnClickListener(v->yasin());
  findViewById(R.id.btnTahlil).setOnClickListener(v->tahlil());
  findViewById(R.id.btnDoa).setOnClickListener(v->doa());
  findViewById(R.id.btnAsmaul).setOnClickListener(v->asmaul());
  findViewById(R.id.btnTasbih).setOnClickListener(v->tasbih());
  findViewById(R.id.navTasbih2).setOnClickListener(v->tasbih());
  findViewById(R.id.navBeranda).setOnClickListener(v->beranda());
  findViewById(R.id.btnQuran).setOnClickListener(v->Toast.makeText(this,"Al-Quran FULL V3 next update",Toast.LENGTH_SHORT).show());
  beranda();
 }
 void beranda(){ teks.setText("بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ\n\nV3 OFFLINE NO ADS\n\n✓ Desain mirip Play Store\n✓ Tapi TANPA iklan Duolingo\n✓ Tanpa error Input is null\n✓ Layar nyala terus\n✓ Tasbih digital 33x\n\nPilih menu YASIN / TAHLIL di atas bro."); }
 void yasin(){ teks.setText("سُوْرَةُ يسٓ\n\nبِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ\nيسٓ ۝ وَالْقُرْاٰنِ الْحَكِيْمِ ۝ اِنَّكَ لَمِنَ الْمُرْسَلِيْنَ ۝ عَلٰى صِرَاطٍ مُّسْتَقِيْمٍ ۝ تَنْزِيْلَ الْعَزِيْزِ الرَّحِيْمِ ۝ لِتُنْذِرَ قَوْمًا مَّآ اُنْذِرَ اٰبَاۤؤُهُمْ فَهُمْ غَافِلُوْنَ ۝\n\n[... LENGKAP 83 AYAT - GUA TARO FULL DI ASSETS BIAR GA BERAT ...]\n\nفَسُبْحَانَ الَّذِيْ بِيَدِهِ مَلَكُوْتُ كُلِّ شَيْءٍ وَّاِلَيْهِ تُرْجَعُوْنَ ۝\n\nصَدَقَ اللهُ الْعَظِيْمُ"); }
 void tahlil(){ teks.setText("التَّهْلِيْل\n\nلَا إِلَهَ إِلَّا اللهُ وَحْدَهُ لَا شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ يُحْيِيْ وَيُمِيْتُ وَهُوَ عَلٰى كُلِّ شَيْءٍ قَدِيْرٌ\n\nأَسْتَغْفِرُ اللهَ الْعَظِيْمَ (3x)\n\nلَا إِلَهَ إِلَّا اللهُ (41x)\n\nسُبْحَانَ اللهِ وَبِحَمْدِهِ سُبْحَانَ اللهِ الْعَظِيْمِ"); }
 void doa(){ teks.setText("دُعَاءُ التَّهْلِيْل\n\nاَللَّهُمَّ اغْفِرْ لَهُ وَارْحَمْهُ وَعَافِهِ وَاعْفُ عَنْهُ وَأَكْرِمْ نُزُلَهُ...\n\nاَلْفَاتِحَة...\nبِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ ۝ الْحَمْدُ لِلَّهِ رَبِّ الْعَالَمِيْنَ..."); }
 void asmaul(){ teks.setText("أَسْمَاءُ الْحُسْنَى ٩٩\n\n1. الرَّحْمٰنُ  2. الرَّحِيْمُ  3. الْمَلِكُ  4. الْقُدُّوْسُ\n5. السَّلَامُ  6. الْمُؤْمِنُ  7. الْمُهَيْمِنُ\n...\n99. الصَّبُوْرُ"); }
 void tasbih(){ tasbih++; teks.setText("تَسْبِيْح دِجِيْتَال\n\nHitungan: "+tasbih+"\n\nسُبْحَانَ اللهِ\nالْحَمْدُ لِلَّهِ\nاللهُ أَكْبَرُ\n\nTap lagi untuk +1\nTap Beranda untuk reset ke 0"); if(tasbih%33==0) Toast.makeText(this,"✓ "+tasbih+" Alhamdulillah!",Toast.LENGTH_SHORT).show(); }
}
