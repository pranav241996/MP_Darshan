/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class UserModel {
    private String Name,Password,Email,Country,Contact,secque,secans,imgpath,otpval;   

   ArrayList<String> myblog,img;

    public ArrayList<String> getImg() {
        return img;
    }

    public void setImg(ArrayList<String> img) {
        this.img = img;
    }

    public ArrayList<String> getMyblog() {
        return myblog;
    }

    public void setMyblog(ArrayList<String> myblog) {
        this.myblog = myblog;
    }

  

    public String getOtpval() {
        return otpval;
    }

    public void setOtpval(String otpval) {
        this.otpval = otpval;
    }
 private int id;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String Contact) {
        this.Contact = Contact;
    }

    public String getSecque() {
        return secque;
    }

    public void setSecque(String secque) {
        this.secque = secque;
    }

    public String getSecans() {
        return secans;
    }

    public void setSecans(String secans) {
        this.secans = secans;
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
