/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;

/**
 *
 * @author Diego Maia
 */
public class Note implements Serializable {
    
    private String title;
    private String content;
    
    public Note(String title, String conten){
        this.setTitle(title);
        this.setContent(content);
    }
    
    public Note(){
        this.setTitle("");
        this.setContent("");
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return this.title;
    }

    public String getContent() {
        return this.content;
    }
    
    
    
}
