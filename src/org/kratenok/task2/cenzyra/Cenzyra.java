package org.kratenok.task2.cenzyra;

public class Cenzyra {
    public String cenzyra(String str){
        return str.replaceAll("бяка" , "<вырезано цензурой>");
    }
}
