/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Dsouza
 */
public class Employee {
    private String Name;
    private int EmployeeID;
    private int Age;
    private String Gender;
    private String Startdate;
    private String Level;
    
    private String Positiontitle;
     private Image Photo;
    private String PhotoPath;

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
    
    private Contact contact;

    public String getPhotoPath() {
        return PhotoPath;
    }

    public void setPhotoPath(String PhotoPath) {
        this.PhotoPath = PhotoPath;
    }
    public Image getPhoto() {
        return Photo;
    }

    public void setPhoto(Image Photo) {
        this.Photo = Photo;
    }
 
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getStartdate() {
        return Startdate;
    }

    public void setStartdate(String Startdate) {
        this.Startdate = Startdate;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String Level) {
        this.Level = Level;
    }

    public String getPositiontitle() {
        return Positiontitle;
    }

    public void setPositiontitle(String Positiontitle) {
        this.Positiontitle = Positiontitle;
    }
      
    @Override
    public String toString()
    {
        return Name;
    }
    
            
}
