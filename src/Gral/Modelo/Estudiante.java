/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gral.Modelo;

/**
 *
 * @author Rant AA
 */
public class Estudiante {
    private String NomEs,app,apm,nc,carrera,correo,tel,sex;
private int id;
    public Estudiante(String NomEs, String app, String apm, String nc, String carrera, String correo, String tel,String sex, int id) {
        this.NomEs = NomEs;
        this.app = app;
        this.apm = apm;
        this.nc = nc;
        this.carrera = carrera;
        this.correo = correo;
        this.tel = tel;
        this.sex = sex;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Estudiante() {
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNomEs() {
        return NomEs;
    }

    public void setNomEs(String NomEs) {
        this.NomEs = NomEs;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getApm() {
        return apm;
    }

    public void setApm(String apm) {
        this.apm = apm;
    }

    public String getNc() {
        return nc;
    }

    public void setNc(String nc) {
        this.nc = nc;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return  NomEs + "%" + app + "%" + apm + "%" + nc + "%" + carrera + "%" + correo + "%" + tel ;
    }
    
    
}
