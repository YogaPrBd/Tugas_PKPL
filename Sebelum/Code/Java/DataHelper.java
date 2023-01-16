package com.example.tugasproyek;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "dataRumahSakit.db";
    private static final int DATABASE_VERSION = 1;
    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
// TODO Auto-generated constructor stub
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
// TODO Auto-generated method stub
        String sql1 = "create table daftarRS(idRS integer primary key autoincrement, namaRS text null, alamat text null, noTelp integer null);";
        String sql2 = "create table antrianRS(idAntrian integer primary key autoincrement, namaRS text null, namaPasien text null, noHpPasien text null, noAntrian integer default 0);";
        Log.d("Data", "onCreate: " + sql1);
        Log.d("Data", "onCreate: " + sql2);

        db.execSQL(sql1);
        sql1 = "INSERT INTO daftarRS (idRS, namaRS, alamat, noTelp) VALUES " +
                "('1001', 'RSPAU. Hardjolukito', 'Jl. Ringroad Timur, Karang Janbe, Banguntapan, Kec. Banguntapan, Kabupaten Bantul, Daerah Istimewa Yogyakarta', '0274444715')" +
                ", ('1002', 'RSUD. Yogyakarta', 'Jl. Ki Ageng Pemanahan No.1-6, Sorosutan, Kec. Umbulharjo, Kota Yogyakarta, Daerah Istimewa Yogyakarta 55162', '0274371195')" +
                ", ('1003', 'RS Bethesda', 'Jl. Jend. Sudirman No.70, Kotabaru, Kec. Gondokusuman, Kota Yogyakarta, Daerah Istimewa Yogyakarta 55224', '0274586688')" +
                ", ('1004', 'RS Bethesda Lempuyangan', 'Jl. Hayam Wuruk No.6, Bausasran, Kec. Danurejan, Kota Yogyakarta, Daerah Istimewa Yogyakarta 55211', '0274512257')" +
                ", ('1005', 'RS Panti Rapih', 'Jl. Cik Di Tiro No.30, Samirono, Terban, Kec. Gondokusuman, Kota Yogyakarta, Daerah Istimewa Yogyakarta 55223', '0274563333')" +
                ", ('1006', 'RSI Hidayatullah', 'Jl. Veteran No.184, Pandeyan, Kec. Umbulharjo, Kota Yogyakarta, Daerah Istimewa Yogyakarta 55161', '0274389194')" +
                ", ('1007', 'RS PKU Muhammadiyah', 'Jl. KH. Ahmad Dahlan No.20, Ngupasan, Kec. Gondomanan, Kota Yogyakarta, Daerah Istimewa Yogyakarta 55122', '0274512653')" +
                ", ('1008', 'RS PKU Gamping', 'Jl. Wates, Jl. Nasional III KM.5,5, Bodeh, Ambarketawang, Kec. Gamping, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55294', '02746499704')" +
                ", ('1009', 'HappyLand Medical Centre', 'Jl. Ipda Tut Harsono Jl. Melati Wetan No.53, Muja Muju, Kec. Umbulharjo, Kota Yogyakarta, Daerah Istimewa Yogyakarta 55165', '0274550060')" +
                ", ('1010', 'RS Mata Dr. Yap', 'Jl. Cik Di Tiro No.5, Terban, Kec. Gondokusuman, Kota Yogyakarta, Daerah Istimewa Yogyakarta 55223', '0274562054')" +
                ", ('1011', 'JIH', 'Jl. Ring Road Utara No.160, Perumnas Condong Catur, Condongcatur, Kec. Depok, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55283', '02744463535')" +
                ", ('1012', 'UAD Hospital', 'Dusun Karangsari, RT.06 / RW.31, Wedomartani, Ngemplak, Gedongan Lor, Wedomartani, Kec. Ngemplak, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55584', '02744477068')" +
                ", ('1013', 'RSU Griya Mahar', 'Jl. Parangtritis, Km. 4, Gg. Wijaya Kusuma No.212, Druwo, Bangunharjo, Kec. Bantul, Daerah Istimewa Yogyakarta 55187', '0274445020')" +
                ", ('1014', 'RS Rajawali Citra', 'Jl. Pleret No.KM 2.5, Banjardadap, Potorono, Kec. Banguntapan, Kabupaten Bantul, Daerah Istimewa Yogyakarta 55196', '085100482003')" +
                ", ('1015', 'RS Dr. Sardjito', 'Jl. Kesehatan Jl. Kesehatan Sendowo No.1, Sendowo, Sinduadi, Kec. Mlati, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55281', '0274631190')" +
                ", ('1016', 'RS Dr. Soetarto', 'Jl. Juadi No.19, Kotabaru, Kec. Gondokusuman, Kota Yogyakarta, Daerah Istimewa Yogyakarta 55224', '02742920000');";
        db.execSQL(sql1);

        db.execSQL(sql2);
        sql2 = "insert into antrianRS(idAntrian, namaRS, namaPasien, noHpPasien, noAntrian) values" +
                "('2001', 'RSUD. Yogyakarta', 'Budi', '081717171717', '1')" +
                ", ('2002', 'RSPAU. Hardjolukito', 'Budi', '081717171717', '1')" +
                ", ('2003', 'RS Bethesda', 'Budi', '081717171717', '1')" +
                ", ('2004', 'RS Bethesda Lempuyangan', 'Budi', '081717171717', '1')" +
                ", ('2005', 'RS Panti Rapih', 'Budi', '081717171717', '1')" +
                ", ('2006', 'RSI Hidayatullah', 'Budi', '081717171717', '1')" +
                ", ('2007', 'RS PKU Muhammadiyah', 'Budi', '081717171717', '1')" +
                ", ('2008', 'RS PKU Gamping', 'Budi', '081717171717', '1')" +
                ", ('2009', 'HappyLand Medical Centre', 'Budi', '081717171717', '1')" +
                ", ('2010', 'RS Mata Dr. Yap', 'Budi', '081717171717', '1')" +
                ", ('2011', 'JIH', 'Budi', '081717171717', '1')" +
                ", ('2012', 'UAD Hospital', 'Budi', '081717171717', '1')" +
                ", ('2013', 'RSU Griya Mahar', 'Budi', '081717171717', '1')" +
                ", ('2014', 'RS Dr. Sardjito', 'Budi', '081717171717', '1')" +
                ", ('2015', 'RS Dr. Soetarto', 'Budi', '081717171717', '1')" +
                ", ('2016', 'RS Rajawali Citra', 'Budi', '081717171717', '1');";
        db.execSQL(sql2);
    }
    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2)
    {
// TODO Auto-generated method stub
    }
}