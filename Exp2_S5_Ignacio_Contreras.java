/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teatromorosemana5;
import java.util.Scanner;
/**
 *
 * @author ignac
 */
public class TeatroMoroSemana5 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        String saltoDeLinea = System.lineSeparator();
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        int entradasSolicitadas;
        int entradasConfirmadas = 0;
        byte entradaElegida;
        String tipoEntradaElegida = "";
        String tarifaEntradaElegida = "";
        double valorEntradaElegida = 0;
        double totalValorEntradaElegida = 0;
        
        int seguirComprando = 1;
        int opcionMenuPrincipal;
        int promocion = 0;
        String reduccionElegida = "";
        
        boolean eleccion1 = false;       
        
        final double precioVip = 30000;
        final double precioPlateaBaja = 15000;
        final double precioPlateaAlta = 18000;
        final double precioPalco = 13000;
        
        int filasVip = 3;
        int asientosVip = 4;
        int filasPlateaBaja = 3;
        int asientosPlateaBaja = 8;
        int filasPlateaAlta = 3;
        int asientosPlateaAlta = 12;
        int columnasPalco = 4;
        int asientosPalco = 8;
        
        
        boolean[] filaVip1 = new boolean [asientosVip];
        boolean[] filaVip2 = new boolean [asientosVip];    
        boolean[] filaVip3 = new boolean [asientosVip]; 
        boolean[] filaPlateaBaja1 = new boolean [asientosPlateaBaja];
        boolean[] filaPlateaBaja2 = new boolean [asientosPlateaBaja];
        boolean[] filaPlateaBaja3 = new boolean [asientosPlateaBaja];
        boolean[] filaPlateaAlta1 = new boolean [asientosPlateaAlta];
        boolean[] filaPlateaAlta2 = new boolean [asientosPlateaAlta];
        boolean[] filaPlateaAlta3 = new boolean [asientosPlateaAlta];
        boolean[] columnapalco1 = new boolean [asientosPalco];
        boolean[] columnapalco2 = new boolean [asientosPalco];        
        boolean[] columnapalco3 = new boolean [asientosPalco];
        boolean[] columnapalco4 = new boolean [asientosPalco];
        
        boolean[] filaActual = null; 
        int filaSeleccionada1 = -1;
        boolean[] filaSeleccionada2 = null;
        int asientoSel = 0;
        
        int j = 0;
        String[] carrito = new String[99];
        String[] historialDescuento = new String[99];
        int[] cantidadesPorEntrada = new int[99];    
        double[] historialPrecio = new double[99];
        double montoPago;
        double totalCompras = 0;
        double vuelto;
        int menuCarrito;
        
        
        for (int indice = 0; indice < 10; indice++) {
        }

        
        

        System.out.println("Hola. Bienvenido/a a la boleteria virtual del teatro Moro.");
        for (int i = 0; ; i++) {
            
            System.out.println(saltoDeLinea+"Menu Principal:"); 
            System.out.println("1. Comprar entrada");
            System.out.println("2. Ver Promociones"); 
            System.out.println("3. Ver asientos disponibles");
            System.out.println("4. Ver carrito");   
            System.out.println("5. Salir");
            System.out.print(saltoDeLinea+ "Seleccione una opcion (Escriba 1, 2, 3, 4, o 5): ");
            
            opcionMenuPrincipal = scanner.nextInt();


            switch (opcionMenuPrincipal) {
                case 1 -> {
                    seguirComprando = 1;
                    while (seguirComprando == 1) {
                    System.out.println("Has seleccionado 'Comprar entrada'.");
                    System.out.println("Por favor, escribe el numero indicado para escoger el tipo de entrada que deseas. (1, 2, 3 o 4.)" + saltoDeLinea + saltoDeLinea+ "=========TIPOS DE ENTRADAS========="  + saltoDeLinea + saltoDeLinea + "1- VIP =================== $" + precioVip + saltoDeLinea + "2- Platea baja =========== $" + precioPlateaBaja + saltoDeLinea + "3- Platea alta =========== $"+precioPlateaAlta + saltoDeLinea + "4- Palco ================= $" + precioPalco);
                    
                        do {
                            entradaElegida = scanner.nextByte();

                            switch (entradaElegida) {
                                case 1 -> {
                                    entradasConfirmadas=0;
                                    System.out.println("Has seleccionado una entrada para ingresar al sector VIP." + saltoDeLinea + "valor: $" + precioVip + saltoDeLinea + saltoDeLinea +  "Cuantas entradas de tipo VIP desea comprar?");                                
                                    entradasSolicitadas = scanner.nextInt();                                
                                    asientoSel = 0;
                                    System.out.println("(Plano de la sala (X = ocupado, O = libre)");

                                        for (int f = 1; f <= filasVip; f++) {
                                            switch (f) {
                                                case 1 -> filaActual = filaVip1;
                                                case 2 -> filaActual = filaVip2;
                                                case 3 -> filaActual = filaVip3;
                                                default -> {
                                                }
                                            }

                                        System.out.print("Fila " + f + ": ");    

                                            for (int a = 0; a < asientosVip; a++) {
                                                if (filaActual[a]) System.out.print("[X]");
                                                else System.out.print("[O]");
                                            }                                
                                            System.out.println();
                                        }

                                        while (entradasConfirmadas < entradasSolicitadas) {
                                            System.out.print("\nSeleccione una fila (1-" + filasVip + ") o 0 para salir: ");


                                            if (sc.hasNextInt()) {
                                                filaSeleccionada1 = sc.nextInt(); 
                                            } else {
                                                sc.next();
                                                System.out.println("Por favor, ingrese un número válido.");
                                              continue;
                                            }

                                            if (filaSeleccionada1 == 0) {
                                              break;
                                            }   


                                            if (filaSeleccionada1 < 1 || filaSeleccionada1 > filasVip) {
                                                System.out.println("Fila inválida.");
                                              continue;
                                            }

                                            System.out.print("Seleccione un asiento (1-" + asientosVip + "): ");

                                            asientoSel = sc.nextInt();

                                            if (asientoSel < 1 || asientoSel > asientosVip) {
                                                System.out.println("Asiento inválido.");
                                              continue;
                                            }                                


                                        switch (filaSeleccionada1) {
                                            case 1 -> filaSeleccionada2 = filaVip1;
                                            case 2 -> filaSeleccionada2 = filaVip2;
                                            case 3 -> filaSeleccionada2 = filaVip3;
                                            default -> {
                                            }
                                        }


                                            if (filaSeleccionada2[asientoSel - 1]) {
                                              System.out.println("Ese asiento ya está ocupado.");
                                            continue;
                                            } else {
                                              filaSeleccionada2[asientoSel - 1] = true;
                                              System.out.println("Reserva exitosa: Fila " + filaSeleccionada1 + " – Asiento " + asientoSel);
                                            }

                                            for (int f = 1; f <= filasVip; f++) {
                                                switch (f) {
                                                    case 1 -> filaActual = filaVip1;
                                                    case 2 -> filaActual = filaVip2;
                                                    case 3 -> filaActual = filaVip3;
                                                    default -> {
                                                    }
                                                }      

                                            System.out.print("Fila " + f + ": ");    

                                                for (int a = 0; a < asientosVip; a++) {
                                                    if (filaActual[a]) System.out.print("[X]");
                                                    else System.out.print("[O]");
                                                }                                
                                                System.out.println();
                                            }                                




                                            valorEntradaElegida =  precioVip;
                                            tipoEntradaElegida = "Sector VIP";




                                            System.out.println("Desea comprar esta entrada con un descuento de promocion?" + saltoDeLinea+ "(Escriba 1 para Estudiantes, 2 para Tercera edad. 0 Para no aplicar promocion.)");
                                            promocion = scanner.nextInt();

                                            switch (promocion) {
                                                case 1 -> {
                                                    totalValorEntradaElegida = valorEntradaElegida * 0.9;
                                                    tarifaEntradaElegida = "Estudiantes";
                                                    reduccionElegida = "10%";
                                                    System.out.println (" Se ha escogido la tarifa dirigida a estudiantes. Se aplicara un descuento del 10%." + saltoDeLinea);

                                                }
                                                case 2 -> {
                                                    totalValorEntradaElegida = valorEntradaElegida * 0.85;
                                                    tarifaEntradaElegida = "Tercera Edad";
                                                    reduccionElegida = "15%";
                                                    System.out.println ("Se ha escogido la tarifa dirigida a la tercera edad. Se aplicara un descuento del 15%." + saltoDeLinea);
                                                }

                                                case 0 -> {
                                                    totalValorEntradaElegida = valorEntradaElegida;
                                                    System.out.println ("Sin descuento. Se aplicara la tarifa de Publico General."+ saltoDeLinea);
                                                    tarifaEntradaElegida = "Publico General";
                                                    reduccionElegida = "0%";
                                                }

                                                default -> {
                                                    System.out.println ("Por favor ingrese un numero valido");
                                                }
                                            }

                                                carrito[j] = tipoEntradaElegida;
                                                cantidadesPorEntrada[j] = entradasSolicitadas;
                                                historialPrecio[j] = totalValorEntradaElegida;
                                                historialDescuento[j] = tarifaEntradaElegida;
                                                totalCompras += totalValorEntradaElegida;
                                                j= j+1;
                                                entradasConfirmadas++;

                                        }
                                            System.out.println("Desea seguir comprando entradas? (1 = Si, 2 = No, volver al menu principal)");
                                            seguirComprando = scanner.nextInt();                             
                                }

                                case 2 -> {
                                    entradasConfirmadas=0;
                                    System.out.println("Has seleccionado una entrada para ingresar al sector Platea Baja." + saltoDeLinea + "valor: $" + precioPlateaBaja + saltoDeLinea + saltoDeLinea +  "Cuantas entradas de tipo Platea Baja desea comprar?");
                                    entradasSolicitadas = scanner.nextInt(); 
                                    asientoSel = 0;                                                                   
                                    System.out.println("(Plano de la sala (X = ocupado, O = libre)");

                                    for (int f = 1; f <= filasPlateaBaja; f++) {
                                        switch (f) {
                                            case 1 -> filaActual = filaPlateaBaja1;
                                            case 2 -> filaActual = filaPlateaBaja2;
                                            case 3 -> filaActual = filaPlateaBaja3;
                                            default -> {
                                            }
                                        }

                                    System.out.print("Fila " + f + ": ");    

                                        for (int a = 0; a < asientosPlateaBaja; a++) {
                                            if (filaActual[a]) System.out.print("[X]");
                                            else System.out.print("[O]");
                                        }                                
                                        System.out.println();
                                    }
                                    while (entradasConfirmadas < entradasSolicitadas) {
                                        System.out.print("\nSeleccione una fila (1-" + filasPlateaBaja + ") o 0 para salir: ");


                                        if (sc.hasNextInt()) {
                                            filaSeleccionada1 = sc.nextInt(); 
                                        } else {
                                            sc.next();
                                            System.out.println("Por favor, ingrese un número válido.");
                                          continue;
                                        }

                                        if (filaSeleccionada1 == 0) {
                                          break;
                                        }   


                                        if (filaSeleccionada1 < 1 || filaSeleccionada1 > filasPlateaBaja) {
                                            System.out.println("Fila inválida.");
                                          continue;
                                        }

                                        System.out.print("Seleccione un asiento (1-" + asientosPlateaBaja + "): ");

                                        asientoSel = sc.nextInt();

                                        if (asientoSel < 1 || asientoSel > asientosPlateaBaja) {
                                            System.out.println("Asiento inválido.");
                                          continue;
                                        }                                

                                    switch (filaSeleccionada1) {
                                        case 1 -> filaSeleccionada2 = filaPlateaBaja1;
                                        case 2 -> filaSeleccionada2 = filaPlateaBaja2;
                                        case 3 -> filaSeleccionada2 = filaPlateaBaja3;
                                        default -> {
                                        }
                                    }

                                        if (filaSeleccionada2[asientoSel - 1]) {
                                          System.out.println("Ese asiento ya está ocupado.");
                                        continue;
                                        } else {
                                          filaSeleccionada2[asientoSel - 1] = true;                                    
                                          System.out.println("Reserva exitosa: Fila " + filaSeleccionada1 + " – Asiento " + asientoSel);
                                        }

                                        for (int f = 1; f <= filasPlateaBaja; f++) {
                                            switch (f) {
                                                case 1 -> filaActual = filaPlateaBaja1;
                                                case 2 -> filaActual = filaPlateaBaja2;
                                                case 3 -> filaActual = filaPlateaBaja3;
                                                default -> {
                                                }
                                            }      

                                        System.out.print("Fila " + f + ": ");    

                                            for (int a = 0; a < asientosPlateaBaja; a++) {
                                                if (filaActual[a]) System.out.print("[X]");
                                                else System.out.print("[O]");
                                            }                                
                                            System.out.println();
                                        }

                                        valorEntradaElegida =  precioPlateaBaja;
                                        tipoEntradaElegida = "Platea Baja.";

                                        System.out.println("Desea comprar esta entrada con un descuento de promocion?" + saltoDeLinea+ "(Escriba 1 para Estudiantes, 2 para Tercera edad. 0 Para no aplicar promocion.)");
                                        promocion = scanner.nextInt();

                                        switch (promocion) {
                                            case 1 -> {
                                                totalValorEntradaElegida = valorEntradaElegida * 0.9;
                                                tarifaEntradaElegida = "Estudiantes";
                                                reduccionElegida = "10%";
                                                System.out.println (" Se ha escogido la tarifa dirigida a estudiantes. Se aplicara un descuento del 10%." + saltoDeLinea);
                                                break;
                                            }
                                            case 2 -> {
                                                totalValorEntradaElegida = valorEntradaElegida * 0.85;
                                                tarifaEntradaElegida = "Tercera Edad";
                                                reduccionElegida = "15%";
                                                System.out.println ("Se ha escogido la tarifa dirigida a la tercera edad. Se aplicara un descuento del 15%." + saltoDeLinea);
                                            }

                                            case 0 -> {
                                                totalValorEntradaElegida = valorEntradaElegida;
                                                System.out.println ("Sin descuento. Se aplicara la tarifa de Publico General."+ saltoDeLinea);
                                                tarifaEntradaElegida = "Publico General";
                                                reduccionElegida = "0%";
                                            }

                                            default -> {
                                                System.out.println ("Por favor ingrese un numero valido");
                                            }

                                        }                                    
                                            carrito[j] = tipoEntradaElegida;
                                            cantidadesPorEntrada[j] = entradasSolicitadas;
                                            historialPrecio[j] = totalValorEntradaElegida;
                                            historialDescuento[j] = tarifaEntradaElegida;
                                            totalCompras += totalValorEntradaElegida;
                                            j= j+1;
                                            entradasConfirmadas++;
                                    }   
                                            System.out.println("Desea seguir comprando entradas? (1 = Si, 2 = No, volver al menu principal)");
                                            seguirComprando = scanner.nextInt();   
                                }
                                case 3 -> {
                                    entradasConfirmadas=0;                                
                                    System.out.println("Has seleccionado una entrada para ingresar al sector Platea Alta." + saltoDeLinea + "valor: $" + precioPlateaAlta + saltoDeLinea + saltoDeLinea +  "Cuantas entradas de tipo Platea Alta desea comprar?");
                                    entradasSolicitadas = scanner.nextInt();                                
                                    asientoSel = 0;
                                    System.out.println("(Plano de la sala (X = ocupado, O = libre)");

                                    for (int f = 1; f <= filasPlateaAlta; f++) {

                                        switch (f) {
                                            case 1 -> filaActual = filaPlateaAlta1;
                                            case 2 -> filaActual = filaPlateaAlta2;
                                            case 3 -> filaActual = filaPlateaAlta3;
                                            default -> {
                                            }
                                        }

                                    System.out.print("Fila " + f + ": ");    

                                        for (int a = 0; a < asientosPlateaAlta; a++) {
                                            if (filaActual[a]) System.out.print("[X]");
                                            else System.out.print("[O]");
                                        }                                
                                        System.out.println();
                                    }                               

                                    while (entradasConfirmadas < entradasSolicitadas) {

                                        System.out.print("\nSeleccione una fila (1-" + filasPlateaAlta + ") o 0 para salir: ");


                                        if (sc.hasNextInt()) {
                                            filaSeleccionada1 = sc.nextInt(); 
                                        } else {
                                            sc.next();
                                            System.out.println("Por favor, ingrese un número válido.");
                                          continue;
                                        }

                                        if (filaSeleccionada1 == 0) {
                                          break;
                                        }   


                                        if (filaSeleccionada1 < 1 || filaSeleccionada1 > filasPlateaAlta) {
                                            System.out.println("Fila inválida.");
                                          continue;
                                        }

                                        System.out.print("Seleccione un asiento (1-" + asientosPlateaAlta + "): ");

                                        asientoSel = sc.nextInt();

                                        if (asientoSel < 1 || asientoSel > asientosPlateaAlta) {
                                            System.out.println("Asiento inválido.");
                                          continue;
                                        }                                


                                    switch (filaSeleccionada1) {
                                        case 1 -> filaSeleccionada2 = filaPlateaAlta1;
                                        case 2 -> filaSeleccionada2 = filaPlateaAlta2;
                                        case 3 -> filaSeleccionada2 = filaPlateaAlta3;
                                        default -> {
                                        }
                                    }

                                        if (filaSeleccionada2[asientoSel - 1]) {
                                          System.out.println("Ese asiento ya está ocupado.");
                                        continue;
                                        } else {
                                          filaSeleccionada2[asientoSel - 1] = true;
                                          System.out.println("Reserva exitosa: Fila " + filaSeleccionada1 + " – Asiento " + asientoSel);
                                        }

                                        for (int f = 1; f <= filasPlateaAlta; f++) {
                                            switch (f) {
                                                case 1 -> filaActual = filaPlateaAlta1;
                                                case 2 -> filaActual = filaPlateaAlta2;
                                                case 3 -> filaActual = filaPlateaAlta3;
                                                default -> {
                                                }
                                            }      

                                        System.out.print("Fila " + f + ": ");    

                                            for (int a = 0; a < asientosPlateaAlta; a++) {
                                                if (filaActual[a]) System.out.print("[X]");
                                                else System.out.print("[O]");
                                            }                                
                                            System.out.println();
                                        }


                                        valorEntradaElegida =  precioPlateaAlta;
                                        tipoEntradaElegida = "Platea Alta.";

                                        System.out.println("Desea comprar esta entrada con un descuento de promocion?" + saltoDeLinea+ "(Escriba 1 para Estudiantes, 2 para Tercera edad. 0 Para no aplicar promocion.)");
                                        promocion = scanner.nextInt();

                                        switch (promocion) {
                                            case 1 -> {
                                                totalValorEntradaElegida = valorEntradaElegida * 0.9;
                                                tarifaEntradaElegida = "Estudiantes";
                                                reduccionElegida = "10%";
                                                System.out.println (" Se ha escogido la tarifa dirigida a estudiantes. Se aplicara un descuento del 10%." + saltoDeLinea);
                                                break;
                                            }
                                            case 2 -> {
                                                totalValorEntradaElegida = valorEntradaElegida * 0.85;
                                                tarifaEntradaElegida = "Tercera Edad";
                                                reduccionElegida = "15%";
                                                System.out.println ("Se ha escogido la tarifa dirigida a la tercera edad. Se aplicara un descuento del 15%." + saltoDeLinea);
                                            }

                                            case 0 -> {
                                                totalValorEntradaElegida = valorEntradaElegida;
                                                System.out.println ("Sin descuento. Se aplicara la tarifa de Publico General."+ saltoDeLinea);
                                                tarifaEntradaElegida = "Publico General";
                                                reduccionElegida = "0%";
                                            }

                                            default -> {
                                                System.out.println ("Por favor ingrese un numero valido");
                                            }                                      
                                        }
                                            carrito[j] = tipoEntradaElegida;
                                            cantidadesPorEntrada[j] = entradasSolicitadas;
                                            historialPrecio[j] = totalValorEntradaElegida;
                                            historialDescuento[j] = tarifaEntradaElegida;
                                            totalCompras += totalValorEntradaElegida;
                                            j= j+1;
                                            entradasConfirmadas++;                                    
                                    }    
                                            System.out.println("Desea seguir comprando entradas? (1 = Si, 2 = No, volver al menu principal)");
                                            seguirComprando = scanner.nextInt();   
                                }
                                case 4 -> {
                                    entradasConfirmadas=0;                                
                                    System.out.println("Desea comprar esta entrada con un descuento de promocion?" + saltoDeLinea+ "(Escriba 1 para Estudiantes, 2 para Tercera edad. 0 Para no aplicar promocion.)");
                                    entradasSolicitadas = scanner.nextInt();                                
                                    asientoSel = 0;
                                    System.out.println("(Plano de la sala (X = ocupado, O = libre)");

                                    for (int f = 1; f <= columnasPalco; f++) {

                                        switch (f) {
                                            case 1 -> filaActual = columnapalco1;
                                            case 2 -> filaActual = columnapalco2;
                                            case 3 -> filaActual = columnapalco3;
                                            case 4 -> filaActual = columnapalco4;
                                            default -> {
                                            }
                                        }

                                    System.out.print("Fila " + f + ": ");    

                                        for (int a = 0; a < asientosPalco; a++) {
                                            if (filaActual[a]) System.out.print("[X]");
                                            else System.out.print("[O]");
                                        }                                
                                        System.out.println();
                                    }

                                    while (entradasConfirmadas < entradasSolicitadas) {


                                        System.out.print("\nSeleccione una fila (1-" + columnasPalco + ") o 0 para salir: ");


                                        if (sc.hasNextInt()) {
                                            filaSeleccionada1 = sc.nextInt(); 
                                        } else {
                                            sc.next();
                                            System.out.println("Por favor, ingrese un número válido.");
                                          continue;
                                        }

                                        if (filaSeleccionada1 == 0) {
                                          break;
                                        }   


                                        if (filaSeleccionada1 < 1 || filaSeleccionada1 > columnasPalco) {
                                            System.out.println("Fila inválida.");
                                          continue;
                                        }

                                        System.out.print("Seleccione un asiento (1-" + asientosPalco + "): ");

                                        asientoSel = sc.nextInt();

                                        if (asientoSel < 1 || asientoSel > asientosPalco) {
                                            System.out.println("Asiento inválido.");
                                          continue;
                                        }                                


                                        switch (filaSeleccionada1) {
                                            case 1 -> filaSeleccionada2 = columnapalco1;
                                            case 2 -> filaSeleccionada2 = columnapalco2;
                                            case 3 -> filaSeleccionada2 = columnapalco3;
                                            default -> {
                                            }
                                        }

                                        if (filaSeleccionada2[asientoSel - 1]) {
                                          System.out.println("Ese asiento ya está ocupado.");
                                        continue;
                                        } else {
                                          filaSeleccionada2[asientoSel - 1] = true;
                                          System.out.println("Reserva exitosa: Fila " + filaSeleccionada1 + " – Asiento " + asientoSel);
                                        }

                                        for (int f = 1; f <= columnasPalco; f++) {
                                            switch (f) {
                                                case 1 -> filaActual = columnapalco1;
                                                case 2 -> filaActual = columnapalco2;
                                                case 3 -> filaActual = columnapalco3;
                                                case 4 -> filaActual = columnapalco4;
                                                default -> {
                                                }
                                            }      

                                        System.out.print("Fila " + f + ": ");    

                                            for (int a = 0; a < asientosPalco; a++) {
                                                if (filaActual[a]) System.out.print("[X]");
                                                else System.out.print("[O]");
                                            }                                
                                            System.out.println();
                                        }                                


                                        valorEntradaElegida =  precioPalco;
                                        tipoEntradaElegida = "Palco.";

                                        System.out.println("Desea comprar esta entrada con un descuento de promocion? (1 para Estudiantes, 2 para Tercera edad. 0 Para no aplicar promocion.)");
                                        promocion = scanner.nextInt();

                                        switch (promocion) {
                                            case 1 -> {
                                                totalValorEntradaElegida = valorEntradaElegida * 0.9;
                                                tarifaEntradaElegida = "Estudiantes";
                                                reduccionElegida = "10%";
                                                System.out.println (" Se ha escogido la tarifa dirigida a estudiantes. Se aplicara un descuento del 10%." + saltoDeLinea);
                                                break;
                                            }
                                            case 2 -> {
                                                totalValorEntradaElegida = valorEntradaElegida * 0.85;
                                                tarifaEntradaElegida = "Tercera Edad";
                                                reduccionElegida = "15%";
                                                System.out.println ("Se ha escogido la tarifa dirigida a la tercera edad. Se aplicara un descuento del 15%." + saltoDeLinea);
                                            }

                                            case 0 -> {
                                                totalValorEntradaElegida = valorEntradaElegida;
                                                System.out.println ("Sin descuento. Se aplicara la tarifa de Publico General."+ saltoDeLinea);
                                                tarifaEntradaElegida = "Publico General";
                                                reduccionElegida = "0%";
                                            }

                                            default -> {
                                                System.out.println ("Por favor ingrese un numero valido");
                                            }
                                        }
                                            carrito[j] = tipoEntradaElegida;
                                            cantidadesPorEntrada[j] = entradasSolicitadas;
                                            historialPrecio[j] = totalValorEntradaElegida;
                                            historialDescuento[j] = tarifaEntradaElegida;
                                            totalCompras += totalValorEntradaElegida;
                                            j= j+1;
                                            entradasConfirmadas++;  
                                    }   
                                            System.out.println("Desea seguir comprando entradas? (1 = Si, 2 = No, volver al menu principal)");
                                            seguirComprando = scanner.nextInt();                                       
                                }

                                default -> System.out.println("Invalido. Ingrgese un numero del 1 al 4.");
                            }

                        } while (entradaElegida < 1 || entradaElegida > 4);
                    
                    }
                }
                case 2 -> {
                    seguirComprando = 1;
                    while (seguirComprando == 1) {
                        System.out.println(saltoDeLinea+"===========================" +saltoDeLinea+ "Has seleccionado 'Ver Promociones:'"+saltoDeLinea+ saltoDeLinea+ "- Descuento del 10% dirigido a estudiantes" + saltoDeLinea+ "- Descuento del 15% dirigido a adultos mayores" + saltoDeLinea);


                        System.out.println("Escriba 2 para volver al Menu Principal)");
                        seguirComprando = scanner.nextInt();                          

                        System.out.println("Volviendo..."+ saltoDeLinea+ "==========================="+ saltoDeLinea);
                    }
                }
                case 3 -> {
                    seguirComprando = 1;
                    while (seguirComprando == 1) {
                        System.out.println( saltoDeLinea+ "                    ========= Asientos disponibles ========="+ saltoDeLinea);

                        for (int f = 1; f <= filasVip; f++) {
                            switch (f) {
                                case 1 -> filaActual = filaVip1;
                                case 2 -> filaActual = filaVip2;
                                case 3 -> filaActual = filaVip3;
                                default -> {
                                }
                        }

                    System.out.print("Fila VIP" + f + ":                        ");    

                        for (int a = 0; a < asientosVip; a++) {
                            if (filaActual[a]) System.out.print("[X]");
                            else System.out.print("[O]");
                        }                                
                        System.out.println();
                    }

                    for (int f = 1; f <= filasPlateaBaja; f++) {
                        switch (f) {
                            case 1 -> filaActual = filaPlateaBaja1;
                            case 2 -> filaActual = filaPlateaBaja2;
                            case 3 -> filaActual = filaPlateaBaja3;
                            default -> {
                            }
                        }

                    System.out.print("Fila Platea Baja" + f + ":          ");    

                        for (int a = 0; a < asientosPlateaBaja; a++) {
                            if (filaActual[a]) System.out.print("[X]");
                            else System.out.print("[O]");
                        }                                
                        System.out.println();
                    }

                    for (int f = 1; f <= filasPlateaAlta; f++) {

                        switch (f) {
                            case 1 -> filaActual = filaPlateaAlta1;
                            case 2 -> filaActual = filaPlateaAlta2;
                            case 3 -> filaActual = filaPlateaAlta3;
                            default -> {
                            }
                        }

                    System.out.print("Fila Platea Alta" + f + ":    ");    

                        for (int a = 0; a < asientosPlateaAlta; a++) {
                            if (filaActual[a]) System.out.print("[X]");
                            else System.out.print("[O]");
                        }                                
                        System.out.println();
                    }   
                    
                    System.out.println(saltoDeLinea+ "Escriba 2 para volver al Menu Principal)");
                    seguirComprando = scanner.nextInt();                          

                    System.out.println("Volviendo..."+ saltoDeLinea+ "===========================");                    
                }
            }    
 
                case 4 -> {
                    seguirComprando = 1;
                    while (seguirComprando == 1) {                    
                    
                        System.out.println( saltoDeLinea + "======Carrito de Compras======" + saltoDeLinea );

                        System.out.println("Contenido del carrito:");
                        
                        for (int k = 0; k < carrito.length; k++) {
                            if (carrito[k] != null) {
                                System.out.println("[" + (k + 1) + "] " + carrito[k] +" "+ historialDescuento[k]+" $"+ historialPrecio[k]);
                            }
                        }
                        
                        System.out.println("Escriba 1 para Pagar, o 2 Salir.");
                        menuCarrito = scanner.nextInt();  
                            
                        if (menuCarrito == 2) {  
                                       
                            System.out.println("Volviendo..."+ saltoDeLinea+ "===========================");  
                        break;    
         
                            
                        } else if (menuCarrito ==1) {
                            
                            System.out.println("Total de la compra = $" + totalCompras + saltoDeLinea + "Por favor. Ingrese el monto para realizar el pago.");
                            montoPago = scanner.nextDouble();

                            if (montoPago == totalCompras) {
                                System.out.println("Muchas gracias por tu compra en Teatro Moro. Desea seguir comprando?(ingresa True para volver al Menu Principal, o False para salir)");
                                eleccion1 = scanner.nextBoolean();    

                                if (eleccion1 == true){
                                    System.out.println("Volviendo al Menu Principal..." + saltoDeLinea);
                                }
                                else if (eleccion1 == false) {
                                    System.out.println("Muchas gracias por su compra. Vuelva pronto" + saltoDeLinea);
                                    System.exit(0);
                                }
                                break;
                            }
                            else if (montoPago > totalCompras) {
                                vuelto = montoPago - totalCompras;
                                System.out.println("Compra realizada con exito." + saltoDeLinea+ "Tu vuelto es: $" + vuelto + saltoDeLinea + saltoDeLinea + "Desea seguir comprando?(ingresa True para volver al Menu Principal, o False para salir)");
                                eleccion1 = scanner.nextBoolean();    

                                if (eleccion1 == true){
                                    System.out.println("Volviendo al Menu Principal..." + saltoDeLinea);
                                }
                                else if (eleccion1 == false) {
                                    System.out.println("Muchas gracias por su compra. Vuelva pronto" + saltoDeLinea);
                                    System.exit(0);
                                }
                                break;
                            }
                            else if (montoPago < totalCompras) {
                                System.out.println("El monto ingresado no es suficiente. El pago no se pudo realizar." + saltoDeLinea + "Desea reintentarlo? (ingresa True para volver al Menu Principal, o False para salir)");
                                eleccion1 = scanner.nextBoolean();

                                if (eleccion1 == true) {
                                    System.out.println("Por favor, ingrese el monto para realizar el pago. $" + totalCompras);
                                }
                                else {
                                    System.out.println("Muchas gracias. Vuelva pronto." + saltoDeLinea );
                                    break;
                                }
                            }
                            else {
                                System.out.println("Ingrese una opción válida. True para intentar de nuevo, False para volver al menú principal");
                            }                            
                            
                        }                                                                       
                    }                  
                }
                
                case 5 -> {
                    System.out.println("Muchas gracias por por utilizar el sistema vitual de Teatro Moro. Vuelva pronto" + saltoDeLinea);
                    return;
                    }
                
            default -> System.out.println("Opcion no valida. Intente nuevamente.");
            }
        }
    }
}