package com.company;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FullDB {

    public Integer getArkadaşınidsi() {
        return arkadaşınidsi;
    }

    public void setArkadaşınidsi(Integer arkadaşınidsi) {
        this.arkadaşınidsi = arkadaşınidsi;
    }

    public ArrayList<String> getARKADAŞINPOP() {
        return ARKADAŞINPOP;
    }

    public void setARKADAŞINPOP(ArrayList<String> ARKADAŞINPOP) {
        this.ARKADAŞINPOP = ARKADAŞINPOP;
    }

    public ArrayList<String> getARKADAŞINCAZ() {
        return ARKADAŞINCAZ;
    }

    public void setARKADAŞINCAZ(ArrayList<String> ARKADAŞINCAZ) {
        this.ARKADAŞINCAZ = ARKADAŞINCAZ;
    }


    public ArrayList<String> getARKADAŞINKLASIK() {
        return ARKADAŞINKLASIK;
    }

    public void setARKADAŞINKLASIK(ArrayList<String> ARKADAŞINKLASIK) {
        this.ARKADAŞINKLASIK = ARKADAŞINKLASIK;
    }


    private int arkadaşınidsi;

    private ArrayList<String> ARKADAŞINPOP= new ArrayList<String>( );
    private ArrayList<Integer>ARKADAŞINPOPID = new ArrayList<Integer>( );
    private ArrayList<String> ARKADAŞINPOPSANATCI= new ArrayList<String>( );


    private ArrayList<String> ARKADAŞINCAZ= new ArrayList<String>( );
    private ArrayList<Integer>ARKADAŞINCAZID = new ArrayList<Integer>( );
    private ArrayList<String>ARKADAŞINCAZSANATCI = new ArrayList<String>( );


    private ArrayList<String> ARKADAŞINKLASIK= new ArrayList<String>( );
    private ArrayList<Integer>ARKADAŞINKLASIKID = new ArrayList<Integer>( );
    private ArrayList<String> ARKADAŞINKLASIKSANATCI= new ArrayList<String>( );




    static  private String adminşarkıadıekliyor;
    private int kaç_kere_dinlendi;

    public static String getAdminşarkıadıekliyor() {
        return adminşarkıadıekliyor;
    }

    public static void setAdminşarkıadıekliyor(String adminşarkıadıekliyor) {
        FullDB.adminşarkıadıekliyor = adminşarkıadıekliyor;
    }

    public static String getAdmintarihekliyor() {
        return admintarihekliyor;
    }

    public static void setAdmintarihekliyor(String admintarihekliyor) {
        FullDB.admintarihekliyor = admintarihekliyor;
    }

    public static String getAdminsanatçıekliyor() {
        return adminsanatçıekliyor;
    }

    public static void setAdminsanatçıekliyor(String adminsanatçıekliyor) {
        FullDB.adminsanatçıekliyor = adminsanatçıekliyor;
    }

    public static String getAdminalbümekliyor() {
        return adminalbümekliyor;
    }

    public static void setAdminalbümekliyor(String adminalbümekliyor) {
        FullDB.adminalbümekliyor = adminalbümekliyor;
    }

    public static String getAdmintürekliyor() {
        return admintürekliyor;
    }

    public static void setAdmintürekliyor(String admintürekliyor) {
        FullDB.admintürekliyor = admintürekliyor;
    }

    public static String getAdminsüreekliyor() {
        return adminsüreekliyor;
    }

    public static void setAdminsüreekliyor(String adminsüreekliyor) {
        FullDB.adminsüreekliyor = adminsüreekliyor;
    }

    public static boolean isAdminşarkıekleyebasti() {
        return adminşarkıekleyebasti;
    }

    public static void setAdminşarkıekleyebasti(boolean adminşarkıekleyebasti) {
        FullDB.adminşarkıekleyebasti = adminşarkıekleyebasti;
    }

    private ArrayList<String> TÜMTAKİPEDİLEBİLECEKLER= new ArrayList<String>( );
    private ArrayList<Integer> TÜMTAKİPEDİLEBİLECEKLERID= new ArrayList<Integer>( );
    private ArrayList<String> KULLANICININTAKIPETTIKLERI= new ArrayList<String>( );
    private ArrayList<Integer> KULLANICININTAKIPETTIKLERIID= new ArrayList<Integer>( );



    private ArrayList<String> BizimCaz= new ArrayList<String>( );
    private ArrayList<Integer> BizimCazID= new ArrayList<Integer>( );
    private ArrayList<String> BizimCazSanatçı= new ArrayList<String>( );

    public ArrayList<String> getBizimCaz() {
        return BizimCaz;
    }

    public void setBizimCaz(ArrayList<String> bizimCaz) {
        BizimCaz = bizimCaz;
    }

    public ArrayList<Integer> getBizimCazID() {
        return BizimCazID;
    }

    public void setBizimCazID(ArrayList<Integer> bizimCazID) {
        BizimCazID = bizimCazID;
    }

    public ArrayList<String> getBizimCazSanatçı() {
        return BizimCazSanatçı;
    }

    public void setBizimCazSanatçı(ArrayList<String> bizimCazSanatçı) {
        BizimCazSanatçı = bizimCazSanatçı;
    }

    public ArrayList<String> getBizimKlasik() {
        return BizimKlasik;
    }

    public void setBizimKlasik(ArrayList<String> bizimKlasik) {
        BizimKlasik = bizimKlasik;
    }

    public ArrayList<Integer> getBizimKlasikID() {
        return BizimKlasikID;
    }

    public void setBizimKlasikID(ArrayList<Integer> bizimKlasikID) {
        BizimKlasikID = bizimKlasikID;
    }

    public ArrayList<String> getBizimKlasikSanatçı() {
        return BizimKlasikSanatçı;
    }

    public void setBizimKlasikSanatçı(ArrayList<String> bizimKlasikSanatçı) {
        BizimKlasikSanatçı = bizimKlasikSanatçı;
    }

    public ArrayList<String> getBizimPop() {
        return BizimPop;
    }

    public void setBizimPop(ArrayList<String> bizimPop) {
        BizimPop = bizimPop;
    }

    public ArrayList<Integer> getBizimPopID() {
        return BizimPopID;
    }

    public void setBizimPopID(ArrayList<Integer> bizimPopID) {
        BizimPopID = bizimPopID;
    }

    private ArrayList<String> BizimPop= new ArrayList<String>( );
    private ArrayList<Integer> BizimPopID= new ArrayList<Integer>( );
    private ArrayList<String> BizimPopSanatçı= new ArrayList<String>( );

    public ArrayList<String> getBizimPopSanatçı() {
        return BizimPopSanatçı;
    }

    public void setBizimPopSanatçı(ArrayList<String> bizimPopSanatçı) {
        BizimPopSanatçı = bizimPopSanatçı;
    }

    private ArrayList<String> BizimKlasik= new ArrayList<String>( );
    private ArrayList<Integer> BizimKlasikID= new ArrayList<Integer>( );
    private ArrayList<String> BizimKlasikSanatçı= new ArrayList<String>( );




    public ArrayList<String> getTÜMTAKİPEDİLEBİLECEKLER() {
        return TÜMTAKİPEDİLEBİLECEKLER;
    }

    public void setTÜMTAKİPEDİLEBİLECEKLER(ArrayList<String> TÜMTAKİPEDİLEBİLECEKLER) {
        this.TÜMTAKİPEDİLEBİLECEKLER = TÜMTAKİPEDİLEBİLECEKLER;
    }

    public ArrayList<Integer> getTÜMTAKİPEDİLEBİLECEKLERID() {
        return TÜMTAKİPEDİLEBİLECEKLERID;
    }

    public void setTÜMTAKİPEDİLEBİLECEKLERID(ArrayList<Integer> TÜMTAKİPEDİLEBİLECEKLERID) {
        this.TÜMTAKİPEDİLEBİLECEKLERID = TÜMTAKİPEDİLEBİLECEKLERID;
    }

    public ArrayList<String> getKULLANICININTAKIPETTIKLERI() {
        return KULLANICININTAKIPETTIKLERI;
    }

    public void setKULLANICININTAKIPETTIKLERI(ArrayList<String> KULLANICININTAKIPETTIKLERI) {
        this.KULLANICININTAKIPETTIKLERI = KULLANICININTAKIPETTIKLERI;
    }

    public ArrayList<Integer> getKULLANICININTAKIPETTIKLERIID() {
        return KULLANICININTAKIPETTIKLERIID;
    }

    public void setKULLANICININTAKIPETTIKLERIID(ArrayList<Integer> KULLANICININTAKIPETTIKLERIID) {
        this.KULLANICININTAKIPETTIKLERIID = KULLANICININTAKIPETTIKLERIID;
    }

    public ArrayList<Integer> getSEÇİLEN_ŞARKININ_DİNLEME_SAYISI() {
        return SEÇİLEN_ŞARKININ_DİNLEME_SAYISI;
    }

    public void setSEÇİLEN_ŞARKININ_DİNLEME_SAYISI(ArrayList<Integer> SEÇİLEN_ŞARKININ_DİNLEME_SAYISI) {
        this.SEÇİLEN_ŞARKININ_DİNLEME_SAYISI = SEÇİLEN_ŞARKININ_DİNLEME_SAYISI;
    }

    public String getSorgu() {
        return sorgu;
    }

    public void setSorgu(String sorgu) {
        this.sorgu = sorgu;
    }

    static  private String admintarihekliyor;
    static  private String adminsanatçıekliyor;
    static  private String adminalbümekliyor;
    static  private String admintürekliyor;
    static  private String adminsüreekliyor;
    static  boolean adminşarkıekleyebasti=false;
    static  private int toplam_dinleme_sayisi;

    private String güncellenenşarkıadı;

    public String getGüncellenenşarkıadı() {
        return güncellenenşarkıadı;
    }

    public void setGüncellenenşarkıadı(String güncellenenşarkıadı) {
        this.güncellenenşarkıadı = güncellenenşarkıadı;
    }

    public String getGüncellenenşarkınınsanatçısı() {
        return güncellenenşarkınınsanatçısı;
    }

    public void setGüncellenenşarkınınsanatçısı(String güncellenenşarkınınsanatçısı) {
        this.güncellenenşarkınınsanatçısı = güncellenenşarkınınsanatçısı;
    }



    public String getGüncellenenşarkınınülkesi() {
        return güncellenenşarkınınülkesi;
    }

    public String getGüncellenenşarkınınalbümü() {
        return güncellenenşarkınınalbümü;
    }

    public void setGüncellenenşarkınınalbümü(String güncellenenşarkınınalbümü) {
        this.güncellenenşarkınınalbümü = güncellenenşarkınınalbümü;
    }

    public void setGüncellenenşarkınınülkesi(String güncellenenşarkınınülkesi) {
        this.güncellenenşarkınınülkesi = güncellenenşarkınınülkesi;
    }



    private String güncellenenşarkınınsanatçısı;
    private String güncellenenşarkınınalbümü;
    private String güncellenenşarkınınülkesi;

    public String getGüncellenenşarkınıntürü() {
        return güncellenenşarkınıntürü;
    }

    public void setGüncellenenşarkınıntürü(String güncellenenşarkınıntürü) {
        this.güncellenenşarkınıntürü = güncellenenşarkınıntürü;
    }



    private String güncellenenşarkınıntarihi;
    private String güncellenenşarkınıntürü;

    public String getGüncellenenşarkınıntarihi() {
        return güncellenenşarkınıntarihi;
    }

    public void setGüncellenenşarkınıntarihi(String güncellenenşarkınıntarihi) {
        this.güncellenenşarkınıntarihi = güncellenenşarkınıntarihi;
    }

    private String güncellenenşarkınınsüresi;

    public String getGüncellenenşarkınınsüresi() {
        return güncellenenşarkınınsüresi;
    }

    public void setGüncellenenşarkınınsüresi(String güncellenenşarkınınsüresi) {
        this.güncellenenşarkınınsüresi = güncellenenşarkınınsüresi;
    }

    private String result=null;
    private String result2=null;
    private String result3=null;
    private String result4=null;
    private String result5=null;
    private String result6=null;
    private String result7=null;
    private String result8=null;
    private String result9=null;
    static   private String adminkullanıcıadıekliyor;
    static   private String adminkullanıcımailekliyor;
    static    private String adminkullanıcışifreekliyor;
    static   private String adminkullanıcıülkeekliyor;

    public static String getGüncellenecekşarkınındinlenmesayısı() {
        return güncellenecekşarkınındinlenmesayısı;
    }

    public static void setGüncellenecekşarkınındinlenmesayısı(String güncellenecekşarkınındinlenmesayısı) {
        FullDB.güncellenecekşarkınındinlenmesayısı = güncellenecekşarkınındinlenmesayısı;
    }

    static  boolean adminkullanıcıgüncelleyebastı=false;
    static int dinlenen_şarkı;



    public static int getDinlenen_şarkı() {
        return dinlenen_şarkı;
    }

    public static void setDinlenen_şarkı(int dinlenen_şarkı) {
        FullDB.dinlenen_şarkı = dinlenen_şarkı;
    }



    static private String güncellenecekşarkınındinlenmesayısı;
    public static boolean isAdminkullanıcıgüncelleyebastı() {
        return adminkullanıcıgüncelleyebastı;
    }

    public static void setAdminkullanıcıgüncelleyebastı(boolean adminkullanıcıgüncelleyebastı) {
        FullDB.adminkullanıcıgüncelleyebastı = adminkullanıcıgüncelleyebastı;
    }

    public static boolean isAdminekleyebastı() {
        return adminekleyebastı;
    }

    public static void setAdminekleyebastı(boolean adminekleyebastı) {
        FullDB.adminekleyebastı = adminekleyebastı;
    }

    static  private String adminkullanıcıpremiumekliyor;
    static private  boolean adminekleyebastı=false;
    static private  boolean adminesilebastı=false;

    public static boolean isAdminesilebastı() {
        return adminesilebastı;
    }

    public static void setAdminesilebastı(boolean adminesilebastı) {
        FullDB.adminesilebastı = adminesilebastı;
    }

    public String getAdminkullanıcıadıekliyor() {
        return adminkullanıcıadıekliyor;
    }

    public void setAdminkullanıcıadıekliyor(String adminkullanıcıadıekliyor) {
        this.adminkullanıcıadıekliyor = adminkullanıcıadıekliyor;
    }

    public String getAdminkullanıcımailekliyor() {
        return adminkullanıcımailekliyor;
    }

    public void setAdminkullanıcımailekliyor(String adminkullanıcımailekliyor) {
        this.adminkullanıcımailekliyor = adminkullanıcımailekliyor;
    }

    public String getAdminkullanıcışifreekliyor() {
        return adminkullanıcışifreekliyor;
    }

    public void setAdminkullanıcışifreekliyor(String adminkullanıcışifreekliyor) {
        this.adminkullanıcışifreekliyor = adminkullanıcışifreekliyor;
    }

    public String getAdminkullanıcıülkeekliyor() {
        return adminkullanıcıülkeekliyor;
    }

    public void setAdminkullanıcıülkeekliyor(String adminkullanıcıülkeekliyor) {
        this.adminkullanıcıülkeekliyor = adminkullanıcıülkeekliyor;
    }

    public boolean isAdminşarkısilebastı() {
        return adminşarkısilebastı;
    }

    public void setAdminşarkısilebastı(boolean adminşarkısilebastı) {
        this.adminşarkısilebastı = adminşarkısilebastı;
    }

    private boolean adminşarkısilebastı=false;
    public static String getAdminkullanıcıpremiumekliyor() {
        return adminkullanıcıpremiumekliyor;
    }

    public static void setAdminkullanıcıpremiumekliyor(String adminkullanıcıpremiumekliyor) {
        FullDB.adminkullanıcıpremiumekliyor = adminkullanıcıpremiumekliyor;
    }

    public String getResult10() {
        return result10;
    }

    public void setResult10(String result10) {
        this.result10 = result10;
    }

    private String result10=null;

    private String result11=null;
    private String result12=null;
    private String result13=null;

    public Integer getGüncellencekkullanıcıid() {
        return güncellencekkullanıcıid;
    }

    public void setGüncellencekkullanıcıid(Integer güncellencekkullanıcıid) {
        this.güncellencekkullanıcıid = güncellencekkullanıcıid;
    }

    private String result14=null;
    private String result15=null;
    static private  Integer güncellencekkullanıcıid;
    public Integer getHangiidlikullanıcısilinecek() {
        return hangiidlikullanıcısilinecek;
    }

    public void setHangiidlikullanıcısilinecek(Integer hangiidlikullanıcısilinecek) {
        this.hangiidlikullanıcısilinecek = hangiidlikullanıcısilinecek;
    }

    static private Integer  hangiidlikullanıcısilinecek;
    static    private ArrayList<String> tümkullanıcılarınkullanıcıadı= new ArrayList<String>( );
    static private ArrayList<Integer> tümkullanıcılarınID= new ArrayList<Integer>( );


    private ArrayList<String> ADAMINLISTEPOPSANATÇI= new ArrayList<String>( );
    private ArrayList<String> ADAMINLISTEPOP= new ArrayList<String>( );

    private ArrayList<String> ADAMINLISTECAZSANATÇI= new ArrayList<String>( );
    private ArrayList<String> ADAMINLISTECAZ= new ArrayList<String>( );
    private ArrayList<String> ADAMINLISTEKLASIKSANATÇI= new ArrayList<String>( );
    private ArrayList<String> ADAMINLISTEKLASIK= new ArrayList<String>( );
    private ArrayList<Integer>SEÇİLEN_ŞARKININ_DİNLEME_SAYISI=new ArrayList<>();

    public ArrayList<Integer> getSeçilenŞarkininDinlemeSayisi() {
        return SEÇİLEN_ŞARKININ_DİNLEME_SAYISI;
    }

    public  void setSeçilenŞarkininDinlemeSayisi(ArrayList<Integer> seçilenŞarkininDinlemeSayisi) {
        this.SEÇİLEN_ŞARKININ_DİNLEME_SAYISI = seçilenŞarkininDinlemeSayisi;
    }

    private Integer adminhangiidlişarkıyısilecek;



    public Integer getAdminhangiidlişarkıyısilecek() {
        return adminhangiidlişarkıyısilecek;
    }

    public void setAdminhangiidlişarkıyısilecek(Integer adminhangiidlişarkıyısilecek) {
        this.adminhangiidlişarkıyısilecek = adminhangiidlişarkıyısilecek;
    }

    private ArrayList<String> TümKlasikler= new ArrayList<String>( );
    private ArrayList<String> TümCazlar= new ArrayList<String>( );
    private ArrayList<String> TümPoplar= new ArrayList<String>( );


    private ArrayList<String> TümKlasiklerSanatçı= new ArrayList<String>( );
    private ArrayList<String> TümCazlarSanatçı= new ArrayList<String>( );
    private ArrayList<String> TümPoplarSanatçı= new ArrayList<String>( );


    private ArrayList<Integer> TümKlasiklerID= new ArrayList<Integer>( );
    private ArrayList<Integer> TümCazlarID= new ArrayList<Integer>( );
    private ArrayList<Integer> TümPoplarID= new ArrayList<Integer>( );

    static private ArrayList<String> TUMSARKILAR = new ArrayList<String>( );
    static private ArrayList<String> TUMSANATCILAR= new ArrayList<String>( );
    static  private ArrayList<Integer> TUMŞARKIIDLER= new ArrayList<Integer>( );
    static private ArrayList<String> TUMSANATCILARULKE= new ArrayList<String>( );

    static  private ArrayList<Integer> TUMSANATCIIDLER= new ArrayList<Integer>( );
    static  public ArrayList<String> getTUMSARKILAR() {
        return TUMSARKILAR;
    }

    public void setTUMSARKILAR(ArrayList<String> TUMSARKILAR) {
        this.TUMSARKILAR = TUMSARKILAR;
    }

    public ArrayList<String> getTUMSANATCILAR() {
        return TUMSANATCILAR;
    }

    public static ArrayList<Integer> getTUMŞARKIIDLER() {
        return TUMŞARKIIDLER;
    }

    public static void setTUMŞARKIIDLER(ArrayList<Integer> TUMŞARKIIDLER) {
        FullDB.TUMŞARKIIDLER = TUMŞARKIIDLER;
    }

    public void setTUMSANATCILAR(ArrayList<String> TUMSANATCILAR) {
        this.TUMSANATCILAR = TUMSANATCILAR;
    }

    public ArrayList<Integer> getSanatcıtablosuıd() {
        return sanatcıtablosuıd;
    }

    public void setSanatcıtablosuıd(ArrayList<Integer> sanatcıtablosuıd) {
        this.sanatcıtablosuıd = sanatcıtablosuıd;
    }

    public ArrayList<String> getSanatçıtablosu() {
        return sanatçıtablosu;
    }

    public void setSanatçıtablosu(ArrayList<String> sanatçıtablosu) {
        this.sanatçıtablosu = sanatçıtablosu;
    }

    private ArrayList<Integer> sanatcıtablosuıd = new ArrayList<Integer>( );
    private ArrayList<String> sanatçıtablosu = new ArrayList<String>( );

    private String ulke_bilgisi=null;
    private ArrayList<String> ulkeye_gore_top_10_liste = new ArrayList<String>( );
    private ArrayList<String> genel_top_10 = new ArrayList<String>( );
    private ArrayList<String> pop = new ArrayList<String>( );
    private ArrayList<String> pop_şarkıcı = new ArrayList<String>( );
    private ArrayList<String> caz = new ArrayList<String>( );
    private ArrayList<String> caz_şarkıcı = new ArrayList<String>( );
    private ArrayList<String> Kullanıcı_Bilgisi= new ArrayList<String>( );
    private ArrayList<String> klasik = new ArrayList<String>( );
    private ArrayList<String> klasik_şarkıcı= new ArrayList<String>( );
    private ArrayList<String> top_10_şarkıcıları= new ArrayList<String>( );
    private ArrayList<String> yerel_top_10_şarkıcıları= new ArrayList<String>( );
    private ArrayList<String> ADMINSANATCILISTE= new ArrayList<String>( );
    private ArrayList<String> ADMINSANATCILISTEULKE= new ArrayList<String>( );
    private ArrayList<String> ADMINSANATCILISTEID= new ArrayList<String>( );

    public ArrayList<String> getADMINSANATCILISTEID() {
        return ADMINSANATCILISTEID;
    }

    public void setADMINSANATCILISTEID(ArrayList<String> ADMINSANATCILISTEID) {
        this.ADMINSANATCILISTEID = ADMINSANATCILISTEID;
    }

    public ArrayList<String> getADMINSANATCILISTE() {
        return ADMINSANATCILISTE;
    }

    public void setADMINSANATCILISTE(ArrayList<String> ADMINSANATCILISTE) {
        this.ADMINSANATCILISTE = ADMINSANATCILISTE;
    }

    public ArrayList<String> getADMINSANATCILISTEULKE() {
        return ADMINSANATCILISTEULKE;
    }

    public void setADMINSANATCILISTEULKE(ArrayList<String> ADMINSANATCILISTEULKE) {
        this.ADMINSANATCILISTEULKE = ADMINSANATCILISTEULKE;
    }

    public String getResult7() {
        return result7;
    }

    public static int getToplam_dinleme_sayisi() {
        return toplam_dinleme_sayisi;
    }

    public static void setToplam_dinleme_sayisi(int toplam_dinleme_sayisi) {
        FullDB.toplam_dinleme_sayisi = toplam_dinleme_sayisi;
    }



    public void setResult7(String result7) {
        this.result7 = result7;
    }

    public String getResult8() {
        return result8;
    }

    public void setResult8(String result8) {
        this.result8 = result8;
    }

    public String getResult9() {
        return result9;
    }

    public void setResult9(String result9) {
        this.result9 = result9;
    }

    public ArrayList<String> getPop() {
        return pop;
    }

    public void setPop(ArrayList<String> pop) {
        this.pop = pop;
    }

    public ArrayList<String> getCaz() {
        return caz;
    }

    public void setCaz(ArrayList<String> caz) {
        this.caz = caz;
    }

    public ArrayList<String> getKlasik() {
        return klasik;
    }

    public void setKlasik(ArrayList<String> klasik) {
        this.klasik = klasik;
    }

    public boolean isAdminsanatçıekleyebastı() {
        return adminsanatçıekleyebastı;
    }

    public void setAdminsanatçıekleyebastı(boolean adminsanatçıekleyebastı) {
        this.adminsanatçıekleyebastı = adminsanatçıekleyebastı;
    }

    static  boolean adminsanatçıekleyebastı=false;
    static String eklenileceksanatçı;

    public static String getEklenileceksanatçı() {
        return eklenileceksanatçı;
    }

    public static void setEklenileceksanatçı(String eklenileceksanatçı) {
        FullDB.eklenileceksanatçı = eklenileceksanatçı;
    }

    public static String getEklenileceksanatçıyaülke() {
        return eklenileceksanatçıyaülke;
    }

    public static void setEklenileceksanatçıyaülke(String eklenileceksanatçıyaülke) {
        FullDB.eklenileceksanatçıyaülke = eklenileceksanatçıyaülke;
    }

    static String eklenileceksanatçıyaülke;

    public String getResult5() {
        return result5;
    }

    public String getResult6() {
        return result6;
    }

    public void setResult6(String result6) {
        this.result6 = result6;
    }

    public ArrayList<String> getGenel_top_10() {
        return genel_top_10;
    }

    public void setGenel_top_10(ArrayList<String> genel_top_10) {
        this.genel_top_10 = genel_top_10;
    }

    public void setResult5(String result5) {
        this.result5 = result5;
    }

    public ArrayList<String> getUlkeye_gore_top_10_liste() {
        return ulkeye_gore_top_10_liste;
    }

    public void setUlkeye_gore_top_10_liste(ArrayList<String> ulkeye_gore_top_10_liste) {
        this.ulkeye_gore_top_10_liste = ulkeye_gore_top_10_liste;
    }

    public String getUlke_bilgisi() {
        return ulke_bilgisi;
    }

    public void setUlke_bilgisi(String ulke_bilgisi) {
        this.ulke_bilgisi = ulke_bilgisi;
    }

    String a="Kullanıcı_Adı";


    public String getResult11() {
        return result11;
    }

    public void setResult11(String result11) {
        this.result11 = result11;
    }

    public String getResult12() {
        return result12;
    }

    public void setResult12(String result12) {
        this.result12 = result12;
    }

    public String getResult13() {
        return result13;
    }

    public void setResult13(String result13) {
        this.result13 = result13;
    }

    public ArrayList<String> getPop_şarkıcı() {
        return pop_şarkıcı;
    }

    public void setPop_şarkıcı(ArrayList<String> pop_şarkıcı) {
        this.pop_şarkıcı = pop_şarkıcı;
    }

    public ArrayList<String> getCaz_şarkıcı() {
        return caz_şarkıcı;
    }

    public void setCaz_şarkıcı(ArrayList<String> caz_şarkıcı) {
        this.caz_şarkıcı = caz_şarkıcı;
    }

    public ArrayList<String> getKlasik_şarkıcı() {
        return klasik_şarkıcı;
    }

    public void setKlasik_şarkıcı(ArrayList<String> klasik_şarkıcı) {
        this.klasik_şarkıcı = klasik_şarkıcı;
    }

    public String getResult14() {
        return result14;
    }
    public void setResult14(String result14) {
        this.result14 = result14;
    }

    public String getResult15() {
        return result15;
    }

    public void setResult15(String result15) {
        this.result15 = result15;
    }

    public ArrayList<String> getKullanıcı_Bilgisi() {
        return Kullanıcı_Bilgisi;
    }

    public void setKullanıcı_Bilgisi(ArrayList<String> kullanıcı_Bilgisi) {
        Kullanıcı_Bilgisi = kullanıcı_Bilgisi;
    }

    public ArrayList<String> getTop_10_şarkıcıları() {
        return top_10_şarkıcıları;
    }

    public void setTop_10_şarkıcıları(ArrayList<String> top_10_şarkıcıları) {
        this.top_10_şarkıcıları = top_10_şarkıcıları;
    }



    public ArrayList<String> getYerel_top_10_şarkıcıları() {
        return yerel_top_10_şarkıcıları;
    }

    public void setYerel_top_10_şarkıcıları(ArrayList<String> yerel_top_10_şarkıcıları) {
        this.yerel_top_10_şarkıcıları = yerel_top_10_şarkıcıları;
    }

    public ArrayList<String> getADAMINLISTEPOPSANATÇI() {
        return ADAMINLISTEPOPSANATÇI;
    }

    public void setADAMINLISTEPOPSANATÇI(ArrayList<String> ADAMINLISTEPOPSANATÇI) {
        this.ADAMINLISTEPOPSANATÇI = ADAMINLISTEPOPSANATÇI;
    }
    static boolean adminşarkıgüncelleyebastı=false;
    public ArrayList<String> getADAMINLISTEPOP() {
        return ADAMINLISTEPOP;
    }

    public void setADAMINLISTEPOP(ArrayList<String> ADAMINLISTEPOP) {
        this.ADAMINLISTEPOP = ADAMINLISTEPOP;
    }

    public static boolean isAdminşarkıgüncelleyebastı() {
        return adminşarkıgüncelleyebastı;
    }

    public static void setAdminşarkıgüncelleyebastı(boolean adminşarkıgüncelleyebastı) {
        FullDB.adminşarkıgüncelleyebastı = adminşarkıgüncelleyebastı;
    }

    public ArrayList<String> getADAMINLISTECAZSANATÇI() {
        return ADAMINLISTECAZSANATÇI;
    }

    public void setADAMINLISTECAZSANATÇI(ArrayList<String> ADAMINLISTECAZSANATÇI) {
        this.ADAMINLISTECAZSANATÇI = ADAMINLISTECAZSANATÇI;
    }

    public ArrayList<String> getADAMINLISTECAZ() {
        return ADAMINLISTECAZ;
    }

    public void setADAMINLISTECAZ(ArrayList<String> ADAMINLISTECAZ) {
        this.ADAMINLISTECAZ = ADAMINLISTECAZ;
    }

    public ArrayList<String> getADAMINLISTEKLASIKSANATÇI() {
        return ADAMINLISTEKLASIKSANATÇI;
    }

    public void setADAMINLISTEKLASIKSANATÇI(ArrayList<String> ADAMINLISTEKLASIKSANATÇI) {
        this.ADAMINLISTEKLASIKSANATÇI = ADAMINLISTEKLASIKSANATÇI;
    }

    public ArrayList<String> getADAMINLISTEKLASIK() {
        return ADAMINLISTEKLASIK;
    }

    public void setADAMINLISTEKLASIK(ArrayList<String> ADAMINLISTEKLASIK) {
        this.ADAMINLISTEKLASIK = ADAMINLISTEKLASIK;
    }

    public ArrayList<String> getTümKlasikler() {
        return TümKlasikler;
    }

    public void setTümKlasikler(ArrayList<String> tümKlasikler) {
        TümKlasikler = tümKlasikler;
    }

    public ArrayList<String> getTümCazlar() {
        return TümCazlar;
    }

    public void setTümCazlar(ArrayList<String> tümCazlar) {
        TümCazlar = tümCazlar;
    }

    public ArrayList<String> getTümPoplar() {
        return TümPoplar;
    }

    public void setTümPoplar(ArrayList<String> tümPoplar) {
        TümPoplar = tümPoplar;
    }

    public ArrayList<String> getTümKlasiklerSanatçı() {
        return TümKlasiklerSanatçı;
    }

    public void setTümKlasiklerSanatçı(ArrayList<String> tümKlasiklerSanatçı) {
        TümKlasiklerSanatçı = tümKlasiklerSanatçı;
    }

    public ArrayList<String> getTümCazlarSanatçı() {
        return TümCazlarSanatçı;
    }

    public void setTümCazlarSanatçı(ArrayList<String> tümCazlarSanatçı) {
        TümCazlarSanatçı = tümCazlarSanatçı;
    }

    public ArrayList<String> getTümPoplarSanatçı() {
        return TümPoplarSanatçı;
    }

    public void setTümPoplarSanatçı(ArrayList<String> tümPoplarSanatçı) {
        TümPoplarSanatçı = tümPoplarSanatçı;
    }

    public ArrayList<Integer> getTümKlasiklerID() {
        return TümKlasiklerID;
    }

    public void setTümKlasiklerID(ArrayList<Integer> tümKlasiklerID) {
        TümKlasiklerID = tümKlasiklerID;
    }

    public ArrayList<Integer> getTümCazlarID() {
        return TümCazlarID;
    }

    public void setTümCazlarID(ArrayList<Integer> tümCazlarID) {
        TümCazlarID = tümCazlarID;
    }

    public ArrayList<Integer> getTümPoplarID() {
        return TümPoplarID;
    }

    public void setTümPoplarID(ArrayList<Integer> tümPoplarID) {
        TümPoplarID = tümPoplarID;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public ArrayList<Integer> getC() {
        return c;
    }

    public void setC(ArrayList<Integer> c) {
        this.c = c;
    }

    private String kopyaşifre;

    public String getKopyaşifre() {
        return kopyaşifre;
    }

    public void setKopyaşifre(String kopyaşifre) {
        this.kopyaşifre = kopyaşifre;
    }
    ArrayList <Integer> c=new ArrayList<>();
    private Integer admamınidX=0;
    //Create a method to connect to database
    static   private String seçilenşarkınıntürü;
static boolean kullanıcıtakiptençıkmakistiyor=false;

    public static boolean isKullanıcıtakiptençıkmakistiyor() {
        return kullanıcıtakiptençıkmakistiyor;
    }

    public static void setKullanıcıtakiptençıkmakistiyor(boolean kullanıcıtakiptençıkmakistiyor) {
        FullDB.kullanıcıtakiptençıkmakistiyor = kullanıcıtakiptençıkmakistiyor;
    }

    public static boolean isKullanıcıtakipetmekistiyor() {
        return kullanıcıtakipetmekistiyor;
    }

    public static void setKullanıcıtakipetmekistiyor(boolean kullanıcıtakipetmekistiyor) {
        FullDB.kullanıcıtakipetmekistiyor = kullanıcıtakipetmekistiyor;
    }

    static boolean kullanıcıtakipetmekistiyor=false;
    public Integer getAdmamınidX() {
        return admamınidX;
    }

    public void setAdmamınidX(Integer admamınidX) {
        this.admamınidX = admamınidX;
    }

    public String getSeçilenşarkınıntürü() {
        return seçilenşarkınıntürü;
    }

    public void setSeçilenşarkınıntürü(String seçilenşarkınıntürü) {
        this.seçilenşarkınıntürü = seçilenşarkınıntürü;
    }

    static private  String güncellenecekkullanıcıadı;
    static private  String güncellenecekkulanıcışifre;
    static  private  String güncellenecekkulanıcıülke;
    static  private  String güncellenecekkulanıcıdurum;
    static  private  String güncellenecekkulanıcımail;



    public static String getGüncellenecekkullanıcıadı() {
        return güncellenecekkullanıcıadı;
    }

    public static void setGüncellenecekkullanıcıadı(String güncellenecekkullanıcıadı) {
        FullDB.güncellenecekkullanıcıadı = güncellenecekkullanıcıadı;
    }

    public static String getGüncellenecekkulanıcışifre() {
        return güncellenecekkulanıcışifre;
    }

    public static void setGüncellenecekkulanıcışifre(String güncellenecekkulanıcışifre) {
        FullDB.güncellenecekkulanıcışifre = güncellenecekkulanıcışifre;
    }

    public static String getGüncellenecekkulanıcıülke() {
        return güncellenecekkulanıcıülke;
    }

    public static void setGüncellenecekkulanıcıülke(String güncellenecekkulanıcıülke) {
        FullDB.güncellenecekkulanıcıülke = güncellenecekkulanıcıülke;
    }

    public static String getGüncellenecekkulanıcıdurum() {
        return güncellenecekkulanıcıdurum;
    }

    public static void setGüncellenecekkulanıcıdurum(String güncellenecekkulanıcıdurum) {
        FullDB.güncellenecekkulanıcıdurum = güncellenecekkulanıcıdurum;
    }

    public static String getGüncellenecekkulanıcımail() {
        return güncellenecekkulanıcımail;
    }

    public static void setGüncellenecekkulanıcımail(String güncellenecekkulanıcımail) {
        FullDB.güncellenecekkulanıcımail = güncellenecekkulanıcımail;
    }
private Integer takipideğişecekkullanıcııd;

    public Integer getTakipideğişecekkullanıcııd() {
        return takipideğişecekkullanıcııd;
    }

    public void setTakipideğişecekkullanıcııd(Integer takipideğişecekkullanıcııd) {
        this.takipideğişecekkullanıcııd = takipideğişecekkullanıcııd;
    }

    public static ArrayList<String> getTUMSANATCILARULKE() {
        return TUMSANATCILARULKE;
    }

    public static void setTUMSANATCILARULKE(ArrayList<String> TUMSANATCILARULKE) {
        FullDB.TUMSANATCILARULKE = TUMSANATCILARULKE;
    }

    public static ArrayList<Integer> getTUMSANATCIIDLER() {
        return TUMSANATCIIDLER;
    }

    public static void setTUMSANATCIIDLER(ArrayList<Integer> TUMSANATCIIDLER) {
        FullDB.TUMSANATCIIDLER = TUMSANATCIIDLER;
    }



    String sorgu="Update sarki set dinlenme_sayisi=dinlenme_sayisi+1 where idSarki= ?";


    public void setArkadaşınidsi(int arkadaşınidsi) {
        this.arkadaşınidsi = arkadaşınidsi;
    }

    public ArrayList<Integer> getARKADAŞINPOPID() {
        return ARKADAŞINPOPID;
    }

    public void setARKADAŞINPOPID(ArrayList<Integer> ARKADAŞINPOPID) {
        this.ARKADAŞINPOPID = ARKADAŞINPOPID;
    }

    public ArrayList<String> getARKADAŞINPOPSANATCI() {
        return ARKADAŞINPOPSANATCI;
    }

    public void setARKADAŞINPOPSANATCI(ArrayList<String> ARKADAŞINPOPSANATCI) {
        this.ARKADAŞINPOPSANATCI = ARKADAŞINPOPSANATCI;
    }

    public ArrayList<Integer> getARKADAŞINCAZID() {
        return ARKADAŞINCAZID;
    }

    public void setARKADAŞINCAZID(ArrayList<Integer> ARKADAŞINCAZID) {
        this.ARKADAŞINCAZID = ARKADAŞINCAZID;
    }

    public ArrayList<String> getARKADAŞINCAZSANATCI() {
        return ARKADAŞINCAZSANATCI;
    }

    public void setARKADAŞINCAZSANATCI(ArrayList<String> ARKADAŞINCAZSANATCI) {
        this.ARKADAŞINCAZSANATCI = ARKADAŞINCAZSANATCI;
    }

    public boolean isBizçıkarmayapıcaz() {
        return bizçıkarmayapıcaz;
    }

    public void setBizçıkarmayapıcaz(boolean bizçıkarmayapıcaz) {
        this.bizçıkarmayapıcaz = bizçıkarmayapıcaz;
    }

    public boolean isBizeklemeyapıcaz() {
        return bizeklemeyapıcaz;
    }

    public void setBizeklemeyapıcaz(boolean bizeklemeyapıcaz) {
        this.bizeklemeyapıcaz = bizeklemeyapıcaz;
    }

    private boolean bizeklemeyapıcaz=false;
    private  boolean bizçıkarmayapıcaz=false;

    public ArrayList<Integer> getARKADAŞINKLASIKID() {
        return ARKADAŞINKLASIKID;
    }

    public void setARKADAŞINKLASIKID(ArrayList<Integer> ARKADAŞINKLASIKID) {
        this.ARKADAŞINKLASIKID = ARKADAŞINKLASIKID;
    }

    public int getAbc() {
        return abc;
    }

    public void setAbc(int abc) {
        this.abc = abc;
    }

    private int abc=-1;
    public ArrayList<String> getARKADAŞINKLASIKSANATCI() {
        return ARKADAŞINKLASIKSANATCI;
    }

    public void setARKADAŞINKLASIKSANATCI(ArrayList<String> ARKADAŞINKLASIKSANATCI) {
        this.ARKADAŞINKLASIKSANATCI = ARKADAŞINKLASIKSANATCI;
    }

    void createConnection(){
        try {
            //Connect to Database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/şarkı", "root", "Gogol1221.");

         Statement query1221=connect.createStatement();
         ResultSet xxxx=query1221.executeQuery("Select * from kullanıcı where abonelik_türü='Premium'  AND durum='Kullanıcı'   ");
            while(xxxx.next()){
int x=xxxx.getInt("ID");
                if (!TÜMTAKİPEDİLEBİLECEKLERID.contains(x)){
                    TÜMTAKİPEDİLEBİLECEKLERID.add(x);
                    TÜMTAKİPEDİLEBİLECEKLER.add(xxxx.getString("Kullanıcı_Adı"));
                }
            }
            /*

    private ArrayList<String> TÜMTAKİPEDİLEBİLECEKLER= new ArrayList<String>( );
    private ArrayList<Integer> TÜMTAKİPEDİLEBİLECEKLERID= new ArrayList<Integer>( );
    private ArrayList<String> KULLANICININTAKIPETTIKLERI= new ArrayList<String>( );
    private ArrayList<Integer> KULLANICININTAKIPETTIKLERIID= new ArrayList<Integer>( );

             */










            if (isAdminekleyebastı()==true) {
                Statement query = connect.createStatement();
                query.executeUpdate("INSERT INTO Kullanıcı(Kullanıcı_Adı,email,şifre,abonelik_türü,ülke,durum) VALUES('" + getAdminkullanıcıadıekliyor() + "','" + adminkullanıcımailekliyor + "','" + adminkullanıcışifreekliyor + "','" + adminkullanıcıpremiumekliyor + "','" + adminkullanıcımailekliyor + "','Kullanıcı')");            //Execute a select all statement            ResultSet rs = query.executeQuery("SELECT DISTINCT Albüm FROM şarkılar WHERE Sanatçı='Göksel Kınalı' ");
            }
            if (isAdminesilebastı()==true){
                Statement query222 = connect.createStatement();
                query222.executeUpdate("Delete from kullanıcı where ID='"+hangiidlikullanıcısilinecek +"'");            //Execute a select all statement            ResultSet rs = query.executeQuery("SELECT DISTINCT Albüm FROM şarkılar WHERE Sanatçı='Göksel Kınalı' ");


            }


            if (isAdminkullanıcıgüncelleyebastı()==true){
                Statement kullanıcıgüncelleme=connect.createStatement();
                //  kullanıcıgüncelleme.executeUpdate("UPDATE kullanıcı SET Kullanıcı_Adı='"+getGüncellenecekkullanıcıadı()+"' ,email='"+getGüncellenecekkulanıcımail()+"' , şifre='"+getGüncellenecekkulanıcışifre()+"'  , abonelik_türü='"+getGüncellenecekkulanıcıdurum()+"'  , ülke='"+getGüncellenecekkulanıcıülke()+"'   ,durum='Kullanıcı' WHERE ID='"+getGüncellencekkullanıcıid()+'"');
                kullanıcıgüncelleme.executeUpdate(" UPDATE `şarkı`.`kullanıcı` SET `Kullanıcı_Adı` = '"+getGüncellenecekkullanıcıadı()+"', `email` = '"+getGüncellenecekkulanıcımail()+"', `şifre` = '"+getGüncellenecekkulanıcışifre()+"', `abonelik_türü` = '"+getGüncellenecekkulanıcıdurum()+"', `ülke` = '"+getGüncellenecekkulanıcıülke()+"' WHERE (`ID` = '"+getGüncellencekkullanıcıid()+"')");

                int değişenindex=getTümkullanıcılarınID().indexOf(getGüncellencekkullanıcıid());
                getTümkullanıcılarınkullanıcıadı().set(değişenindex,getGüncellenecekkullanıcıadı());

            }
            if (isAdminşarkısilebastı()==true){

                Statement adminşarkısilmedurumu=connect.createStatement();
                adminşarkısilmedurumu.executeUpdate(" DELETE from şarkılar  WHERE  ID='"+getAdminhangiidlişarkıyısilecek()+"'");

            }
            Statement query26 = connect.createStatement();







            Statement seçilenidlişarkıbilgileri=connect.createStatement();
            ResultSet şarkıtümbilgi =seçilenidlişarkıbilgileri.executeQuery("Select * from şarkılar Where ID='"+adminhangiidlişarkıyısilecek+"' ");



            if(isAdminşarkıekleyebasti()==true){
                Statement query = connect.createStatement();
                query.executeUpdate("INSERT INTO `şarkı`.`şarkılar` (`Şarkı`, `Tarih`, `Sanatçı`, `Albüm`, `Tür`, `Süre`, `Dinleme_Sayısı`) VALUES ('"+getAdminşarkıadıekliyor()+"','"+getAdmintarihekliyor()+"','"+getAdminsanatçıekliyor()+"','"+getAdminalbümekliyor()+"','"+getAdmintürekliyor()+"','"+getAdminsüreekliyor()+"','"+0+"')");

            }







            if (isAdminşarkıgüncelleyebastı()==true){
                Statement qweqwe=connect.createStatement();


                qweqwe.executeUpdate("     UPDATE `şarkı`.`şarkılar` SET `Şarkı` = '"+getGüncellenenşarkıadı()+"', `Tarih` = '"+getGüncellenenşarkınıntarihi()+"', `Sanatçı` = '"+getGüncellenenşarkınınsanatçısı()+"', `Albüm` = '"+getGüncellenenşarkınınalbümü()+"', `Tür` = '"+getGüncellenenşarkınıntürü()+"', `Süre` = '"+getGüncellenenşarkınınsüresi()+"', `Dinleme_Sayısı` = '"+getGüncellenecekşarkınındinlenmesayısı()+"' WHERE (`ID` = '"+adminhangiidlişarkıyısilecek+"');");


            }


            if (adminsanatçıekleyebastı==true)
            {
                Statement sanatçıekleme=connect.createStatement();
                sanatçıekleme.executeUpdate("INSERT INTO sanatçı(Sanatçı_Adı,Ülke) VALUES('"+getEklenileceksanatçı()+"','"+eklenileceksanatçıyaülke+"')");

            }



            while(şarkıtümbilgi.next()) {
                setGüncellenenşarkıadı(şarkıtümbilgi.getString("Şarkı"));
                setGüncellenenşarkınınalbümü(şarkıtümbilgi.getString("Albüm"));
                setGüncellenenşarkınıntarihi(şarkıtümbilgi.getString("Tarih"));
                setGüncellenenşarkınıntürü(şarkıtümbilgi.getString("Tür"));
                setGüncellenenşarkınınsanatçısı(şarkıtümbilgi.getString("Sanatçı"));
                setGüncellenecekşarkınındinlenmesayısı(şarkıtümbilgi.getString("Dinleme_Sayısı"));
                setGüncellenenşarkınınsüresi(şarkıtümbilgi.getString("Süre"));

            }








            Statement query222222 = connect.createStatement();

            ResultSet memati2=   query222222.executeQuery("Select * from sanatçı ");
            while (memati2.next()){
                int x= memati2.getInt("ID");
                if (!sanatcıtablosuıd.contains(x))
                {
                    sanatcıtablosuıd.add(x);
                    sanatçıtablosu.add(memati2.getString("Sanatçı_Adı"));
                }
            }



            Statement query22222 = connect.createStatement();

            ResultSet memati=   query22222.executeQuery("Select * from şarkılar ");            //Execute a select all statement            ResultSet rs = query.executeQuery("SELECT DISTINCT Albüm FROM şarkılar WHERE Sanatçı='Göksel Kınalı' ");

            while (memati.next()){

                int x=    memati.getInt("ID");
                if (!TUMŞARKIIDLER.contains(x)) {
                    TUMSARKILAR.add(memati.getString("Şarkı"));
                    TUMSANATCILAR.add (  memati.getString("Sanatçı"));
                    TUMŞARKIIDLER.add(x);
                }
            }
            if(dinlenen_şarkı>-1){
                ResultSet rs17;
                TUMŞARKIIDLER.indexOf(dinlenen_şarkı);
                String sorgu="Update şarkılar set Dinleme_Sayısı=Dinleme_Sayısı+1 where ID= '"+TUMŞARKIIDLER.get(dinlenen_şarkı)+"'";
                query26.executeUpdate(sorgu);
                dinlenen_şarkı=-1;
            }


            Statement query2222 = connect.createStatement();
            ResultSet güncelenenkullanıcı=   query2222.executeQuery("Select * from kullanıcı where ID='"+güncellencekkullanıcıid +"'");            //Execute a select all statement            ResultSet rs = query.executeQuery("SELECT DISTINCT Albüm FROM şarkılar WHERE Sanatçı='Göksel Kınalı' ");
            while(güncelenenkullanıcı.next()){
                güncellenecekkullanıcıadı=güncelenenkullanıcı.getString("Kullanıcı_Adı");
                güncellenecekkulanıcıdurum=güncelenenkullanıcı.getString("abonelik_türü");
                güncellenecekkulanıcıülke=güncelenenkullanıcı.getString("ülke");
                güncellenecekkulanıcımail=güncelenenkullanıcı.getString("email");
                güncellenecekkulanıcışifre=güncelenenkullanıcı.getString("şifre");




            }

























            Statement query2333 = connect.createStatement();

            ResultSet tümkullanıcılistesi=query2333.executeQuery("Select DISTINCT Kullanıcı_Adı,ID FROM kullanıcı");


            while (tümkullanıcılistesi.next()) {

                int   xxx = tümkullanıcılistesi.getInt("ID");

                if (!tümkullanıcılarınID.contains(xxx)){
                    tümkullanıcılarınID.add(xxx);
                    String xx = tümkullanıcılistesi.getString("Kullanıcı_Adı");
                    tümkullanıcılarınkullanıcıadı.add(xx);}

            }


//BURASINDAIZ AADAMIN ID BULUNDU
       Statement   R55=connect.createStatement();
            ResultSet r55=R55.executeQuery("SELECT DISTINCT ID FROM kullanıcı WHERE     Kullanıcı_Adı='"+getResult2()+"' AND Şifre='"+getKopyaşifre()+"'  ");            //Execute a select all statement            ResultSet rs = query.executeQuery("SELECT DISTINCT Albüm FROM şarkılar WHERE Sanatçı='Göksel Kınalı' ");
            while (r55.next()) {
                int xx = r55.getInt("ID");

                admamınidX=xx;
            }


            Statement adamıntakipettikleri=connect.createStatement();
            ResultSet adamıntakipettikleriz=adamıntakipettikleri.executeQuery("Select takipedilen from takip where takipçi =' "+admamınidX + "'");

while (adamıntakipettikleriz.next()){
    int x=adamıntakipettikleriz.getInt("takipedilen");
    if (!KULLANICININTAKIPETTIKLERIID.contains(x))
    {
        KULLANICININTAKIPETTIKLERIID.add(x);
    }
}
/*

    private ArrayList<String> TÜMTAKİPEDİLEBİLECEKLER= new ArrayList<String>( );
    private ArrayList<Integer> TÜMTAKİPEDİLEBİLECEKLERID= new ArrayList<Integer>( );
    private ArrayList<String> KULLANICININTAKIPETTIKLERI= new ArrayList<String>( );
    private ArrayList<Integer> KULLANICININTAKIPETTIKLERIID= new ArrayList<Integer>( );

 */








            if (isKullanıcıtakiptençıkmakistiyor()==true){
                System.out.println("!!!!");
                Statement silme= connect.createStatement();
                silme.executeUpdate("Delete from takip where takipçi= '"+ admamınidX+"' AND takipedilen= '"+getTakipideğişecekkullanıcııd() +"'   ");
            }
            if (isKullanıcıtakipetmekistiyor()==true){
                System.out.println("???");
                Statement ekleme= connect.createStatement();
                ekleme.executeUpdate("INSERT INTO  takip(takipçi,takipedilen)  VALUES('"+admamınidX+"','"+getTakipideğişecekkullanıcııd()+"') ");

            }



            Statement arkadşın1=connect.createStatement();
            Statement arkadşın2=connect.createStatement();
            Statement arkadşın=connect.createStatement();

           if (arkadaşınidsi!=0) {
               getARKADAŞINCAZ().clear();
               getARKADAŞINPOP().clear();
               getARKADAŞINKLASIK().clear();

               getARKADAŞINCAZSANATCI().clear();
               getARKADAŞINPOPSANATCI().clear();
               getARKADAŞINKLASIKSANATCI().clear();

               getARKADAŞINCAZID().clear();
               getARKADAŞINPOPID().clear();
               getARKADAŞINKLASIKID()   .clear();
               ResultSet cazlar = arkadşın.executeQuery("Select * from liste,şarkılar WHERE  Tür='Caz' AND liste.Şarkı_ID =şarkılar.ID  AND Kullanıcı_ID= '" + arkadaşınidsi + "' ");
               ResultSet poplar = arkadşın1.executeQuery("Select * from liste,şarkılar WHERE  Tür='Pop' AND liste.Şarkı_ID =şarkılar.ID  AND Kullanıcı_ID= '" + arkadaşınidsi + "' ");
               ResultSet klasikler = arkadşın2.executeQuery("Select * from liste,şarkılar WHERE  Tür='Klasik' AND liste.Şarkı_ID =şarkılar.ID  AND Kullanıcı_ID= '" + arkadaşınidsi + "' ");


               while (cazlar.next()) {

                   int q= cazlar.getInt("ID");
                   if (!getARKADAŞINCAZID().contains(q)) {
ARKADAŞINCAZID.add(q);
ARKADAŞINCAZ.add(cazlar.getString("Şarkı"));
ARKADAŞINCAZSANATCI.add(cazlar.getString("Sanatçı"));
                   }

               }



               while (poplar.next()) {

                   int q= poplar.getInt("ID");
                   if (!getARKADAŞINPOPID().contains(q)) {
                       ARKADAŞINPOPID.add(q);
                       ARKADAŞINPOP.add(poplar.getString("Şarkı"));
                       ARKADAŞINPOPSANATCI.add(poplar.getString("Sanatçı"));
                   }

               }



               while (klasikler.next()) {

                   int q= klasikler.getInt("ID");
                   if (!getARKADAŞINKLASIKID().contains(q)) {
                       ARKADAŞINKLASIKID.add(q);
                       ARKADAŞINKLASIK.add(klasikler.getString("Şarkı"));
                       ARKADAŞINKLASIKSANATCI.add(klasikler.getString("Sanatçı"));
                   }

               }

           }

            Statement qwe= connect.createStatement();
            Statement qwe1= connect.createStatement();
           Statement qwe2= connect.createStatement();

            ResultSet bizimcazlar = qwe1.executeQuery("Select * from liste,şarkılar WHERE  Tür='Caz' AND liste.Şarkı_ID =şarkılar.ID  AND Kullanıcı_ID= '" + admamınidX + "' ");
            ResultSet bizimpoplar = qwe2.executeQuery("Select * from liste,şarkılar WHERE  Tür='Pop' AND liste.Şarkı_ID =şarkılar.ID  AND Kullanıcı_ID= '" + admamınidX + "' ");
            ResultSet bizimklasikler = qwe.executeQuery("Select * from liste,şarkılar WHERE  Tür='Klasikler' AND liste.Şarkı_ID =şarkılar.ID  AND Kullanıcı_ID= '" + admamınidX + "' ");



            while (bizimcazlar.next()){

                int x=bizimcazlar.getInt("ID");
                if (!BizimCazID.contains(x)){
                    BizimCazID.add(x);
                    BizimCaz.add(bizimcazlar.getString("Şarkı"));
                    BizimCazSanatçı.add(bizimcazlar.getString("Sanatçı"));

                }

            }

            while (bizimklasikler.next()){

                int x=bizimklasikler.getInt("ID");
                if (!BizimKlasikID.contains(x)){
                    BizimKlasikID.add(x);
                    BizimKlasik.add(bizimklasikler.getString("Şarkı"));
                    BizimKlasikSanatçı.add(bizimklasikler.getString("Sanatçı"));

                }

            }

            while (bizimpoplar.next()){

                int x=bizimpoplar.getInt("ID");
                if (!BizimPopID.contains(x)){
                    BizimPopID.add(x);
                    BizimPop.add(bizimpoplar.getString("Şarkı"));
                    BizimPopSanatçı.add(bizimpoplar.getString("Sanatçı"));

                }

            }




            if (isBizeklemeyapıcaz()==true){
                Statement ekl= connect.createStatement();
                ekl.executeUpdate("INSERT INTO liste (Kullanıcı_ID, Şarkı_ID) VALUES ('"+admamınidX+"','"+ abc+"'  )");
            }

            if (isBizçıkarmayapıcaz()==true){
                Statement sil=connect.createStatement();
                sil.executeUpdate("Delete from liste where Kullanıcı_ID ='"+admamınidX+"' AND Şarkı_ID='"+abc+"' ");
            }



        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


    public ArrayList<String> getTümkullanıcılarınkullanıcıadı() {
        return tümkullanıcılarınkullanıcıadı;
    }







    public void setTümkullanıcılarınkullanıcıadı(ArrayList<String> tümkullanıcılarınkullanıcıadı) {
        this.tümkullanıcılarınkullanıcıadı = tümkullanıcılarınkullanıcıadı;
    }


    public ArrayList<Integer> getTümkullanıcılarınID() {
        return tümkullanıcılarınID;
    }

    public void setTümkullanıcılarınID(ArrayList<Integer> tümkullanıcılarınID) {
        this.tümkullanıcılarınID = tümkullanıcılarınID;
    }

    public int getKaç_kere_dinlendi() {
        return kaç_kere_dinlendi;
    }

    public void setKaç_kere_dinlendi(int kaç_kere_dinlendi) {
        this.kaç_kere_dinlendi = kaç_kere_dinlendi;
    }







    void createConnection(String k, String ş, String d, String Kayitürü, String email, String ülke, int seçilenşarkı){

        try{
            //Connect to Database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/şarkı","root","Gogol1221.");

            //Create a sql statement
            Statement query = connect.createStatement();
            Statement query2 = connect.createStatement();
            Statement query3 = connect.createStatement();
            Statement query4 = connect.createStatement();
            Statement query5 = connect.createStatement();
            Statement query6 = connect.createStatement();
            Statement query7 = connect.createStatement();
            Statement query8 = connect.createStatement();
            Statement query9 = connect.createStatement();
            Statement query10 = connect.createStatement();
            Statement query11 = connect.createStatement();
            Statement query12 = connect.createStatement();
            Statement query13 = connect.createStatement();


            Statement query14 = connect.createStatement();
            Statement query15 = connect.createStatement();
            Statement query16 = connect.createStatement();
            Statement query17 = connect.createStatement();
            Statement query18 = connect.createStatement();
            Statement query19 = connect.createStatement();
            Statement query20 = connect.createStatement();

            Statement query21 = connect.createStatement();
            Statement query25 = connect.createStatement();
            Statement query22 = connect.createStatement();
            Statement query23 = connect.createStatement();



            ResultSet tümkullanıcılistesi=query23.executeQuery("Select DISTINCT Kullanıcı_Adı,ID FROM kullanıcı");


            while (tümkullanıcılistesi.next()) {

                int   xxx = tümkullanıcılistesi.getInt("ID");

                if (!tümkullanıcılarınID.contains(xxx)){
                    tümkullanıcılarınID.add(xxx);
                    String xx = tümkullanıcılistesi.getString("Kullanıcı_Adı");
                    tümkullanıcılarınkullanıcıadı.add(xx);}

            }


            ResultSet qwe=query20.executeQuery("SELECT DISTINCT Şarkı_ID ,ID FROM kullanıcı,liste WHERE  liste.Kullanıcı_ID=kullanıcı.ID    AND  Kullanıcı_Adı='"+getResult2()+"' AND Şifre='"+getKopyaşifre()+"'  ");            //Execute a select all statement            ResultSet rs = query.executeQuery("SELECT DISTINCT Albüm FROM şarkılar WHERE Sanatçı='Göksel Kınalı' ");


            getGenel_top_10().clear();
            getUlkeye_gore_top_10_liste().clear();
            getPop().clear();
            getCaz().clear();
            getKlasik().clear();
            getTop_10_şarkıcıları().clear();
            getYerel_top_10_şarkıcıları().clear();
            getCaz_şarkıcı().clear();
            getPop_şarkıcı().clear();
            getKlasik_şarkıcı().clear();
            if (seçilenşarkı!=-1){
                ResultSet şarkıtür=query22.executeQuery("SELECT DISTINCT tür  FROM şarkılar WHERE      ID='"+seçilenşarkı+"'  ");            //Execute a select all statement            ResultSet rs = query.executeQuery("SELECT DISTINCT Albüm FROM şarkılar WHERE Sanatçı='Göksel Kınalı' ");

                while (şarkıtür.next()) {
                    seçilenşarkınıntürü = şarkıtür.getString("tür");
                }


                ResultSet q=query17.executeQuery("SELECT DISTINCT Şarkı_ID  FROM kullanıcı,liste WHERE  liste.Kullanıcı_ID=kullanıcı.ID    AND  Kullanıcı_Adı='"+getResult2()+"' AND Şifre='"+getKopyaşifre()+"'  ");            //Execute a select all statement            ResultSet rs = query.executeQuery("SELECT DISTINCT Albüm FROM şarkılar WHERE Sanatçı='Göksel Kınalı' ");
                ResultSet rs19=query19.executeQuery("SELECT DISTINCT ID FROM kullanıcı WHERE     Kullanıcı_Adı='"+getResult2()+"' AND Şifre='"+getKopyaşifre()+"'  ");            //Execute a select all statement            ResultSet rs = query.executeQuery("SELECT DISTINCT Albüm FROM şarkılar WHERE Sanatçı='Göksel Kınalı' ");
                while (rs19.next()) {
                    int xx = rs19.getInt("ID");

                    admamınidX=xx;
                    System.out.println(admamınidX);
                }

                if (c.contains(seçilenşarkı)){
                    c.remove(c.indexOf(seçilenşarkı));
                    query10.executeUpdate("Delete from liste where Şarkı_ID='"+seçilenşarkı +"'");            //Execute a select all statement            ResultSet rs = query.executeQuery("SELECT DISTINCT Albüm FROM şarkılar WHERE Sanatçı='Göksel Kınalı' ");
                    ResultSet rs22222 =query25.executeQuery("SELECT DISTINCT Şarkı,Sanatçı FROM şarkılar  WHERE  ID='"+seçilenşarkı+"'");

                    while (rs22222.next()) {

                        String xxx;
                        int xx=0;

                        if (seçilenşarkınıntürü.equals("Caz")) {
                            xxx     = rs22222.getString("şarkı");
                            ADAMINLISTECAZ.remove(ADAMINLISTECAZ.indexOf(xxx));
                            xxx = rs22222.getString("sanatçı");
                            ADAMINLISTECAZSANATÇI.remove(ADAMINLISTECAZSANATÇI.indexOf(xxx));

                        }
                        else if (seçilenşarkınıntürü.equals("Pop")){

                            xxx     = rs22222.getString("şarkı");
                            ADAMINLISTEPOP.remove(ADAMINLISTEPOP.indexOf(xxx));
                            xxx = rs22222.getString("sanatçı");
                            ADAMINLISTEPOPSANATÇI.remove(ADAMINLISTEPOPSANATÇI.indexOf(xxx));


                        }
                        else if (seçilenşarkınıntürü.equals("Klasik")){
                            xxx     = rs22222.getString("şarkı");
                            ADAMINLISTEKLASIK.remove(ADAMINLISTEKLASIK.indexOf(xxx));
                            xxx = rs22222.getString("sanatçı");
                            ADAMINLISTEKLASIKSANATÇI.remove(ADAMINLISTEKLASIKSANATÇI.indexOf(xxx));
                        }


                    }

                }
                else{

                    c.add(seçilenşarkı);


                    //yarım saatir arıyom BURDA ADAMIN LISTESINE SECILEN INDEKSI EKLICEZZ !!!!
                    query10.executeUpdate("INSERT INTO liste(Kullanıcı_ID,Şarkı_ID) VALUES('"+admamınidX+"','"+seçilenşarkı+"')");            //Execute a select all statement            ResultSet rs = query.executeQuery("SELECT DISTINCT Albüm FROM şarkılar WHERE Sanatçı='Göksel Kınalı' ");

                    ResultSet rs2222 =query21.executeQuery("SELECT DISTINCT Şarkı,Sanatçı FROM şarkılar  WHERE  ID='"+seçilenşarkı+"'");
                    while (rs2222.next()) {
                        String xxx;
                        xxx = rs2222.getString("şarkı");
                        String xx;
                        xx = rs2222.getString("sanatçı");
                        if (seçilenşarkınıntürü.equals("Caz")) {



                            ADAMINLISTECAZ.add(xxx);
                            ADAMINLISTECAZSANATÇI.add(xx);

                        }
                        else if(seçilenşarkınıntürü.equals("Pop")){

                            ADAMINLISTEPOP.add(xxx);
                            ADAMINLISTEPOPSANATÇI.add(xx);
                        }
                        else if(seçilenşarkınıntürü.equals("Klasik")){

                            ADAMINLISTEKLASIK.add(xxx);
                            ADAMINLISTEKLASIKSANATÇI.add(xx);
                        }



                    }
                }
            }

            if(k!=null&& ş!=null && email!=null && ülke!=null ){
                query10.executeUpdate("INSERT INTO Kullanıcı(Kullanıcı_Adı,email,şifre,abonelik_türü,ülke,durum) VALUES('"+k+"','"+email+"','"+ş+"','"+Kayitürü+"','"+ülke+"','Kullanıcı')");            //Execute a select all statement            ResultSet rs = query.executeQuery("SELECT DISTINCT Albüm FROM şarkılar WHERE Sanatçı='Göksel Kınalı' ");
            }

            ResultSet rs2 =query2.executeQuery("SELECT DISTINCT Kullanıcı_Adı FROM kullanıcı  WHERE Kullanıcı_Adı='"+k+"' AND Şifre='"+ş+"' AND durum='"+d+"'");
            ResultSet rs3 =query3.executeQuery("SELECT DISTINCT abonelik_türü FROM kullanıcı  WHERE Kullanıcı_Adı='"+k+"' AND Şifre='"+ş+"' AND durum='"+d+"'");
            ResultSet rs5 =query5.executeQuery("SELECT DISTINCT ülke FROM  kullanıcı WHERE Kullanıcı_Adı='"+k+"' AND Şifre='"+ş+"' AND durum='"+d+"'");
            ResultSet rs6 =query6.executeQuery("SELECT DISTINCT şarkı,sanatçı FROM şarkılar,sanatçı WHERE Sanatçı=Sanatçı_Adı ORDER BY Dinleme_Sayısı DESC LIMIT 10");
            ResultSet rs7 =query7.executeQuery("SELECT DISTINCT şarkı,sanatçı FROM şarkılar,sanatçı WHERE Sanatçı=Sanatçı_Adı AND Tür='Pop' ORDER BY Dinleme_Sayısı DESC LIMIT 10");
            ResultSet rs8 =query8.executeQuery("SELECT DISTINCT şarkı,sanatçı FROM şarkılar,sanatçı WHERE Sanatçı=Sanatçı_Adı AND Tür='Caz' ORDER BY Dinleme_Sayısı DESC LIMIT 10");
            ResultSet rs9 =query9.executeQuery("SELECT DISTINCT şarkı,sanatçı FROM şarkılar,sanatçı WHERE Sanatçı=Sanatçı_Adı AND Tür='Klasik' ORDER BY Dinleme_Sayısı DESC LIMIT 10");
            ResultSet rs11 =query11.executeQuery("SELECT DISTINCT şarkı,sanatçı,şarkılar.ID  FROM şarkılar,kullanıcı,liste WHERE  liste.Kullanıcı_ID=kullanıcı.ID  AND Tür='Pop' AND liste.Şarkı_ID =şarkılar.ID  AND  Kullanıcı_Adı='"+k+"' AND Şifre='"+ş+"'  ");
            ResultSet rs12 =query12.executeQuery("SELECT DISTINCT şarkı,sanatçı,şarkılar.ID  FROM şarkılar,kullanıcı,liste WHERE  liste.Kullanıcı_ID=kullanıcı.ID  AND Tür='Caz' AND liste.Şarkı_ID =şarkılar.ID  AND  Kullanıcı_Adı='"+k+"' AND Şifre='"+ş+"'  ");
            ResultSet rs13 =query13.executeQuery("SELECT DISTINCT şarkı,sanatçı ,şarkılar.ID  FROM şarkılar,kullanıcı,liste WHERE  liste.Kullanıcı_ID=kullanıcı.ID  AND Tür='Klasik' AND liste.Şarkı_ID =şarkılar.ID  AND  Kullanıcı_Adı='"+k+"' AND Şifre='"+ş+"'  ");

            ResultSet rs14 =query14.executeQuery("SELECT DISTINCT şarkı,sanatçı,ID  FROM şarkılar WHERE  Tür='Klasik'  ");
            ResultSet rs15 =query15.executeQuery("SELECT DISTINCT şarkı,sanatçı,ID  FROM şarkılar WHERE  Tür='Pop'  ");
            ResultSet rs16 =query16.executeQuery("SELECT DISTINCT şarkı,sanatçı,ID  FROM şarkılar WHERE  Tür='Caz'  ");




            while (rs14.next()) {
                int xx = 0;
                String xxx;
                String xxxx;
                xxx     = rs14.getString("şarkı");

                xxxx     = rs14.getString("sanatçı");


                xx=rs14.getInt("ID");
                if (!TümKlasiklerID.contains(xx) ) {
                    TümKlasiklerID.add(xx);
                    TümKlasikler.add(xxx);
                    TümKlasiklerSanatçı.add(xxxx);
                }



            }
            while (rs15.next()) {
                int xx = 0;
                String xxx;
                String xxxx;
                xxx     = rs15.getString("şarkı");

                xxxx     = rs15.getString("sanatçı");


                xx=rs15.getInt("ID");
                if (!TümPoplarID.contains(xx) ) {
                    TümPoplarID.add(xx);
                    TümPoplar.add(xxx);
                    TümPoplarSanatçı.add(xxxx);
                }



            }


            while (rs16.next()) {
                int xx = 0;
                String xxx;
                String xxxx;
                xxx     = rs16.getString("şarkı");

                xxxx     = rs16.getString("sanatçı");


                xx=rs16.getInt("ID");
                if (!TümCazlarID.contains(xx)  ) {
                    TümCazlarID.add(xx);
                    TümCazlar.add(xxx);
                    TümCazlarSanatçı.add(xxxx);
                }


            }








            while (rs11.next()) {
                String adf;
                int id;
                id = rs11.getInt("ID");
                if (!c.contains(id)) {
                    adf = rs11.getString("şarkı");
                    ADAMINLISTEPOP.add(adf);
                    adf = rs11.getString("sanatçı");
                    ADAMINLISTEPOPSANATÇI.add(adf);
                    c.add(id);
                }
            }


            while (rs12.next()){
                String adf;
                int id;
                id=rs12.getInt("ID");
                if (!c.contains(id) ) {
                    adf = rs12.getString("şarkı");
                    ADAMINLISTECAZ.add(adf);
                    adf = rs12.getString("sanatçı");
                    ADAMINLISTECAZSANATÇI.add(adf);
                    c.add(id);


                }
            } while (rs13.next()) {
                String adf;
                int id;
                id = rs13.getInt("ID");
                if (!c.contains(id)) {
                    adf = rs13.getString("şarkı");
                    ADAMINLISTEKLASIK.add(adf);
                    adf = rs13.getString("sanatçı");
                    ADAMINLISTEKLASIKSANATÇI.add(adf);
                    c.add(id);


                }
            }








            while (rs5.next()){
                ulke_bilgisi= rs5.getString("ülke");
            }
            while (rs2.next()){
                result2= rs2.getString("Kullanıcı_Adı");

            }
           /* while (rs.next()){
                result = rs.getString("Albüm");
                System.out.println(result);

            }*/

            ResultSet rs4 =query4.executeQuery("SELECT DISTINCT Şarkı,sanatçı FROM  şarkılar,sanatçı WHERE Sanatçı=Sanatçı_Adı AND ülke='"+ulke_bilgisi+"'ORDER BY Dinleme_Sayısı DESC LIMIT 7 ");

            while (rs2.next()){
                result3= rs2.getString("Şifre");

            }
            while (rs2.next()){
                result3= rs2.getString("Şifre");

            }
            while (rs3.next()){
                result4= rs3.getString("abonelik_türü");

            }


            while (rs4.next()){
                result5= rs4.getString("Şarkı");
                ulkeye_gore_top_10_liste.add(result5);
                result15=rs4.getString("Sanatçı");
                yerel_top_10_şarkıcıları.add(result15);

            }
            while (rs6.next()){
                result6= rs6.getString("Şarkı");
                genel_top_10.add(result6);
                result14=rs6.getString("Sanatçı");
                top_10_şarkıcıları.add(result14);
            }
            while (rs7.next()){
                result7= rs7.getString("Şarkı");
                pop.add(result7);
                result11=rs7.getString("Sanatçı");
                pop_şarkıcı.add(result11);

            }
            while (rs8.next()){
                result8= rs8.getString("Şarkı");
                caz.add(result8);
                result12=rs8.getString("Sanatçı");
                caz_şarkıcı.add(result12);

            }
            while (rs9.next()){
                result9= rs9.getString("Şarkı");
                klasik.add(result9);
                result13=rs9.getString("Sanatçı");
                klasik_şarkıcı.add(result13);

            }




        }

        catch (ClassNotFoundException ex){
            Logger.getLogger(FullDB.class.getName()).log(Level.SEVERE,null,ex);
        }

        catch(SQLException ex){
            Logger.getLogger(FullDB.class.getName()).log(Level.SEVERE,null,ex);
            ex.printStackTrace();
        }
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getResult2() {
        return result2;
    }

    public void setResult2(String result2) {
        this.result2 = result2;
    }

    public String getResult3() {
        return result3;
    }

    public void setResult3(String result3) {
        this.result3 = result3;
    }
    public String getResult4() {
        return result4;
    }

    public void setResult4(String result4) {
        this.result4 = result4;
    }

}