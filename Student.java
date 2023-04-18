/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bytesteams;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class Student implements Serializable{
    String id;
    String name;

    public Student (String id, String name) {
        this.id = id;
        this.name = name;
    }
    
}
