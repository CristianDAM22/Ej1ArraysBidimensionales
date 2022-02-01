package ej1arraysbi_cristiang;

import textoandnumeros.Utilidad;

public class Concesionario {

    Modelo[] modelos;
    String[] tipos;
    float[] limites;
    float[][] beneficios;

    public void inicilizar() {
        tipos = new String[]{
            new String("Turismo"),
            new String("Depostivo"),
            new String("Todo Terreno")
        };
        limites = new float[]{15000f, 30000f, 50000f, 100000f, Float.MAX_VALUE};
        beneficios = new float[][]{
            {0.15f, 0.10f, 0.10f, 0.18f, 0.06f},//Primera fila
            {0.18f, 0.12f, 0.14f, 0.2f, 0.08f},//Segunda fila
            {0.21f, 0.14f, 0.16f, 0.22f, 0.1f}//Tercera fila
        };
    }

    public Concesionario() {
        inicilizar();
        modelos = new Modelo[15];
    }

    public Concesionario(int numModelos) {
        inicilizar();
        modelos = new Modelo[numModelos];
    }

    public void crear() {
        for (int pos = 0; pos < modelos.length; pos++) {
            modelos[pos] = new Modelo();
        }
    }

    public void pedirDatos() {
        int tipo = 0;
        String nombre;

        for (int nmodelo = 0; nmodelo < modelos.length; nmodelo++) {
            nombre = Utilidad.pedirString("Nombre del modelo: ");
            menu();
            tipo = Utilidad.pedirNumeroEntero("Introduce un tipo: ", 0, tipos.length - 1);
            modelos[nmodelo].grabar(nombre, tipo);
        }
    }

    private void menu() {
        for (int tipo = 0; tipo < tipos.length; tipo++) {
            System.out.println(tipo + "---->" + tipos[tipo]);
        }
    }

    public void pedirVentasMes() {
        String[] meses = {"Enero", "Febreo", "Marzo", "Abril", "Mayo", "Junio"};
        float importe;
        float[] ventas;
        for (int nModelo = 0; nModelo < modelos.length; nModelo++) 
        {
            ventas=new float[6];/*Si lo pones fuera del for creat solo 6 pero como lo pones dentro 
                                    crea 6 ventas por cada modelo*/
            System.out.println("MODELOS "+modelos[nModelo].getNombre());
            System.out.println("Ventas");

            for (int mes = 0; mes < modelos[nModelo].getVentas().length; mes++) 
            {
                //importe = Utilidad.pedirNumeroReal(meses[mes] + "\t", 0);
               // modelos[nModelo].setUnaVenta(importe, mes);
                ventas[mes] = Utilidad.pedirNumeroReal(meses[mes] + "\t", 0);
            }
            modelos[nModelo].setVentas(ventas);/*Este set vrea las ventas una vez has pasado todas el set de arriba + lo de modelos
                                                   crea las ventas una por una*/
        }

    }

}
