package com.cafeconpalito.Modelos.Behavioral.template;

public class Main {

    public static void main(String[] args) {

        HtmlHome home = new HtmlHome();
        System.out.println(home.render());

        HtmlAboutUs about = new HtmlAboutUs();
        System.out.println(about.render());
    }
}
