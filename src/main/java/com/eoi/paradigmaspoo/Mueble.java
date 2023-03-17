package com.eoi.paradigmaspoo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import lombok.extern.log4j.Log4j2;


/**
 * The type Mueble.
 */
@Component
@Log4j2
public abstract class Mueble extends ObjetoFisico {

    /**
     * Se utiliza para grabar la habitación donde se encuentra el mueble.
     */

    private String habitacion;

    /**
     * The Componentes.
     */


    protected List<ComponenteDeMueble> componentes = new ArrayList<>();


    /**
     * Instantiates a new Mueble.
     *
     * @param nombre   the nombre
     * @param alto     the alto
     * @param ancho    the ancho
     * @param fondo    the fondo
     * @param peso     the peso
     * @param material the material
     */
    protected Mueble(String nombre, int alto, int ancho, int fondo, int peso, String material) {
        super(nombre, alto, ancho, fondo, peso, material);
    }

    /**
     * Instantiates a new Mueble.
     *
     * @param nombre     the nombre
     * @param alto       the alto
     * @param ancho      the ancho
     * @param fondo      the fondo
     * @param peso       the peso
     * @param material   the material
     * @param habitacion the habitacion
     */
    protected Mueble(String nombre, int alto, int ancho, int fondo, int peso, String material, String habitacion) {
        super(nombre, alto, ancho, fondo, peso, material);
        this.habitacion = habitacion;
    }

    /**
     * Gets componentes.
     *
     * @return the componentes
     */
    public List<ComponenteDeMueble> getComponentes() {
        return componentes;
    }

    /**
     * Sets componentes.
     *
     * @param componentes the componentes
     */
    public void setComponentes(List<ComponenteDeMueble> componentes) {
        this.componentes = componentes;
    }

    /**
     * El metodo showInfo muestra la información básica de un mueble
     */
    @Override
    public void showInfo() {
        System.out.println("FICHA DE MUEBLE");
        super.showInfo();
        System.out.println("Numero de componentes: " + componentes.size());
        System.out.println("Listado de Componentes: ");
        componentes.forEach(n ->  {
            ObjetoFisico o =  n;
            o.showInfo();
        });
    }

    /**
     * Pintar mueble
     * @param color - El color solo está disponible en amarillo, rojo, azul y verde
     * @return Devuelve un mensaje confirmando el color pintado
     */
    public String pintarMueble(String color){
        log.warn("El mueble ha sido pintado");
        return "El mueble ha sido pintado de " + color;


    }
}
