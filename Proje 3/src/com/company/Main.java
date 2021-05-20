package com.company;

import controlP5.CheckBox;
import controlP5.ControlP5;
import controlP5.Textfield;
import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

import java.util.ArrayList;
import java.util.Timer;




public class Main extends PApplet {
    ControlP5 cp5,a,b,c,d,e,z,listebutonları,listebutonz,cazbutonları,sliderclas,adminseçimbutonları,adminpaneli,müzikdinle;
    boolean adminb;
    boolean kullanicib;
    boolean submit_kontrol;
    boolean adminmi;
    boolean kayitb;
    boolean listeb;
    boolean listea;
    boolean cazseçimi;
    boolean popseçimi;
    boolean klasikseçimi;
    boolean müzikdinliyormu=false;
    String admınkullanıcıeklicekpremiumdurumu;
    ControlP5 textfieldbutonları,textfieldbutonları2,textfieldbutonları3,textfieldbutonları4,textfieldbutonları5;
    int adim_sayisi=0;
    String metin=" ";
    PFont font;
    PFont büyükfont;
    int j=0;
    int hangi_müzigi_dinliyor=-1;
    int abidin=0;
    int teksefer=0;
    int teksefer2=0;
    int abidin2=0;
    int abidin3=0;
    int abidinolsamkeşke=0;
    CheckBox kutu,kutu1;
    String Kullanici_Adi=" ";
    String Sifre=" ";
    String Durum=null;
    String Kayittürü="Normal";
    String ULKE=null;
    String EMAIL=null;
    PImage ekleme,cıkarma,guncelleme,çalma,listeimage;
    Timer Zamanlayıcı=new Timer();




    FullDB connection = new FullDB();
    ArrayList<Integer> cazdaadamınekledikleri= new ArrayList<Integer>( );
    ArrayList<Integer> cazdaadamınçıkardıkları= new ArrayList<Integer>( );
    Integer textfieldsayacı=0,textfieldsayacı2=0,textfieldsayacı3=0,textfieldsayacı4=0,textfieldsayacı5=0;;
    String adminneyieğiştirecek=" ";


    public static void main(String[] args) {
        PApplet.main("com.company.Main", args);



    }
    int listesayacı=0;
    int cazsayacı=0;
    boolean içindevar=false;
    int           adminadımsayısı=2;

    int maxslide=0;
    int slider=0;
    int slidersayaç=0;
    String textfieldtogglegüncel="Normal";
    int adminseçimbutonlarısayacı=0;
    boolean listec=false;
    boolean adamgözetlio=false;
    Integer kiminlistelerigelsin=-1;
    public void setup() {
        ekleme= loadImage("ekleme.png");
        cıkarma=loadImage("cıkarma.png");
        guncelleme=loadImage("guncel.png");
        çalma=loadImage("calma.png");
        popseçimi=false;
        klasikseçimi=false;
        cazseçimi=false;
        adminb=false;
        kullanicib=true;
        kayitb=false;
        listeb=false;
        listea=false;
        submit_kontrol=false;
        adminmi=false;
        font = createFont("arial", 24);
        büyükfont=  createFont("arial",36);

        cp5=new ControlP5(this);
        a=new ControlP5(this);
        b=new ControlP5(this);
        c=new ControlP5(this);
        d=new ControlP5(this);
        e=new ControlP5(this);
        z=new ControlP5(this);
        müzikdinle=new ControlP5(this);
        cazbutonları=new ControlP5(this);
        listebutonları=new ControlP5(this);
        listebutonz=new ControlP5(this);
        sliderclas=new ControlP5(this);
        textfieldbutonları=new ControlP5(this);
        textfieldbutonları2=new ControlP5(this);
        textfieldbutonları3=new ControlP5(this);
        textfieldbutonları4=new ControlP5(this);
        textfieldbutonları5=new ControlP5(this);

        adminseçimbutonları=new ControlP5(this);
        adminpaneli= new ControlP5(this);
        c.addButton("GERI").setPosition(0,815).setSize(100,50).getCaptionLabel().setFont(font);



    }

    public void settings() {
        smooth(4);
        fullScreen();
    }




    public void draw(){
        //GİRİŞ EKRANI

        if(adminb==false && kullanicib==false && kayitb==false){

            background(255,255,255,255);
            fill(0,0,255,255);
            textFont(font);
            textSize(64);
            c.setVisible(false);
            text("Girişinizi Seçiniz",520,300);
            if (abidinolsamkeşke==0) {
                cp5.addButton("ADMIN").setPosition(500, 350).setSize(250, 150).getCaptionLabel().setFont(font);

                a.addButton("KULLANICI").setPosition(770, 350).setSize(250, 150).getCaptionLabel().setFont(font);
                d.addButton("KAYIT").setPosition(635, 520).setSize(250, 150).getCaptionLabel().setFont(font);
                b.setVisible(false);
                abidinolsamkeşke=1;
            }

        }
        //KAYIT EKRANI
        if(kayitb==true && kullanicib==false && adminb==false) {
            adim_sayisi = 1;
            c.setVisible(true);
            if (Kullanici_Adi == " " && Sifre == " ") {
                background(98, 0, 238, 255);
                if (abidin == 0) {
                    z.remove(this);
                    z.addTextfield("EMAIL").setPosition(600, 200).setSize(300, 50).setAutoClear(true).setFont(font).setFont(font).getCaptionLabel().setText("");
                    z.addTextfield("KULLANICI_ADI").setPosition(600, 300).setSize(300, 50).setAutoClear(true).setFont(font).getCaptionLabel().setText("").setFont(font).setColor(120);
                    z.addTextfield("SIFRE").setPosition(600, 400).setSize(300, 50).setAutoClear(true).setFont(font).setFont(font).setPasswordMode(true).getCaptionLabel().setText("");
                    z.addTextfield("ULKE").setPosition(600, 500).setSize(300, 50).setAutoClear(true).setFont(font).setFont(font).getCaptionLabel().setText("");
                    z.addBang("KAYITOL").setPosition(600, 700).setSize(300, 50).getCaptionLabel().setText("");
                    z.addToggle("PREMIUM").setPosition(700,600).setSize(100,50).getCaptionLabel().setText("");


                    abidin = 1;
                }
                textFont(font);
                textSize(64);
                fill(255, 0, 0, 255);
                text("KAYIT ALANI", 560, 100);
                cp5.remove("ADMIN");
                a.remove("KULLANICI");
                d.remove("KAYIT");
                b.setVisible(true); //BUTONLARI GOSTERME ISLEMI
                textSize(20);
                fill(255, 0, 0, 255);
                text("EMAIL", 600, 190);
                text("KULLANICI ADI", 600, 290);
                text("SIFRE", 600, 390);
                text("ULKE", 600, 490);
                text("KAYIT OL", 600, 690);
                text("PREMİUM", 700, 590);
            }

        }
        //BILGILER GIRILMEDEN EVVELKI ADMIN PANELI
        if(adminb==true && kullanicib==false  &&submit_kontrol==false){
            adim_sayisi=1;
            adminmi=true;
            c.setVisible(true);
            if(Kullanici_Adi==" " && Sifre==" "){
                background(255,209,102,255);
                if(abidin==0){
                    b.addTextfield("KULLANICI_ADI").setPosition(600,400).setSize(300,50).setAutoClear(true).setFont(font).getCaptionLabel().setText("").setFont(font).setColor(120);
                    b.addTextfield("SIFRE").setPosition(600,500).setSize(300,50).setAutoClear(true).setFont(font).setFont(font).setPasswordMode(true).getCaptionLabel().setText("");
                    b.addBang("Submit").setPosition(600,600).setSize(300,50).getCaptionLabel().setText("");
                    abidin=1;
                }
                textFont(font);
                textSize(64);
                fill(0,0,255,255);
                text("ADMİN PANELİ",520,100);
                cp5.remove("ADMIN");
                a.remove("KULLANICI");
                d.remove("KAYIT");
                b.setVisible(true);
                textSize(20);
                fill(255,0,0,255);
                text("KULLANICI ADI",600,380);
                text("SIFRE",600,480);
                text("GIRIS",600,580);
                Durum="Admin";

            }
            //BILGILER YANLIS GIRLIRSE ADMIN PANELI
            else if(connection.getResult2()==null){
                connection.getGenel_top_10().clear();
                connection.getUlkeye_gore_top_10_liste().clear();
                connection.getPop().clear();
                connection.getCaz().clear();
                connection.getKlasik().clear();
                connection.getTop_10_şarkıcıları().clear();
                connection.getYerel_top_10_şarkıcıları().clear();
                connection.getCaz_şarkıcı().clear();
                connection.getPop_şarkıcı().clear();
                connection.getKlasik_şarkıcı().clear();
                c.setVisible(true);
                background(255,209,102,255);
                textFont(font);
                textSize(64);
                fill(0,0,255,255);
                text("ADMİN PANELİ",520,100);
                cp5.remove("ADMIN");
                a.remove("KULLANICI");
                d.remove("KAYIT");
                if(abidin==0){
                    b.remove(this);
                    b.addTextfield("KULLANICI_ADI").setPosition(600,400).setSize(300,50).setAutoClear(true).setFont(font).getCaptionLabel().setText("").setFont(font).setColor(120);
                    b.addTextfield("SIFRE").setPosition(600,500).setSize(300,50).setAutoClear(true).setFont(font).setFont(font).setPasswordMode(true).getCaptionLabel().setText("");
                    b.addBang("Submit").setPosition(600,600).setSize(300,50).getCaptionLabel().setText("");
                    abidin=1;
                }

                textSize(20);
                fill(255,0,0,255);
                text("KULLANICI ADI",600,380);
                text("SIFRE",600,480);
                text("GIRIS",600,580);
                textSize(25);
                text("YANLIS SIFRE YA DA KULLANICI ADI",600,700);


            }

        }
        //BILGILER GIRILMEDEN EVVEL KULLANICI PANELI
        if(kullanicib==true && adminb==false &&submit_kontrol==false){
            adim_sayisi=1;
            c.setVisible(true);
            if(Kullanici_Adi==" " && Sifre==" "){
                background(6,214,160,255);
                if(abidin==0){
                    b.remove(this);
                    b.addTextfield("KULLANICI_ADI").setPosition(600,400).setSize(300,50).setAutoClear(true).setFont(font).getCaptionLabel().setText("").setFont(font).setColor(120);
                    b.addTextfield("SIFRE").setPosition(600,500).setSize(300,50).setAutoClear(true).setFont(font).setFont(font).setPasswordMode(true).getCaptionLabel().setText("");
                    b.addBang("Submit").setPosition(600,600).setSize(300,50).getCaptionLabel().setText("");
                    abidin=1;
                }

                textFont(font);
                textSize(64);
                fill(0,0,255,255);
                text("KULLANICI PANELİ",470,100);
                cp5.remove("ADMIN");
                a.remove("KULLANICI");
                d.remove("KAYIT");
                b.setVisible(true); //BUTONLARI GOSTERME ISLEMI
                textSize(20);
                fill(255,0,0,255);
                text("KULLANICI ADI",600,380);
                text("SIFRE",600,480);
                text("GIRIS",600,580);
                Durum="Kullanıcı";
            }
            //BILGILERIN YANLIS GIRILDIGI KULLANICI PANELI
            else if(connection.getResult2()==null){
                connection.getGenel_top_10().clear();
                connection.getUlkeye_gore_top_10_liste().clear();
                connection.getPop().clear();
                connection.getCaz().clear();
                connection.getKlasik().clear();
                connection.getTop_10_şarkıcıları().clear();
                connection.getYerel_top_10_şarkıcıları().clear();
                connection.getCaz_şarkıcı().clear();
                connection.getPop_şarkıcı().clear();
                connection.getKlasik_şarkıcı().clear();
                c.setVisible(true);
                background(6,214,160,255);
                textFont(font);
                textSize(64);
                fill(0,0,255,255);
                text("KULLANICI PANELİ",470,100);
                cp5.remove("ADMIN");
                a.remove("KULLANICI");
                d.remove("KAYIT");

                if(abidin==0){
                    b.remove(this);
                    b.addTextfield("KULLANICI_ADI").setPosition(600,400).setSize(300,50).setAutoClear(true).setFont(font).getCaptionLabel().setText("").setFont(font).setColor(120);
                    b.addTextfield("SIFRE").setPosition(600,500).setSize(300,50).setAutoClear(true).setFont(font).setFont(font).setPasswordMode(true).getCaptionLabel().setText("");
                    b.addBang("Submit").setPosition(600,600).setSize(300,50).getCaptionLabel().setText("");
                    abidin=1;
                }
                textSize(20);
                fill(255,0,0,255);
                text("KULLANICI ADI",600,380);
                text("SIFRE",600,480);
                text("GIRIS",600,580);
                textSize(25);
                fill(255,0,0,255);
                text("YANLIS SIFRE YA DA KULLANICI ADI",600,700);


            }
        }
        //ADMINE HOSEGLEDİN
        if(submit_kontrol==true && adminmi==true ){
            adim_sayisi=2;
            adminadımsayısı=2;
            c.setVisible(true);
            background(255,255,255,255);
            textFont(font);
            textSize(30);
            text("HOSGELDIN "+connection.getResult2(),600,100);

            if (abidin3==0) {
                adminpaneli.addButton("KullanıcıIslemleri").setPosition(width/2 -200, 200).setSize(380, 50).getCaptionLabel().setFont(font).setText("Kullanıcı Islemleri");
                adminpaneli.addButton("SARKIISLEMLERI").setPosition(width/2 -200, 300).setSize(380, 50).getCaptionLabel().setFont(font).setText("Şarkı İşlemleri");
                adminpaneli.addButton( "CALMALISTEISLEMLERI").setPosition(width/2 -200, 400).setSize(380, 50).getCaptionLabel().setFont(font).setText("Çalma Listesi İşlemleri");
                adminpaneli.addButton("ALBUMISLEMLERI").setPosition(width/2 -200, 500).setSize(380, 50).getCaptionLabel().setFont(font).setText("Albüm İşlemleri");
                adminpaneli.addButton( "SANATCIISLEMLERI").setPosition(width/2 -200, 600).setSize(380, 50).getCaptionLabel().setFont(font).setText("Sanatçı İşlemleri");

                abidin3=1;
            }
            else
                adminpaneli.setVisible(true);



            if (adminneyieğiştirecek.equals("Kullanıcı")){
                adminadımsayısı=3;
                adim_sayisi=3;

                adminpaneli.setVisible(false);
                background(255);


                fill(0,255,0);
                rect(550,50,900,700,30,30,30,30);

                fill(0,0,255);

                rect(50,50,400,700,30,30,30,30);

                fill(0,125,125);
                rect(1000,75,400,650,30,30,30,30);





                fill(255,0,0);





                text("Kullanıcı Ekle",100,100);
                text("Kullanıcı Güncelle",600,100);
                text("Kullanıcı Sil",1100,120);

                text("Email",100,140);
                text("Kullanıcı Adı",100,240);
                text("Şifre",100,340);
                text("Ülke",100,440);
                text("Premium",100,540);

                text("Email",600,140);
                text("Kullanıcı Adı",600,240);
                text("Şifre",600,340);
                text("Ülke",600,440);
                text("Premium",600,540);

                if (textfieldsayacı==0) {

                    textfieldbutonları.addTextfield("kullanıcıekleemail").setPosition(100,150).setSize(300,50).setAutoClear(true).setFont(font).getCaptionLabel().setText("").setFont(font).setColor(120);
                    textfieldbutonları.addTextfield("kullanıcıeklekullanıcı_adı").setPosition(100,250).setSize(300,50).setAutoClear(true).setFont(font).getCaptionLabel().setText("").setFont(font).setColor(120);
                    textfieldbutonları.addTextfield("kullanıcıekleşifre").setPosition(100,350).setSize(300,50).setAutoClear(true).setFont(font).getCaptionLabel().setText("").setFont(font).setColor(120);
                    textfieldbutonları.addTextfield("kullanıcıekleülke").setPosition(100,450).setSize(300,50).setAutoClear(true).setFont(font).getCaptionLabel().setText("").setFont(font).setColor(120);
                    textfieldbutonları.addToggle("kullanıeklepremium").setPosition(220,550).setSize(50,50);
                    textfieldbutonları.addButton( "kullanıcıeklesubmit").setPosition(100, 650).setSize(300, 50).getCaptionLabel().setFont(font).setText("KullanıcıEkle");





                    textfieldbutonları.addTextfield("kullanıcıguncelleemail").setPosition(600,150).setSize(300,50).setAutoClear(true).setFont(font).getCaptionLabel().setText("").setFont(font).setColor(120);
                    textfieldbutonları.addTextfield("kullanıcıguncellekullanıcı_adı").setPosition(600,250).setSize(300,50).setAutoClear(true).setFont(font).getCaptionLabel().setText("").setFont(font).setColor(120);
                    textfieldbutonları.addTextfield("kullanıcıguncelleşifre").setPosition(600,350).setSize(300,50).setAutoClear(true).setFont(font).getCaptionLabel().setText("").setFont(font).setColor(120);
                    textfieldbutonları.addTextfield("kullanıcıguncelleülke").setPosition(600,450).setSize(300,50).setAutoClear(true).setFont(font).getCaptionLabel().setText("").setFont(font).setColor(120);
                    textfieldbutonları.addToggle("kullanıguncellepremium").setPosition(650,550).setSize(50,50);

                    textfieldsayacı=1;
                }

                for (int i=0;i<connection.getTümkullanıcılarınkullanıcıadı().size();i++){
                    text( connection.getTümkullanıcılarınkullanıcıadı().get(i),1100, 180+40*i);
                    image(guncelleme,1050,150+40*i,40,40);
                    image(cıkarma,1000,150+40*i,40,40);

                }








            }


            if (adminneyieğiştirecek.equals("Şarkı")) {
                adminadımsayısı=3;
                adim_sayisi=3;

                adminpaneli.setVisible(false);
                background(255);


                fill(0,255,0);
                rect(550,50,900,800,30,30,30,30);

                fill(0,0,255);

                rect(50,50,400,800,30,30,30,30);

                fill(0,125,125);
                rect(1000,75,400,750,30,30,30,30);





                fill(255,0,0);





                text("Şarkı Ekle",100,100);
                text("Şarkı Güncelle",600,100);
                text("Şarkı Sil",1100,120);

                text("Şarkı Adı",100,140);
                text("Sanatçı Adı",100,240);
                text("Tarih",100,340);
                text("Tür",100,440);
                text("Albüm",100,540);
                text("Süre",100,640);


                text("Şarkı",600,140);
                text("Sanatçı Adı",600,240);
                text("Tarih",600,340);
                text("Tür",600,440);
                text("Albüm",600,540);
                text("Süre",600,640);
                text("Dinlenme Sayısı",600,740);




                if (textfieldsayacı2==0) {

                    textfieldbutonları2.addTextfield("adminşarkıdaisimekle").setPosition(100,150).setSize(300,50).setAutoClear(true).setFont(font).getCaptionLabel().setText("").setFont(font).setColor(120);
                    textfieldbutonları2.addTextfield("adminşarkıdasanatçıeklee").setPosition(100,250).setSize(300,50).setAutoClear(true).setFont(font).getCaptionLabel().setText("").setFont(font).setColor(120);
                    textfieldbutonları2.addTextfield("adminsarkıdatarihekle").setPosition(100,350).setSize(300,50).setAutoClear(true).setFont(font).getCaptionLabel().setText("").setFont(font).setColor(120);
                    textfieldbutonları2.addTextfield("adminsarkıdatürekle").setPosition(100,450).setSize(300,50).setAutoClear(true).setFont(font).getCaptionLabel().setText("").setFont(font).setColor(120);
                    textfieldbutonları2.addTextfield("adminsarkıdaalbümekle").setPosition(100,550).setSize(300,50).setAutoClear(true).setFont(font).getCaptionLabel().setText("").setFont(font).setColor(120);
                    textfieldbutonları2.addTextfield("adminsarkıdasüreekle").setPosition(100,650).setSize(300,50).setAutoClear(true).setFont(font).getCaptionLabel().setText("").setFont(font).setColor(120);

                    textfieldbutonları2.addButton( "adminşarkıekledesubmit").setPosition(100, 750).setSize(300, 50).getCaptionLabel().setFont(font).setText("Şarkı Ekle");





                    textfieldbutonları2.addTextfield("adminşarkıdaisimgüncelle").setPosition(600,150).setSize(300,50).setAutoClear(true).setFont(font).getCaptionLabel().setText("").setFont(font).setColor(120);
                    textfieldbutonları2.addTextfield("adminşarkıdasanatçıgüncelle").setPosition(600,250).setSize(300,50).setAutoClear(true).setFont(font).getCaptionLabel().setText("").setFont(font).setColor(120);
                    textfieldbutonları2.addTextfield("adminsarkıdatarihgüncelle").setPosition(600,350).setSize(300,50).setAutoClear(true).setFont(font).getCaptionLabel().setText("").setFont(font).setColor(120);
                    textfieldbutonları2.addTextfield("adminsarkıdatürgüncelle").setPosition(600,450).setSize(300,50).setAutoClear(true).setFont(font).getCaptionLabel().setText("").setFont(font).setColor(120);
                    textfieldbutonları2.addTextfield("adminsarkıdaalbümgüncelle").setPosition(600,550).setSize(300,50).setAutoClear(true).setFont(font).getCaptionLabel().setText("").setFont(font).setColor(120);;
                    textfieldbutonları2.addTextfield("adminsarkıdasüregüncelle").setPosition(600,650).setSize(300,50).setAutoClear(true).setFont(font).getCaptionLabel().setText("").setFont(font).setColor(120);;
                    textfieldbutonları2.addTextfield("adminsarkıdadinlenmesayısıgüncelle").setPosition(600,750).setSize(300,50).setAutoClear(true).setFont(font).getCaptionLabel().setText("").setFont(font).setColor(120);;


                    connection.createConnection();









                    textfieldsayacı2=1;
                }
                //ŞARKILARDAKİ SANATÇILARIN LİSTESİ
                for (int i=0;i<connection.getTUMSANATCILAR().size();i++){
                    textSize(15);
                    fill(0,0,255,255);
                    text(connection.getTUMSARKILAR().get(i),1080,165+20*i);
                    textSize(15);
                    fill(255,0,0,255);
                    text( connection.getTUMSANATCILAR().get(i),1270, 165+20*i);
                    image(guncelleme,1050,150+20*i,20,20);
                    image(cıkarma,1000,150+20*i,20,20);

                }



            }

            if (adminneyieğiştirecek.equals("Sanatçı")) {
                adminadımsayısı = 3;
                adim_sayisi = 3;

                adminpaneli.setVisible(false);
                background(255);


                fill(0, 255, 0);
                rect(550, 50, 900, 800, 30, 30, 30, 30);

                fill(0, 0, 255);

                rect(50, 50, 400, 800, 30, 30, 30, 30);

                fill(0, 125, 125);
                rect(1000, 75, 400, 750, 30, 30, 30, 30);


                fill(255, 0, 0);


                text("Sanatçı Ekle", 100, 100);
                text("Sanatçı Güncelle", 600, 100);
                text("Sanatçı Sil", 1100, 120);

                text("Sanatçı Adı", 100, 140);
                text("Ülke", 100, 240);



                text("Sanatçı Adı", 600, 140);
                text("Ülke Adı", 600, 240);



                if (textfieldsayacı3==0) {

                    textfieldbutonları3.addTextfield("adminsanatçıdaisimekle").setPosition(100,150).setSize(300,50).setAutoClear(true).setFont(font).getCaptionLabel().setText("").setFont(font).setColor(120);
                    textfieldbutonları3.addTextfield("adminsanatçıdaülkeeklee").setPosition(100,250).setSize(300,50).setAutoClear(true).setFont(font).getCaptionLabel().setText("").setFont(font).setColor(120);
                    textfieldbutonları2.addButton( "adminsanatçıekledesubmit").setPosition(100, 750).setSize(300, 50).getCaptionLabel().setFont(font).setText("Şarkı Ekle");


                    textfieldbutonları3.addTextfield("adminşarkıdaisimgüncelle").setPosition(600,150).setSize(300,50).setAutoClear(true).setFont(font).getCaptionLabel().setText("").setFont(font).setColor(120);
                    textfieldbutonları3.addTextfield("adminşarkıdasanatçıgüncelle").setPosition(600,250).setSize(300,50).setAutoClear(true).setFont(font).getCaptionLabel().setText("").setFont(font).setColor(120);
                    connection.createConnection();
                    textfieldsayacı3=1;
                }



                for (int i=0;i<connection.getTUMSANATCILAR().size();i++){
                    text( connection.getTUMSANATCILAR().get(i),1100, 180+40*i);
                    image(guncelleme,1050,150+40*i,40,40);
                    image(cıkarma,1000,150+40*i,40,40);

                }


            }






        }
        //KULLANICIYA HOSGELDİN
        else if(submit_kontrol==true && adminmi==false ){
            adim_sayisi=2;
            c.setVisible(true);
            background(255,255,255,255);

            textFont(font);
            textSize(30);
            fill(0,0,255,255);
            text(connection.getResult4(),0,50);
            fill(0,0,255,255);
            text("HOSGELDIN "+connection.getResult2(),600,100);

            fill(255,255,0,255);
            rect(75,140,285,260,45,45,45,45);
            fill(0,0,0,255);
            textSize(20);
            text("YERLİ TOP 10 ŞARKI ",85,170);

            fill(255,0,0,255);
            textSize(15);
            for (int i = 0; i < connection.getUlkeye_gore_top_10_liste().size(); i++) {
                text((i+1)+"."+connection.getUlkeye_gore_top_10_liste().get(i),85,200+(20*i));


            }
            fill(0,0,255,255);
            textSize(15);
            for (int i = 0; i < connection.getYerel_top_10_şarkıcıları().size(); i++) {
                text(connection.getYerel_top_10_şarkıcıları().get(i),245,200+(20*i));

            }
            fill(255,255,0,255);
            rect(370,140,280,260,45,45,45,45);
            textSize(20);
            fill(0,0,0,255);
            text("TOP 10 ŞARKI ",420,170);

            fill(255,0,0,255);
            textSize(15);
            for (int i = 0; i < connection.getGenel_top_10().size(); i++) {
                text((i+1)+"."+connection.getGenel_top_10().get(i),390,200+(20*i));

            }
            fill(0,0,255,255);
            textSize(15);
            for (int i = 0; i < connection.getTop_10_şarkıcıları().size(); i++) {
                text(connection.getTop_10_şarkıcıları().get(i),540,200+(20*i));

            }
            fill(255,255,0,255);
            rect(660,140,280,260,45,45,45,45);
            textSize(20);
            fill(0,0,0,255);
            text("TOP 10 POP ŞARKI ",680,170);

            fill(255,0,0,255);
            textSize(15);
            for (int i = 0; i < connection.getPop().size(); i++) {
                text((i+1)+"."+connection.getPop().get(i),670,200+(20*i));

            }
            fill(0,0,255,255);
            textSize(15);
            for (int i = 0; i < connection.getCaz_şarkıcı().size(); i++) {
                text(connection.getPop_şarkıcı().get(i),820,200+(20*i));
            }
            fill(255,255,0,255);
            rect(950,140,280,260,45,45,45,45);
            textSize(20);
            fill(0,0,0,255);
            text("TOP 10 CAZ ŞARKI ",970,170);

            fill(255,0,0,255);
            textSize(15);
            for (int i = 0; i < connection.getCaz().size(); i++) {
                text((i+1)+"."+connection.getCaz().get(i),960,200+(20*i));

            }
            fill(0,0,255,255);
            textSize(15);
            for (int i = 0; i < connection.getCaz_şarkıcı().size(); i++) {
                text(connection.getCaz_şarkıcı().get(i),1080,200+(20*i));

            }
            fill(255,255,0,255);
            rect(1240,140,280,260,45,45,45,45);
            textSize(20);
            fill(0,0,0,255);
            text("TOP 10 KLASİK ŞARKI ",1270,170);

            fill(255,0,0,255);
            textSize(15);
            for (int i = 0; i < connection.getKlasik().size(); i++) {
                text((i+1)+"."+connection.getKlasik().get(i),1250,200+(20*i));

            }
            fill(0,0,255,255);
            textSize(15);
            for (int i = 0; i < connection.getKlasik_şarkıcı().size(); i++) {
                text(connection.getKlasik_şarkıcı().get(i),1400,200+(20*i));

            }


            text("Çalma Listelerim",720,450);
            text("Diğer Kullanıcıları Görüntüle",700,680);

            if (teksefer==0) {
                listebutonları.addButton("liste").setPosition(700, 480).setSize(150, 60).getCaptionLabel().setText("Listelerim");
                teksefer = 1;
                listebutonları.addButton("kullanıcıgörüntüle").setPosition(700,700).setSize(150,60);


            }
            text("Şarkı Dinle",740,570);
            if(teksefer2==0){
                müzikdinle.addButton("Şarkı_Dinle").setPosition(700, 590).setSize(150, 60).getCaptionLabel().setText("Sarkı Dinle");
                teksefer2=1;
            }
//listea butonuna basılırsa


            if (listec==true){
                adim_sayisi = 3;
                background(255,209,102,255);

                textSize(45);
                text("Takip Edebileceğin Kullanıcılar",600,50);

                müzikdinle.getController("Şarkı_Dinle").setVisible(false);
                listebutonları.getController("liste").setVisible(false);
                listebutonları.getController("kullanıcıgörüntüle").setVisible(false);

                textSize(30);
                connection.createConnection();
                for (int i=0;i<connection.getTÜMTAKİPEDİLEBİLECEKLER().size();i++) {
                    fill(239,71,111);
                    text(connection.getTÜMTAKİPEDİLEBİLECEKLER().get(i),600,150+30*i);

                    image(guncelleme,510,120+30*i,30,30);

                    if (!connection.getKULLANICININTAKIPETTIKLERIID().contains(  connection.getTÜMTAKİPEDİLEBİLECEKLERID().get(i)  )){

                        image(ekleme,550,120+30*i,30,30);

                    }else
                        image(cıkarma,550,120+30*i,30,30);



                }







                if (adamgözetlio==true){
                    connection.createConnection();
                    background(255);
                    textSize(40);
                    text("İstediğiniz Kullanıcının Çalma Listeleri",450,50);
                    textSize(20);

                    connection.setArkadaşınidsi(kiminlistelerigelsin);
                    text("CAZ Çalma Listesi",200,100);

                    text("KLASİK Çalma Listesi",600,100);
                    text("POP Çalma Listesi",1200,100);

//CAZ
                    for (int i=0;i<connection.getARKADAŞINCAZ().size();i++) {
                        fill(239,71,111);
                        text(connection.getARKADAŞINCAZ().get(i),200,140+30*i);
                        fill(7,59,76);
                        text(connection.getARKADAŞINCAZSANATCI().get(i),360,140+30*i);


                        if (connection.getBizimCazID().contains(connection.getARKADAŞINCAZID().get(i))){
                            image(cıkarma,160,120+30*i,30,30);
                        }
                        else
                            image(ekleme,160,120+30*i,30,30);


                    }
///pop
                    for (int i=0;i<connection.getARKADAŞINPOPID().size();i++) {
                        fill(239,71,111);
                        text(connection.getARKADAŞINPOP().get(i),1170,140+30*i);
                        fill(7,59,76);
                        text(connection.getARKADAŞINPOPSANATCI().get(i),1350,140+30*i);


                        if (connection.getBizimPopID().contains(connection.getARKADAŞINPOPID().get(i))){
                            image(cıkarma,1140,120+30*i,30,30);
                        }
                        else
                            image(ekleme,1140,120+30*i,30,30);


                    }

                    //KLASIK
                    for (int i=0;i<connection.getARKADAŞINKLASIK().size();i++) {
                        fill(239,71,111);
                        text(connection.getARKADAŞINKLASIK().get(i),600,140+30*i);
                        fill(7,59,76);
                        text(connection.getARKADAŞINKLASIKSANATCI().get(i),780,140+30*i);


                        if (connection.getBizimKlasikID().contains(connection.getARKADAŞINKLASIKID().get(i))){
                            image(cıkarma,560,120+30*i,30,30);
                        }
                        else
                            image(ekleme,560,120+30*i,30,30);


                    }


                }




            }



            if (listea==true) {
                adim_sayisi = 3;
                background(255,209,102,255);
                müzikdinle.getController("Şarkı_Dinle").setVisible(false);
                listebutonları.getController("liste").setVisible(false);
                listebutonları.getController("kullanıcıgörüntüle").setVisible(false);


                textSize(20);
                connection.createConnection();
                for (int i = 0; i <connection.getTUMSARKILAR().size(); i++) {
                    if(i<27) {


                        if(hangi_müzigi_dinliyor==i){
                            connection.setDinlenen_şarkı(hangi_müzigi_dinliyor);
                            connection.createConnection();
                            image(cıkarma, 105, 35 + hangi_müzigi_dinliyor * 30, 20, 20);
                            hangi_müzigi_dinliyor=-1;


                        }


                        else
                            image(çalma,105,35+30*i,20,20);

                        connection.createConnection();
                        fill(0, 0, 255, 255);
                        text(connection.getTUMSARKILAR().get(i), 130, 50 + 30 * i);
                        fill(255, 0, 0, 255);
                        text(connection.getTUMSANATCILAR().get(i), 310, 50 + 30 * i);


                    }

                    else if(i>26 && i<54){


                        if(hangi_müzigi_dinliyor==i){
                            connection.setDinlenen_şarkı(hangi_müzigi_dinliyor);
                            connection.createConnection();
                            image(cıkarma, 500, 35 + hangi_müzigi_dinliyor * 30-810, 20, 20);
                            hangi_müzigi_dinliyor=-1;
                        }
                        else
                            image(çalma,500,35+30*i-810,20,20);

                        fill(0, 0, 255, 255);
                        text(connection.getTUMSARKILAR().get(i), 525, 50 + 30 * i-810);
                        fill(255, 0, 0, 255);
                        text(connection.getTUMSANATCILAR().get(i), 695, 50 + 30 * i-810);


                    }
                    else{


                        if(hangi_müzigi_dinliyor==i){
                            connection.setDinlenen_şarkı(hangi_müzigi_dinliyor);
                            connection.createConnection();
                            image(cıkarma, 870, 35 + hangi_müzigi_dinliyor * 30-1620, 20, 20);

                            hangi_müzigi_dinliyor=-1;
                        }
                        else
                            image(çalma,870,35+30*i-1620,20,20);

                        fill(0, 0, 255, 255);
                        text(connection.getTUMSARKILAR().get(i), 895, 50 + 30 * i-1620);
                        fill(255, 0, 0, 255);
                        text(connection.getTUMSANATCILAR().get(i), 1050, 50 + 30 * i-1620);



                    }
                }

            }
//liste butonuna basılırrsa

            if (listeb==true){
                listec=false;
                adim_sayisi=3;
                background(255);
                listebutonları.remove(this);
                müzikdinle.remove(this);
                text("CAZ Çalma Listesi",200,100);

                text("KLASİK Çalma Listesi",700,100);
                text("POP Çalma Listesi",1200,100);

                //POP
                for (int i=0;i<connection.getADAMINLISTEPOP().size();i++) {
                    fill(239,71,111);
                    text(connection.getADAMINLISTEPOP().get(i),1170,150+20*i);
                    fill(7,59,76);
                    text(connection.getADAMINLISTEPOPSANATÇI().get(i),1350,150+20*i);
                }
//CAZ
                for (int i=0;i<connection.getADAMINLISTECAZ().size();i++) {
                    fill(239,71,111);
                    text(connection.getADAMINLISTECAZ().get(i),150,150+20*i);
                    fill(7,59,76);
                    text(connection.getADAMINLISTECAZSANATÇI().get(i),330,150+20*i);
                }

                //KLASIK
                for (int i=0;i<connection.getADAMINLISTEKLASIK().size();i++) {
                    fill(239,71,111);
                    text(connection.getADAMINLISTEKLASIK().get(i),650,150+20*i);
                    fill(7,59,76);
                    text(connection.getADAMINLISTEKLASIKSANATÇI().get(i),830,150+20*i);
                }
                if (listesayacı==0) {
                    listebutonz.remove(this);
                    listebutonz.setVisible(true);
                    listebutonz.addButton("cazgüncelleme").setPosition(205, 700).setSize(100, 50).getCaptionLabel().set("EKLE/CIKAR");


                    listebutonz.addButton("popgüncelleme").setPosition(1200, 700).setSize(100, 50).getCaptionLabel().set("EKLE/CIKAR");


                    listebutonz.addButton("klasikgüncelleme").setPosition(715, 700).setSize(100, 50).getCaptionLabel().set("EKLE/CIKAR");

                    listesayacı=1;
                }


                if (klasikseçimi==true){
                    textFont(büyükfont,30);
                    maxslide=(connection.getTümKlasikler().size()-13)*50;
                    if (maxslide<0)
                        maxslide=0;
                    adim_sayisi=4;
                    background(255);

                    //520 70


                    text(mouseX,800,800);
                    text(mouseY,820,850);



                    if (slidersayaç==0) {
                        sliderclas.addSlider("slider").setPosition(1500, 0).setSize(50, 863).setRange(0, maxslide).linebreak();
                        sliderclas.addButton("cazgüncel").setPosition(60,400).setSize(200,50).getCaptionLabel().setText("Listemi Güncelle");
                        slidersayaç=1;
                    }


                    for (int i=0;i<connection.getTümKlasikler().size();i++)
                    {



                        if( connection.getC() .contains( connection.getTümKlasiklerID().get(i)))
                            içindevar=true;

                        if (i%2==0)
                            fill(239, 71, 111);
                        else
                            fill(255,209  ,102  );
                        rect(450,70+50*i-slider ,700,40,25,25,25,25);



                        if (i%2==0)

                            fill(7, 59, 76);
                        if (i%2==1)
                            fill(17,138,178);






                        text(connection.getTümKlasikler().get(i), 600 ,  100 + 50 * i - slider);


                        text(connection.getTümKlasiklerSanatçı().get(i), 900 ,  100 + 50 * i-slider);

                        if (içindevar==false)
                            image(ekleme,530,75+50*i -slider,30,30);
                        else
                            image(cıkarma,530,75+50*i -slider,30,30);






                        içindevar=false;
                    }








                }








                if (cazseçimi==true){
                    textFont(büyükfont,30);
                    maxslide=(connection.getTümCazlar().size()-13)*50;
                    if (maxslide<0)
                        maxslide=0;
                    adim_sayisi=4;
                    background(255);

                    //520 70


                    text(mouseX,800,800);
                    text(mouseY,820,850);



                    if (slidersayaç==0) {
                        sliderclas.addSlider("slider").setPosition(1500, 0).setSize(50, 863).setRange(0, maxslide).linebreak();
                        sliderclas.addButton("cazgüncel").setPosition(60,400).setSize(200,50).getCaptionLabel().setText("Listemi Güncelle");
                        slidersayaç=1;
                    }


                    for (int i=0;i<connection.getTümCazlar().size();i++)
                    {



                        if( connection.getC() .contains( connection.getTümCazlarID().get(i)))
                            içindevar=true;

                        if (i%2==0)
                            fill(239, 71, 111);
                        else
                            fill(255,209  ,102  );
                        rect(450,70+50*i-slider ,700,40,25,25,25,25);



                        if (i%2==0)

                            fill(7, 59, 76);
                        if (i%2==1)
                            fill(17,138,178);






                        text(connection.getTümCazlar().get(i), 600 ,  100 + 50 * i - slider);


                        text(connection.getTümCazlarSanatçı().get(i), 900 ,  100 + 50 * i-slider);

                        if (içindevar==false)
                            image(ekleme,530,75+50*i -slider,30,30);
                        else
                            image(cıkarma,530,75+50*i -slider,30,30);






                        içindevar=false;
                    }








                }












                if (popseçimi==true){
                    adim_sayisi=4;
                    background(255);
                    text("POP SARKILAR",200,200);


                    textFont(büyükfont,30);
                    maxslide=(connection.getTümPoplar().size()-13)*50;
                    if (maxslide<0)
                        maxslide=0;
                    adim_sayisi=4;
                    background(255);

                    //520 70


                    text(mouseX,800,800);
                    text(mouseY,820,850);



                    if (slidersayaç==0) {
                        sliderclas.addSlider("slider").setPosition(1500, 0).setSize(50, 863).setRange(0, maxslide).linebreak();
                        sliderclas.addButton("cazgüncel").setPosition(60,400).setSize(200,50).getCaptionLabel().setText("Listemi Güncelle");
                        slidersayaç=1;
                    }


                    for (int i=0;i<connection.getTümPoplar().size();i++)
                    {



                        if( connection.getC() .contains( connection.getTümPoplarID().get(i)))
                            içindevar=true;

                        if (i%2==0)
                            fill(239, 71, 111);
                        else
                            fill(255,209  ,102  );
                        rect(450,70+50*i-slider ,700,40,25,25,25,25);



                        if (i%2==0)

                            fill(7, 59, 76);
                        if (i%2==1)
                            fill(17,138,178);






                        text(connection.getTümPoplar().get(i), 600 ,  100 + 50 * i - slider);


                        text(connection.getTümPoplarSanatçı().get(i), 900 ,  100 + 50 * i-slider);

                        if (içindevar==false)
                            image(ekleme,530,75+50*i -slider,30,30);
                        else
                            image(cıkarma,530,75+50*i -slider,30,30);






                        içindevar=false;
                    }

















                }





            }




        }


        text(mouseX,50,50);
        text(mouseY,50,60);

    }

    public void kullanıcıgörüntüle(){
        listec=true;
    }


    public void mousePressed() {
        int abdul = 0;
        connection.createConnection();

        if (listec==true && adamgözetlio==true){

            for (int i=0;i<connection.getARKADAŞINCAZ().size()-abdul;i++){

                if (mouseX>160 && mouseX<190 && mouseY>120+30*i  && mouseY<150+30*i){
                    int id=connection.getARKADAŞINCAZID().get(i);


                    if(connection.getBizimCazID().contains(id)){


                        System.out.println("çıkar");

                        connection.setAbc(id);
                        connection.setBizçıkarmayapıcaz(true);
                        connection.createConnection();
                        connection.setBizçıkarmayapıcaz(false);
                        connection.getBizimCazID().remove(i);
                        connection.getBizimCaz().remove(i);
                        connection.getBizimCazSanatçı().remove(i);
                        abdul++;
                    }
                    else {
                        System.out.println("ekle");
                        int kaçıncıeleman=connection.getTümCazlarID().indexOf(id);
                        connection.getBizimCaz().add(connection.getTümCazlar().get(kaçıncıeleman));
                        connection.getBizimCazSanatçı().add(connection.getTümCazlarSanatçı().get(kaçıncıeleman));
                        connection.getBizimCazID().add(id);

                        connection.setAbc(id);
                        connection.setBizeklemeyapıcaz(true);
                        connection.createConnection();
                        connection.setBizeklemeyapıcaz(false);

                    }
                }

            }

            abdul=0;

            for (int i=0;i<connection.getARKADAŞINPOP().size()-abdul;i++){

                if (mouseX>1140 && mouseX<1170 && mouseY>120+30*i  && mouseY<150+30*i){
                    int id=connection.getARKADAŞINPOPID().get(i);


                    if(connection.getBizimPopID().contains(id)){
                        System.out.println("çıkar");
                        connection.createConnection();

                        connection.setAbc(id);
                        connection.setBizçıkarmayapıcaz(true);
                        connection.createConnection();
                        connection.setBizçıkarmayapıcaz(false);
                        connection.getBizimPopID().remove(i);
                        connection.getBizimPop().remove(i);
                        connection.getBizimPopSanatçı().remove(i);

                    }
                    else {
                        System.out.println("ekle");
                        int kaçıncıeleman=connection.getTümPoplarID().indexOf(id);
                        connection.getBizimPop().add(connection.getTümPoplar().get(kaçıncıeleman));
                        connection.getBizimPopSanatçı().add(connection.getTümPoplarSanatçı().get(kaçıncıeleman));

                        connection.setAbc(id);
                        connection.setBizeklemeyapıcaz(true);
                        connection.createConnection();
                        connection.setBizeklemeyapıcaz(false);
                        connection.getBizimPopID().add(id);
                        abdul++;
                    }
                }

            }



            abdul=0;

            for (int i=0;i<connection.getARKADAŞINKLASIK().size()-abdul;i++){

                if (mouseX>560 && mouseX<590 && mouseY>120+30*i  && mouseY<150+30*i){
                    int id=connection.getARKADAŞINKLASIKID().get(i);


                    if(connection.getBizimKlasikID().contains(id)){
                        System.out.println("çıkar");
                        connection.createConnection();

                        connection.setAbc(id);
                        connection.setBizçıkarmayapıcaz(true);
                        connection.createConnection();
                        connection.setBizçıkarmayapıcaz(false);
                        connection.getBizimKlasikID().remove(i);
                        connection.getBizimKlasik().remove(i);
                        connection.getBizimKlasikSanatçı().remove(i);
                        abdul++;
                    }
                    else {
                        System.out.println("ekle");
                        int kaçıncıeleman=connection.getTümKlasiklerID().indexOf(id);
                        connection.getBizimKlasik().add(connection.getTümKlasikler().get(kaçıncıeleman));
                        connection.getBizimKlasikSanatçı().add(connection.getTümKlasiklerSanatçı().get(kaçıncıeleman));

                        connection.setAbc(id);
                        connection.setBizeklemeyapıcaz(true);
                        connection.createConnection();
                        connection.setBizeklemeyapıcaz(false);
                        connection.getBizimKlasikID().add(id);

                    }
                }

            }



        }






        if (listec == true) {


            for (int i = 0; i < connection.getTÜMTAKİPEDİLEBİLECEKLERID().size() - abdul; i++) {
//güncelleme

                if (mouseX > 510 && mouseX < 540 && mouseY > 120 + 30 * i && mouseY < 150 + 30 * i) {
                    int silinecekindex = connection.getTÜMTAKİPEDİLEBİLECEKLERID().get(i);
                    kiminlistelerigelsin = silinecekindex;
                    adamgözetlio = true;
                    connection.createConnection();
                }
                ;
            }

            for (int i = 0; i < connection.getTÜMTAKİPEDİLEBİLECEKLERID().size() - abdul; i++) {

                //ekleme cıkarma
                if (mouseX > 550 && mouseX < 580 && mouseY > 120 + 30 * i && mouseY < 150 + 30 * i) {

                    if (!connection.getKULLANICININTAKIPETTIKLERIID().contains(connection.getTÜMTAKİPEDİLEBİLECEKLERID().get(i))) {
                        System.out.println("ekle");
                        int silinecekindex = connection.getTÜMTAKİPEDİLEBİLECEKLERID().get(i);
                        connection.getKULLANICININTAKIPETTIKLERIID().add(silinecekindex);
                        connection.setKullanıcıtakipetmekistiyor(true);
                        connection.setTakipideğişecekkullanıcııd(silinecekindex);

                        connection.createConnection();

                        connection.setKullanıcıtakipetmekistiyor(false);

                    } else {
                        System.out.println("cıkar");
                        int silinecekindex = connection.getTÜMTAKİPEDİLEBİLECEKLERID().get(i);
                        connection.getKULLANICININTAKIPETTIKLERIID().remove(connection.getKULLANICININTAKIPETTIKLERIID().indexOf(silinecekindex));
                        connection.setKullanıcıtakiptençıkmakistiyor(true);
                        connection.setTakipideğişecekkullanıcııd(silinecekindex);
                        connection.createConnection();
                        connection.setKullanıcıtakiptençıkmakistiyor(false);

                        abdul++;

                    }
                }
            }


        }


//ADMIN SARKI SILME

        abdul=0;


        for (int i = 0; i <connection.getTUMSARKILAR().size(); i++) {
            if(listea==true){
                if(i<27){
                    if(mouseX>105 &&mouseX<125 && mouseY>35+30*i && mouseY<55+30*i){
                        müzikdinliyormu=true;
                        hangi_müzigi_dinliyor=i;
                    }

                }
                if(i>26 && i<54){
                    if(mouseX>500 &&mouseX<520 && mouseY>35+30*i-810 && mouseY<55+30*i-810){
                        müzikdinliyormu=true;
                        hangi_müzigi_dinliyor=i;
                    }
                }
                if(i>53){
                    if(mouseX>870 &&mouseX<890 && mouseY>35+30*i-1620 && mouseY<55+30*i-1620){
                        müzikdinliyormu=true;
                        hangi_müzigi_dinliyor=i;

                    }

                }

            }

        }


        if (adminneyieğiştirecek.equals("Şarkı") && adminadımsayısı==3) {


            for (int i=0;i<connection.getTUMSARKILAR().size()- abdul;i++)
                if (mouseX>1000 && mouseX<1040 && mouseY>150+20*i && mouseY<190+20*i){
                    connection.setAdminşarkısilebastı(true);
                    int x=connection.getTUMŞARKIIDLER().get(i);

                    connection.setAdminhangiidlişarkıyısilecek(x);
                    connection.createConnection();
                    connection.setAdminşarkısilebastı(false);
                    connection.getTUMSARKILAR().remove(i);
                    connection.getTUMSANATCILAR().remove(i);
                    connection.getTUMŞARKIIDLER().remove(i);
                    abdul++;
                }

        }



        //ADMIN SARKI GUNCELLEME




        abdul=0;

        if (adminneyieğiştirecek.equals("Şarkı") && adminadımsayısı==3) {

            for (int i = 0; i < connection.getTUMSARKILAR().size(); i++) {
                if (mouseX > 1050 && mouseX < 1070 && mouseY > 150 + 20 * i && mouseY < 170 + 20 * i) {
                    connection.setAdminşarkıgüncelleyebastı(false);
                    connection.createConnection();
                    String textfieldeisim = textfieldbutonları2.get(Textfield.class, "adminşarkıdaisimgüncelle").getText();
                    String textfileldsanatçı = textfieldbutonları2.get(Textfield.class, "adminşarkıdasanatçıgüncelle").getText();
                    String textfieldtarih = textfieldbutonları2.get(Textfield.class, "adminsarkıdatarihgüncelle").getText();
                    String textfieltür = textfieldbutonları2.get(Textfield.class, "adminsarkıdatürgüncelle").getText();
                    String textfieldalbüm = textfieldbutonları2.get(Textfield.class, "adminsarkıdaalbümgüncelle").getText();
                    String textfieldsüre = textfieldbutonları2.get(Textfield.class, "adminsarkıdasüregüncelle").getText();
                    String textfielddinlenmesayısı = textfieldbutonları2.get(Textfield.class, "adminsarkıdadinlenmesayısıgüncelle").getText();


                    int x = connection.getTUMŞARKIIDLER().get(i);
                    connection.setAdminşarkıgüncelleyebastı(true);
                    connection.setAdminhangiidlişarkıyısilecek(x);
                    if (!textfieldeisim.equals(null)) {
                        connection.setGüncellenenşarkıadı(textfieldeisim);
                    }
                    if (!textfileldsanatçı.equals(null)) {
                        connection.setGüncellenenşarkınınsanatçısı(textfileldsanatçı);
                    }
                    if (!textfieldtarih.equals(null)) {
                        connection.setGüncellenenşarkınıntarihi(textfieldtarih);
                    }
                    if (!textfieltür.equals(null)) {
                        connection.setGüncellenenşarkınıntürü(textfieltür);
                    }
                    if (!textfieldsüre.equals(null)) {
                        connection.setGüncellenenşarkınınsüresi(textfieldsüre);
                    }
                    if (!textfielddinlenmesayısı.equals(null)) {
                        connection.setGüncellenecekşarkınındinlenmesayısı(textfielddinlenmesayısı);
                    }
                    if (!textfieldalbüm.equals(null)) {
                        connection.setGüncellenenşarkınınalbümü(textfieldalbüm);
                    }





                    connection.createConnection();

                    connection.setAdminşarkıgüncelleyebastı(false);
                    connection.getTUMSARKILAR().set(i, connection.getGüncellenenşarkıadı());
                    connection.getTUMSANATCILAR().set(i,connection.getGüncellenenşarkınınsanatçısı());


                }

            }


        }





        //ADMIN ISLEMLERI kullanıcı silme
        abdul=0;

        if (adminneyieğiştirecek.equals("Kullanıcı") && adminadımsayısı==3) {


            for (int i=0;i<connection.getTümkullanıcılarınkullanıcıadı().size()- abdul;i++)
                if (mouseX>1010 && mouseX<1030 && mouseY>150+20*i && mouseY<130+20*i){

                    connection.setAdminesilebastı(true);
                    int x=connection.getTümkullanıcılarınID().get(i);

                    connection.setHangiidlikullanıcısilinecek(x);
                    connection.createConnection();
                    connection.setAdminesilebastı(false);
                    connection.getTümkullanıcılarınID().remove(i);
                    connection.getTümkullanıcılarınkullanıcıadı().remove(i);
                    abdul++;
                }

        }



        //ADMIN ISLEMLERI Kullanıcı güncelleme






        abdul=0;
        if (adminneyieğiştirecek.equals("Kullanıcı") && adminadımsayısı==3) {


            for (int i=0;i<connection.getTümkullanıcılarınkullanıcıadı().size()- abdul;i++)
                if (mouseX>1050 && mouseX<1090 && mouseY>150+40*i && mouseY<190+40*i){
                    String textfieldemail=textfieldbutonları.get(Textfield.class,"kullanıcıguncelleemail").getText();
                    String textfiledkullanıcıadı=textfieldbutonları.get(Textfield.class,"kullanıcıguncellekullanıcı_adı").getText();
                    String textfieldşifre=textfieldbutonları.get(Textfield.class,"kullanıcıguncelleşifre").getText();
                    String textfieldülke=textfieldbutonları.get(Textfield.class,"kullanıcıguncelleülke").getText();

                    int x=connection.getTümkullanıcılarınID().get(i);
                    connection.setGüncellencekkullanıcıid(x);
                    connection.createConnection();


                    String sonmail;
                    String sonkullanıcıadı;
                    String sonşifre;
                    String  sonülke;



                    if (textfieldemail.equals("")){
                        sonmail =connection.getGüncellenecekkulanıcımail();
                    }else
                        sonmail=textfieldemail;



                    if (textfiledkullanıcıadı.equals("")){
                        sonkullanıcıadı =connection.getGüncellenecekkullanıcıadı();
                    }else
                        sonkullanıcıadı=textfiledkullanıcıadı;



                    if (textfieldşifre.equals("")){
                        sonşifre =connection.getGüncellenecekkulanıcışifre();
                    }else
                        sonşifre=textfieldşifre;



                    if (textfieldülke.equals("")){
                        sonülke =connection.getGüncellenecekkulanıcıülke();
                    }else
                        sonülke=textfieldülke;


                    connection.setGüncellenecekkullanıcıadı(sonkullanıcıadı);
                    connection.setGüncellenecekkulanıcışifre(sonşifre);
                    connection.setGüncellenecekkulanıcıülke(sonülke);
                    connection.setGüncellenecekkulanıcımail(sonmail);
                    connection.setGüncellenecekkulanıcıdurum(textfieldtogglegüncel);
                    connection.setAdminkullanıcıgüncelleyebastı(true);
                    connection.createConnection();
                    connection.setAdminkullanıcıgüncelleyebastı(false);




                }

        }



        int adamım;
        if (adim_sayisi==4   && cazseçimi==true) {
            boolean basıldı=false;





            for (int i=0;i<connection.getTümCazlar().size();i++){

                if (mouseX>530 && mouseX<560 && mouseY>75+50*i -slider  && mouseY<105  +50*i -slider && basıldı==false) {


                    adamım=connection.getTümCazlarID().get(i);


                    connection.createConnection(Kullanici_Adi,Sifre,Durum,Kayittürü,EMAIL,ULKE,adamım);
                    basıldı = true;




                }
            }



        }





        //POPLAR

        if (adim_sayisi==4   && popseçimi==true) {
            boolean basıldı = false;


            for (int i = 0; i < connection.getTümPoplar().size(); i++) {

                if (mouseX > 530 && mouseX < 560 && mouseY > 75 + 50 * i - slider && mouseY < 105 + 50 * i - slider && basıldı == false) {


                    adamım = connection.getTümPoplarID().get(i);


                    connection.createConnection(Kullanici_Adi, Sifre, Durum, Kayittürü, EMAIL, ULKE, adamım);
                    basıldı = true;


                }
            }

        }
        //KLASIK


        if (adim_sayisi == 4 && klasikseçimi == true) {
            boolean   basıldı = false;


            for (int i = 0; i < connection.getTümKlasikler().size(); i++) {

                if (mouseX > 530 && mouseX < 560 && mouseY > 75 + 50 * i - slider && mouseY < 105 + 50 * i - slider && basıldı == false) {


                    adamım = connection.getTümKlasiklerID().get(i);


                    connection.createConnection(Kullanici_Adi, Sifre, Durum, Kayittürü, EMAIL, ULKE, adamım);
                    basıldı = true;


                }
            }


        }


    }




    public void adminsanatçıekledesubmit(){
        String şanatçıadı=textfieldbutonları3.get(Textfield.class,"adminsanatçıdaisimekle").getText();
        String ülke=textfieldbutonları3.get(Textfield.class,"adminsanatçıdaülkeeklee").getText();
        connection.setEklenileceksanatçı(şanatçıadı);
        connection.setEklenileceksanatçıyaülke(ülke);

        connection.setAdminsanatçıekleyebastı(true);
        connection.createConnection();
        connection.setAdminsanatçıekleyebastı(false);


    }


    public void kullanıguncellepremium(){
        if ( textfieldtogglegüncel.equals("Normal"))
            textfieldtogglegüncel="Premium";
        else
            textfieldtogglegüncel="Normal";

    }

    public void adminşarkıekledesubmit(){
        String şarkı_adı=textfieldbutonları2.get(Textfield.class,"adminşarkıdaisimekle").getText();
        String tarih=textfieldbutonları2.get(Textfield.class,"adminsarkıdatarihekle").getText();
        String sanatçı=textfieldbutonları2.get(Textfield.class,"adminşarkıdasanatçıeklee").getText();
        String Albüm=textfieldbutonları2.get(Textfield.class,"adminsarkıdaalbümekle").getText();
        String tür=textfieldbutonları2.get(Textfield.class,"adminsarkıdatürekle").getText();
        String süre=textfieldbutonları2.get(Textfield.class,"adminsarkıdasüreekle").getText();
        connection.setAdminşarkıadıekliyor(şarkı_adı);
        connection.setAdmintarihekliyor(tarih);
        connection.setAdminsanatçıekliyor(sanatçı);
        connection.setAdminalbümekliyor(Albüm);
        connection.setAdmintürekliyor(tür);
        connection.setAdminsüreekliyor(süre);
        connection.setAdminşarkıekleyebasti(true);
        connection.createConnection();
        connection.setAdminşarkıekleyebasti(false);


    }
    public void kullanıeklepremium(){
        if (   admınkullanıcıeklicekpremiumdurumu=="Normal"){
            admınkullanıcıeklicekpremiumdurumu="Premium";
        }
        else
            admınkullanıcıeklicekpremiumdurumu="Normal";



    }





    public void kullanıcıeklesubmit(){

        String email=textfieldbutonları.get(Textfield.class,"kullanıcıekleemail").getText();
        String kullanıcıadı=textfieldbutonları.get(Textfield.class,"kullanıcıeklekullanıcı_adı").getText();
        String şifre=textfieldbutonları.get(Textfield.class,"kullanıcıekleşifre").getText();
        String ülke=textfieldbutonları.get(Textfield.class,"kullanıcıekleülke").getText();
        connection.setAdminkullanıcıadıekliyor(kullanıcıadı);
        connection.setAdminkullanıcımailekliyor(email);
        connection.setAdminekleyebastı(true);
        connection.setAdminkullanıcıpremiumekliyor(admınkullanıcıeklicekpremiumdurumu);
        connection.setAdminkullanıcışifreekliyor(şifre);

        connection.createConnection();
        connection.setAdminekleyebastı(false);

    }
    public void  ALBUMISLEMLERI(){
        adminneyieğiştirecek="Albüm";
    }


    public void  SANATCIISLEMLERI(){
        adminneyieğiştirecek="Sanatçı";
    }

    public void  KullanıcıIslemleri(){
        adminneyieğiştirecek="Kullanıcı";
    }


    public void  SARKIISLEMLERI(){
        adminneyieğiştirecek="Şarkı";
    }

    public void  CALMALISTEISLEMLERI(){
        adminneyieğiştirecek="Liste";

    }




    public void popgüncelleme() {
        popseçimi = true;
        listebutonz.setVisible(false);
        connection.createConnection(connection.getResult2(), connection.getKopyaşifre(), connection.getResult3(), connection.getResult5(), EMAIL, ULKE, -1);
    }

    public void cazgüncelleme(){
        cazseçimi=true;
        listebutonz.setVisible(false);

        connection.createConnection(connection.getResult2(),connection.getKopyaşifre(),connection.getResult3(),connection.getResult5(),EMAIL,ULKE,-1);
    }

    public void klasikgüncelleme(){
        klasikseçimi=true;
        listebutonz.setVisible(false);
        connection.createConnection(connection.getResult2(),connection.getKopyaşifre(),connection.getResult3(),connection.getResult5(),EMAIL,ULKE,-1);
    }

    public void liste(){
        listeb=true;
    }
    public void Şarkı_Dinle(){
        listea=true;
    }
    public void Submit(){
        teksefer=0;
        teksefer2=0;
        listesayacı=0;
        if(adminb==true ||kullanicib==true){
            Kullanici_Adi=b.get(Textfield.class,"KULLANICI_ADI").getText();
            Sifre=b.get(Textfield.class,"SIFRE").getText();
            connection.setResult2(null);
            connection.createConnection(Kullanici_Adi,Sifre,Durum,Kayittürü,EMAIL,ULKE,-1);
            if(connection.getResult2()!=null) {
                submit_kontrol = true;
                b.remove(this);
                connection.setKopyaşifre(Sifre);
            }



            Kullanici_Adi=null;
            Sifre=null;
        }


    }
    public void KAYITOL(){
        Kullanici_Adi=z.get(Textfield.class,"KULLANICI_ADI").getText();
        Sifre=z.get(Textfield.class,"SIFRE").getText();
        ULKE=z.get(Textfield.class,"ULKE").getText();
        EMAIL=z.get(Textfield.class,"EMAIL").getText();
        EMAIL=z.get(Textfield.class,"EMAIL").getText();
        connection.setResult2(null);
        connection.createConnection(Kullanici_Adi,Sifre,Durum,Kayittürü,EMAIL,ULKE,-1);

    }





    public void GERI(){



        listea=false;

        if (listec==true && adamgözetlio==true){
            adamgözetlio=false;
        }

        if (listec==true && adamgözetlio==false){
            listec=false;
        }

        if (adminadımsayısı==2){
            textfieldbutonları.remove(this);
            textfieldsayacı=0;
            adminneyieğiştirecek="";
            adminpaneli.setVisible(false);

        }

        else if (adminadımsayısı==3){
            textfieldbutonları2.remove(this);
            textfieldbutonları3.remove(this);
            textfieldbutonları.remove(this);
            textfieldsayacı=0;
            textfieldsayacı2=0;
            textfieldsayacı3=0;
            adminneyieğiştirecek="";
            adminadımsayısı=2;
            adminpaneli.setVisible(true);

        }


        teksefer=0;
        teksefer2=0;
        müzikdinle.remove(this);
        listesayacı=0;
        listebutonz.remove(this);
        abidin=0;
        abidinolsamkeşke=0;
        klasikseçimi=false;
        cazseçimi=false;
        popseçimi=false;
        b.remove(this);
        z.remove(this);
        if(adim_sayisi==1){
            adminb=false;
            kullanicib=false;
            kayitb=false;

            submit_kontrol=false;
            adminmi=false;
            Kullanici_Adi=" ";
            Sifre=" ";
            Durum=null;
            adim_sayisi=0;
            EMAIL=null;
            ULKE=null;
            connection.getGenel_top_10().clear();
            connection.getUlkeye_gore_top_10_liste().clear();
            connection.getPop().clear();
            connection.getCaz().clear();
            connection.getKlasik().clear();
            connection.getTop_10_şarkıcıları().clear();
            connection.getYerel_top_10_şarkıcıları().clear();
            connection.getCaz_şarkıcı().clear();
            connection.getPop_şarkıcı().clear();
            connection.getKlasik_şarkıcı().clear();
        }
        else if(adim_sayisi==2){


            listesayacı=0;
            listebutonları.remove(this);
            submit_kontrol=false;
            Kullanici_Adi=" ";
            Sifre=" ";
            adim_sayisi=1;
            EMAIL=null;
            ULKE=null;
            connection.getGenel_top_10().clear();
            connection.getUlkeye_gore_top_10_liste().clear();
            connection.getPop().clear();
            connection.getCaz().clear();
            connection.getKlasik().clear();
            connection.getTop_10_şarkıcıları().clear();
            connection.getYerel_top_10_şarkıcıları().clear();
            connection.getCaz_şarkıcı().clear();
            connection.getPop_şarkıcı().clear();
            connection.getKlasik_şarkıcı().clear();
        }
        else if(adim_sayisi==3){
            listeb=false;
            adim_sayisi--;
            listebutonları.setVisible(true);


        }
        else if(adim_sayisi==4){
            klasikseçimi=false;
            cazseçimi=false;
            popseçimi=false;
            sliderclas.remove(this);
            slidersayaç=0;
        }
    }
    public void ADMIN(){ adminb=true;}
    public void KULLANICI(){
        kullanicib=true;
    }
    public void KAYIT(){ kayitb=true; }
    public void PREMIUM(){
        abidin2++;
        if(abidin2%2==1){
            Kayittürü="Premium";
        }
        else if(abidin2%2==0){
            Kayittürü="Normal";
        }


    }

}