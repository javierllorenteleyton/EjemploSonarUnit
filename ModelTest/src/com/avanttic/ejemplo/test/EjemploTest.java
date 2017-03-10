package com.avanttic.ejemplo.test;


import com.avanttic.ejemplo.model.EjemploSonar;

import org.junit.Test;


public class EjemploTest {
    public EjemploTest() {
    }

    @Test
    public void test() {
        EjemploSonar ejemploSonar = new EjemploSonar();
        ejemploSonar.metodo();
        ejemploSonar.getAtributo();
    }
}
