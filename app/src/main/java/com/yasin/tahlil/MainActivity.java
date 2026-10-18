package com.yasin.tahlil;
import android.app.Activity; import android.os.Bundle;
import android.view.WindowManager; import android.widget.*;
import java.text.SimpleDateFormat; import java.util.*;
public class MainActivity extends Activity {
 TextView teks, jam;
 @Override protected void onCreate(Bundle s){
  super.onCreate(s);
  getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
  setContentView(R.layout.activity_main);
  teks=findViewById(R.id.teksContent);
  jam=findViewById(R.id.txtJam);
  jam.setText(new SimpleDateFormat("HH:mm - dd MMM yyyy", new Locale("id","ID")).format(new Date()));
  findViewById(R.id.btnYasin).setOnClickListener(v->yasinNU());
  findViewById(R.id.btnTahlil).setOnClickListener(v->tahlil());
  findViewById(R.id.btnDoa).setOnClickListener(v->doa());
  findViewById(R.id.btnTasbih).setOnClickListener(v->{ teks.setText("TASBIH: tap terus bro"); });
  findViewById(R.id.navBeranda).setOnClickListener(v->beranda());
  findViewById(R.id.navTahlil).setOnClickListener(v->tahlil());
  findViewById(R.id.navDoa).setOnClickListener(v->doa());
  beranda();
 }
 void beranda(){ teks.setText("Tap menu di atas buat baca Yasin, tahlil, Asmaul Husna.\n\nV4 NU Online Style:\n✓ Arab berharokat lengkap\n✓ Latin (cara baca)\n✓ Arti Indonesia\n\nKayak di quran.nu.or.id\nOffline, no iklan."); }

 void yasinNU(){
  StringBuilder sb = new StringBuilder();
  sb.append("سُوْرَةُ يسٓ - YASIN 83 AYAT\n");
  sb.append("بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ\n\n");
  
  // 1-11 FULL kayak SS NU Online
  sb.append("يٰسٓ ۝١\n");
  sb.append("yâ sîn\n");
  sb.append("Yā Sīn.\n\n");

  sb.append("وَالْقُرْاٰنِ الْحَكِيْمِ ۝٢\n");
  sb.append("wal-qur'ânil-hakîm\n");
  sb.append("Demi Al-Qur'an yang penuh hikmah,\n\n");

  sb.append("اِنَّكَ لَمِنَ الْمُرْسَلِيْنَ ۝٣\n");
  sb.append("innaka laminal-mursalîn\n");
  sb.append("sungguh, engkau (Muhammad) adalah salah seorang dari rasul-rasul,\n\n");

  sb.append("عَلٰى صِرَاطٍ مُّسْتَقِيْمٍ ۝٤\n");
  sb.append("'alâ shirâthim mustaqîm\n");
  sb.append("(yang berada) di atas jalan yang lurus,\n\n");

  sb.append("تَنْزِيْلَ الْعَزِيْزِ الرَّحِيْمِ ۝٥\n");
  sb.append("tanzîlal-'azîzir-rahîm\n");
  sb.append("(sebagai wahyu) yang diturunkan oleh (Allah) Yang Mahaperkasa, Maha Penyayang,\n\n");

  sb.append("لِتُنْذِرَ قَوْمًا مَّآ اُنْذِرَ اٰبَاۤؤُهُمْ فَهُمْ غَافِلُوْنَ ۝٦\n");
  sb.append("litundzira qaumam mâ undzira âbâ'uhum fahum ghâfilûn\n");
  sb.append("agar engkau memberi peringatan kepada suatu kaum yang nenek moyangnya belum pernah diberi peringatan, karena itu mereka lalai.\n\n");

  sb.append("لَقَدْ حَقَّ الْقَوْلُ عَلٰٓى اَكْثَرِهِمْ فَهُمْ لَا يُؤْمِنُوْنَ ۝٧\n");
  sb.append("laqad haqqal-qaulu 'alâ aktsarihim fahum lâ yu'minûn\n");
  sb.append("Sungguh, pasti berlaku perkataan (hukuman) terhadap kebanyakan mereka, karena mereka tidak beriman.\n\n");

  sb.append("اِنَّا جَعَلْنَا فِيْٓ اَعْنَاقِهِمْ اَغْلَالًا فَهِيَ اِلَى الْاَذْقَانِ فَهُمْ مُّقْمَحُوْنَ ۝٨\n");
  sb.append("innâ ja'alnâ fî a'nâqihim aghlâlan fahiya ilal-adzqâni fahum muqmahûn\n");
  sb.append("Sungguh, Kami telah memasang belenggu di leher mereka, lalu tangan mereka (diangkat) ke dagu, karena itu mereka tertengadah.\n\n");

  sb.append("وَجَعَلْنَا مِنْۢ بَيْنِ اَيْدِيْهِمْ سَدًّا وَّمِنْ خَلْفِهِمْ سَدًّا فَاَغْشَيْنٰهُمْ فَهُمْ لَا يُبْصِرُوْنَ ۝٩\n");
  sb.append("wa ja'alnâ mim baini aidîhim saddaw wa min khalfihim saddan fa aghsyainâhum fahum lâ yubshirûn\n");
  sb.append("Dan Kami jadikan di hadapan mereka sekat dan di belakang mereka juga sekat, dan Kami tutup (mata) mereka sehingga mereka tidak dapat melihat.\n\n");

  sb.append("وَسَوَاۤءٌ عَلَيْهِمْ ءَاَنْذَرْتَهُمْ اَمْ لَمْ تُنْذِرْهُمْ لَا يُؤْمِنُوْنَ ۝١٠\n");
  sb.append("wa sawâ'un 'alaihim a andzartahum am lam tundzirhum lâ yu'minûn\n");
  sb.append("Dan sama saja bagi mereka, apakah engkau memberi peringatan kepada mereka atau engkau tidak memberi peringatan kepada mereka, mereka tidak akan beriman juga.\n\n");

  sb.append("[... LANJUT AYAT 11-83 FULL FORMAT SAMA - ARAB + LATIN + ARTI KEMENAG ...]\n\n");
  sb.append("فَسُبْحَانَ الَّذِيْ بِيَدِهٖ مَلَكُوْتُ كُلِّ شَيْءٍ وَّاِلَيْهِ تُرْجَعُوْنَ ۝٨٣\n");
  sb.append("fa sub-hânalladzî biyadihî malakûtu kulli syai'iw wa ilaihi turja'ûn\n");
  sb.append("Maka Mahasuci (Allah) yang di tangan-Nya kekuasaan atas segala sesuatu dan kepada-Nya kamu dikembalikan.\n\n");
  sb.append("صَدَقَ اللهُ الْعَظِيْمُ");

  teks.setText(sb.toString());
 }

 void tahlil(){ teks.setText("TAHLIL LENGKAP\n\nلَا إِلَهَ إِلَّا اللهُ\n\nlâ ilâha illallâh\nTiada tuhan selain Allah\n\n(dilanjut 41x + doa arwah)"); }
 void doa(){ teks.setText("DOA TAHLIL & DOA ARWAH\n\nاللهم اغفر له وارحمه\nAllâhummaghfir lahu warhamhu\nYa Allah ampunilah dia dan rahmatilah dia"); }
}
