package com.javatpoint.model;
import jdk.internal.org.jline.utils.StyleResolver;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//mark class as an Entity 
@Entity
//defining class name as Table name
@Table
public class A
{
//Defining book id as primary key
@Id
@Column
private int aid;
@Column
private String aname;
@Column
private String department;

public int getAid(){
    return aid;
}
public void setAid(int aid){
    this.aid=aid;
}
    public String getAname(){
        return aid;
    }
    public void setAname(String aname){
        this.aname=aname;
    }
    public String getDepartment(){
        return aid;
    }
    public void setDepartment(String department){
        this.department=department;
    }
}


