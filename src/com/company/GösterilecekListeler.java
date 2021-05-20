package com.company;

import java.util.ArrayList;

public class GösterilecekListeler {
    static private ArrayList<String> bir =new ArrayList<>();
    static private  ArrayList<String> iki =new ArrayList<>();
    static private ArrayList<String> üç =new ArrayList<>();
    static private  ArrayList<String> dört =new ArrayList<>();
    static private  ArrayList<String> beş =new ArrayList<>();

    static private  ArrayList<String> birsanatçı =new ArrayList<>();
    static private  ArrayList<String> ikisanatçı =new ArrayList<>();
    static private  ArrayList<String> üçsanatçı =new ArrayList<>();
    static private ArrayList<String> dörtsanatçı =new ArrayList<>();
    static private  ArrayList<String> beşsanatçı =new ArrayList<>();


    public ArrayList<String> getBir(ArrayList<String> liste) {

       for (int i =0;i<liste.size();i++){
           if (!bir.contains(liste.get(i))){
               bir.add(liste.get(i)) ;
           }
       }

        return bir;
    }

    public ArrayList<String> getİki(ArrayList<String> liste) {

        for (int i =0;i<liste.size();i++){
            if (!iki.contains(liste.get(i))){
                iki.add(liste.get(i)) ;
            }
        }

        return iki;
    }
    public ArrayList<String> getÜç(ArrayList<String> liste) {

        for (int i =0;i<liste.size();i++){
            if (!üç.contains(liste.get(i))){
                üç.add(liste.get(i)) ;
            }
        }

        return üç;
    }
    public ArrayList<String> getdört(ArrayList<String> liste) {

        for (int i =0;i<liste.size();i++){
            if (!dört.contains(liste.get(i))){
                dört.add(liste.get(i)) ;
            }
        }

        return dört;
    }
    public ArrayList<String> getbeş(ArrayList<String> liste) {

        for (int i =0;i<liste.size();i++){
            if (!beş.contains(liste.get(i))){
                beş.add(liste.get(i)) ;
            }
        }

        return beş;
    }
    public ArrayList<String> getbirsanatçı(ArrayList<String> liste) {

        for (int i =0;i<liste.size();i++){
            if (!birsanatçı.contains(liste.get(i))){
                birsanatçı.add(liste.get(i)) ;
            }
        }

        return birsanatçı;
    }
    public ArrayList<String> getbeşsanatçı(ArrayList<String> liste) {

        for (int i =0;i<liste.size();i++){
            if (!beşsanatçı.contains(liste.get(i))){
                beşsanatçı.add(liste.get(i)) ;
            }
        }

        return beşsanatçı;
    }

    public ArrayList<String> getdörtsanatçı(ArrayList<String> liste) {

        for (int i =0;i<liste.size();i++){
            if (!dörtsanatçı.contains(liste.get(i))){
                dörtsanatçı.add(liste.get(i)) ;
            }
        }

        return dörtsanatçı;
    }

    public ArrayList<String> getüçsanatçı(ArrayList<String> liste) {

        for (int i =0;i<liste.size();i++){
            if (!üçsanatçı.contains(liste.get(i))){
                üçsanatçı.add(liste.get(i)) ;
            }
        }

        return üçsanatçı;
    }


    public ArrayList<String> getikisanatçı(ArrayList<String> liste) {

        for (int i =0;i<liste.size();i++){
            if (!ikisanatçı.contains(liste.get(i))){
                ikisanatçı.add(liste.get(i)) ;
            }
        }

        return ikisanatçı;
    }





}
