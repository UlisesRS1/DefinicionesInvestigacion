/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.domain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

/**
 *
 * @author Uli Rodriguez
 */
@Named
@RequestScoped
public class Investigacion {
    private String titulo; // Investigacion
    private String descripcion; // Definicion 
    private String referencia; // Supongo que referencia tipo APA y/o IEEE
    private String foto; // URL

    public Investigacion() {
        this.titulo = "Investigacion";
        this.descripcion = "La investigación se asume como un proceso social que busca dar respuestas a problemas del "
                + "conocimiento, los cuales pueden surgir de la actitud reflexiva y crítica de los sujetos con relación "
                + "a la praxis o a la teoría existente, Es considerada proceso. En cuanto ésta se realiza en forma continua "
                + "y coherente en los diferentes pasos o momentos y apropia o crea un método para la producción de conocimiento. "
                + "Es social y está determinada por las características del contexto y es orientada por sujetos sociales que en "
                + "acciones individuales o colectivas intentan dar respuestas a interrogantes planteados en el campo del saber y del hacer.";
        this.referencia = "(N.d.). Unirioja.Es. Retrieved September 30, 2024, from https://dialnet.unirioja.es/servlet/articulo?codigo=6138488";
        this.foto = "resources/images/investigacion_image.jpg";
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
