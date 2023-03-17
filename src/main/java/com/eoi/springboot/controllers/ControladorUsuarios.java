package com.eoi.springboot.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.log4j.Log4j2;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;


/**
 * The type Controlador usuarios.
 */
@RestController
@Log4j2

public class ControladorUsuarios {

    /**
     * Hola string.
     *
     * @return the string
     */


    @Value("${mensaje.hola}")
    private String mensajehola;
    @Value("${mensaje.pastillas}")
    private String mensajeMedicacion;


    /**
     * Hola string.
     *
     * @return the string
     */
    @GetMapping("${url.hola}")
        String hola() {

            log.warn(mensajehola);
            return mensajehola;

        }

    /**
     * Mi medicacion string.
     *
     * @return the string
     */
    @GetMapping("${url.pastillas}")
        String miMedicacion() {

            log.warn(mensajeMedicacion);
            return mensajeMedicacion;
        }

    }
