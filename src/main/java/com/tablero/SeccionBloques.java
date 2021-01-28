package com.tablero;

import com.acciones.*;
import com.bloques.Bloque;
import com.bloques.Individual;
import com.bloques.Secuencial;
import com.factory.*;
import com.personaje.Personaje;

import java.lang.reflect.Type;
import java.util.*;

public class SeccionBloques {

    private final HashMap<String, CrearBloqueIndividual> bloquesDisponibles;

    public SeccionBloques(){
        this.bloquesDisponibles = new HashMap<>();
        bloquesDisponibles.put("BajarLapiz", new BloqueBajaraLapiz());
        bloquesDisponibles.put("LevantarLapiz", new BloqueLevantarLapiz());
        bloquesDisponibles.put("MoverAbajo", new BloqueMoverAbajo());
        bloquesDisponibles.put("MoverArriba", new BloqueMoverArriba());
        bloquesDisponibles.put("MoverIzquierda", new BloqueMoverIzquierda());
        bloquesDisponibles.put("MoverDerecha", new BloqueMoverDerecha());
        /*bloquesDisponibles.put("RepetirDoble", new BloqueRepetirDoble());
        bloquesDisponibles.put("RepetirTriple", new BloqueRepetirTriple());
        bloquesDisponibles.put("Invertir", new BloqueInvertir());*/

    }

    public void agregarBloque (String unNombre,CrearBloqueIndividual unConstructor) {
        bloquesDisponibles.put(unNombre, unConstructor);
    }

    public Bloque buscarBloque (String unNombre) {
        CrearBloqueIndividual unConstructor = bloquesDisponibles.get(unNombre);
        return unConstructor.generarIndividual();
    }
}
