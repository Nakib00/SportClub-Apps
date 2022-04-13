/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

/**
 *
 * @author Subrata Kumar Dey
 */
public class Person {
    //private String name, gender, bg;
    protected String name, gender, bg;

    public Person() {
        name=gender=bg=null;
    }
    
    public Person(String name, String gender, String bg) {
        this.name = name;
        this.gender = gender;
        this.bg = bg;
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBg() {
        return bg;
    }

    public void setBg(String bg) {
        this.bg = bg;
    }
    
    public void showPersonInfo(){
        System.out.println("Name="+name+", Gender="+gender+", BG="+bg);
    }
    
}
