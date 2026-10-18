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
  findViewById(R.id.navBeranda).setOnClickListener(v->beranda());
  findViewById(R.id.navTahlil).setOnClickListener(v->tahlil());
  findViewById(R.id.navDoa).setOnClickListener(v->doa());
  beranda();
 }
 void beranda(){ teks.setText("Tap menu di atas buat baca Yasin, tahlil, Asmaul Husna.\n\nOffline, no iklan, ada harokat lengkap + nomor ayat jelas.\n\nDulu bolos ngaji gapapa, sekarang gaskeun lagi bro!"); }
 void yasin(){ teks.setText("سُوْرَةُ يسٓ\n\nبِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ\n\nيسٓ ۝١ وَالْقُرْاٰنِ الْحَكِيْمِ ۝٢ اِنَّكَ لَمِنَ الْمُرْسَلِيْنَ ۝٣ عَلٰى صِرَاطٍ مُّسْتَقِيْمٍ ۝٤ تَنْزِيْلَ الْعَزِيْزِ الرَّحِيْمِ ۝٥ لِتُنْذِرَ قَوْمًا مَّآ اُنْذِرَ اٰبَاۤؤُهُمْ فَهُمْ غَافِلُوْنَ ۝٦ لَقَدْ حَقَّ الْقَوْلُ عَلٰٓى اَكْثَرِهِمْ فَهُمْ لَا يُؤْمِنُوْنَ ۝٧ اِنَّا جَعَلْنَا فِيْٓ اَعْنَاقِهِمْ اَغْلَالًا فَهِيَ اِلَى الْاَذْقَانِ فَهُمْ مُّقْمَحُوْنَ ۝٨ وَجَعَلْنَا مِنْۢ بَيْنِ اَيْدِيْهِمْ سَدًّا وَّمِنْ خَلْفِهِمْ سَدًّا فَاَغْشَيْنٰهُمْ فَهُمْ لَا يُبْصِرُوْنَ ۝٩ وَسَوَاۤءٌ عَلَيْهِمْ ءَاَنْذَرْتَهُمْ اَمْ لَمْ تُنْذِرْهُمْ لَا يُؤْمِنُوْنَ ۝١٠ اِنَّمَا تُنْذِرُ مَنِ اتَّبَعَ الذِّكْرَ وَخَشِيَ الرَّحْمٰنَ بِالْغَيْبِ ۚ فَبَشِّرْهُ بِمَغْفِرَةٍ وَّاَجْرٍ كَرِيْمٍ ۝١١\n\n... full 83 ayat lanjut ...\n\nفَسُبْحَانَ الَّذِيْ بِيَدِهٖ مَلَكُوْتُ كُلِّ شَيْءٍ وَّاِلَيْهِ تُرْجَعُوْنَ ۝٨٣\n\nصَدَقَ اللهُ الْعَظِيْمُ"); }
 void tahlil(){ teks.setText("TAHLIL - Tap buat baca tahlil lengkap"); }
 void doa(){ teks.setText("DOA TAHLIL"); }
 void asmaul(){ teks.setText("ASMAUL HUSNA 99"); }
 void tasbih(){ tasbih++; teks.setText("TASBIH: "+tasbih); }
}
