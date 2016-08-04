package com.model;



/**
 * 
 * @decription：系统用户
 * @author MyEclipse Persistence Tools
 */

public class SysUser  implements java.io.Serializable {


    // Fields    

     private Integer yhId;
     private String yhxm;
     private String password;
     private String yhxb;
     private String yhyx;
     private String yhzh;


    // Constructors

    /** default constructor */
    public SysUser() {
    }

	/** minimal constructor */
    public SysUser(Integer yhId) {
        this.yhId = yhId;
    }
    
    /** full constructor */
    public SysUser(Integer yhId, String yhxm, String password, String yhxb, String yhyx, String yhzh) {
        this.yhId = yhId;
        this.yhxm = yhxm;
        this.password = password;
        this.yhxb = yhxb;
        this.yhyx = yhyx;
        this.yhzh = yhzh;
    }

   
    // Property accessors

    public Integer getYhId() {
        return this.yhId;
    }
    
    public void setYhId(Integer yhId) {
        this.yhId = yhId;
    }

    public String getYhxm() {
        return this.yhxm;
    }
    
    public void setYhxm(String yhxm) {
        this.yhxm = yhxm;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getYhxb() {
        return this.yhxb;
    }
    
    public void setYhxb(String yhxb) {
        this.yhxb = yhxb;
    }

    public String getYhyx() {
        return this.yhyx;
    }
    
    public void setYhyx(String yhyx) {
        this.yhyx = yhyx;
    }

    public String getYhzh() {
        return this.yhzh;
    }
    
    public void setYhzh(String yhzh) {
        this.yhzh = yhzh;
    }
   








}