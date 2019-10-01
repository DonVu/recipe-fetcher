/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.recipe.fetcher;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

/**
 *
 * @author don
 */
public class Main {
    public static void main(String[] args) {
        WebClient client = new WebClient();
        client.getOptions().setCssEnabled(false);
        client.getOptions().setJavaScriptEnabled(false);
        try {
            String searchUrl = "https://www.bettycrocker.com/"
                    + "menus-holidays-parties/mhplibrary/recipes/"
                    + "heirloom-recipes-that-are-tried-and-true";
            
            HtmlPage page = client.getPage(searchUrl);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
