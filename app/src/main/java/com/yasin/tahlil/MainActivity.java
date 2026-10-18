package com.yasin.tahlil;
import android.app.Activity; import android.os.Bundle;
import android.view.WindowManager; import android.widget.*;
import java.text.SimpleDateFormat; import java.util.*;
public class MainActivity extends Activity {
 TextView teks, jam; float size=28f;
 @Override protected void onCreate(Bundle s){
  super.onCreate(s);
  getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
  setContentView(R.layout.activity_main);
  teks=findViewById(R.id.teksContent);
  jam=findViewById(R.id.txtJam);
  jam.setText(new SimpleDateFormat("HH:mm - dd MMM yyyy", new Locale("id","ID")).format(new Date()));
  findViewById(R.id.btnMin).setOnClickListener(v->{ if(size>18){size-=2; teks.setTextSize(size);} });
  findViewById(R.id.btnPlus).setOnClickListener(v->{ if(size<48){size+=2; teks.setTextSize(size);} });
  findViewById(R.id.btnYasin).setOnClickListener(v->yasinNU());
  findViewById(R.id.btnTahlil).setOnClickListener(v->tahlil());
  findViewById(R.id.btnDoa).setOnClickListener(v->doa());
  findViewById(R.id.btnAsmaul).setOnClickListener(v->teks.setText("ASMAUL HUSNA"));
  findViewById(R.id.navBeranda).setOnClickListener(v->beranda());
  findViewById(R.id.navTahlil).setOnClickListener(v->tahlil());
  findViewById(R.id.navDoa).setOnClickListener(v->doa());
  beranda();
 }
 void beranda(){ teks.setTextSize(size); teks.setText("Tap menu di atas buat baca Yasin, tahlil, Asmaul Husna.\n\nV4.1 FONT JUMBO:\n✓ Arab GEDE (28sp default)\n✓ Ada tombol A- A+ kayak app sebelah\n✓ No iklan Shopee wkwk\n\nIni yang bokap mau bro!"); }
 void yasinNU(){ teks.setTextSize(size); teks.setText("يٰسٓ ۝١\nyâ sîn\nYā Sīn.\n\nوَالْقُرْاٰنِ الْحَكِيْمِ ۝٢\nwal-qur'ânil-hakîm\nDemi Al-Qur'an yang penuh hikmah,\n\n... full 83 ayat arab gede + latin + arti ...\n\nفَسُبْحَانَ الَّذِيْ بِيَدِهٖ مَلَكُوْتُ كُلِّ شَيْءٍ وَّاِلَيْهِ تُرْجَعُوْنَ ۝٨٣"); }
 void tahlil(){ teks.setTextSize(size); teks.setText("إِلَى حَضْرَةِ النَّبِيِّ الْمُصْطَفَى مُحَمَّدٍ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ وَاٰلِهٖ وَأَزْوَاجِهٖ وَأَوْلَادِهٖ وَذُرِّيَّاتِهٖ... الفاتحة\n\n[ FONT JUMBO V4.1 ]"); }
 void doa(){ teks.setTextSize(size); teks.setText("DOA TAHLIL JUMBO"); }
}
