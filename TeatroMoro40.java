/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teatromoro4.pkg0;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class TeatroMoro40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             String saltoDeLinea = System.lineSeparator();
        Scanner scanner = new Scanner(System.in);
        

        byte entradaElegida;
        String tipoEntradaElegida = "";
        String tarifaEntradaElegida = "";
        double valorEntradaElegida = 0;
        double totalValorEntradaElegida = 0;
        
        int opcionMenuPrincipal;
        int edad;
        String reduccionElegida = "";
        
        boolean eleccion1 = false;
        
        double montoPago;
        double vuelto;
        
        double precioVip = 30000;
        double precioPlateaBaja = 15000;
        double precioPlateaAlta = 18000;
        double precioPalco = 13000;
        

        System.out.println("Hola. Bienvenido/a a la boleteria virtual del teatro Moro." + saltoDeLinea);
        for (int i = 0; ; i++) {
            
            System.out.println("Menu Principal:");
            System.out.println("1. Comprar entrada");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opcion (Escriba 1 o 2): ");
            
            opcionMenuPrincipal = scanner.nextInt();


            switch (opcionMenuPrincipal) {
                case 1 -> {
                    System.out.println("Has seleccionado 'Comprar entrada'.");
                    System.out.println("Por favor, escribe el numero indicado para escoger el tipo de entrada que deseas. (1, 2, 3 o 4.)" + saltoDeLinea + saltoDeLinea+ "=========TIPOS DE ENTRADAS========="  + saltoDeLinea + saltoDeLinea + "1- VIP =================== $" + precioVip + saltoDeLinea + "2- Platea baja =========== $" + precioPlateaBaja + saltoDeLinea + "3- Platea alta =========== $"+precioPlateaAlta + saltoDeLinea + "4- Palco ================= $" + precioPalco);
                    
                    do {
                        entradaElegida = scanner.nextByte();
                        
                        if (entradaElegida == 1) {
                            System.out.println("Has seleccionado una entrada para ingresar al sector VIP." + saltoDeLinea + "valor: $" + precioVip);
                            valorEntradaElegida =  precioVip;
                            tipoEntradaElegida = "Sector VIP";
                        }  
                        else if (entradaElegida == 2) {
                            System.out.println("Has seleccionado una entrada para ingresar a la Platea Baja." + saltoDeLinea + "Valor: $" + precioPlateaBaja);
                            valorEntradaElegida =  precioPlateaBaja;
                            tipoEntradaElegida = "Platea Baja.";
                        }
                        else if (entradaElegida == 3) {
                            System.out.println("Has seleccionado una entrada para ingresar a la Platea Alta." + saltoDeLinea + "Valor: $" + precioPlateaAlta);
                            valorEntradaElegida =  precioPlateaAlta;
                            tipoEntradaElegida = "Platea Alta."; 
                        }
                        else if (entradaElegida == 4) {
                            System.out.println("Has seleccionado una entrada para ingresar a al Palco. +" + saltoDeLinea + "Valor: $" + precioPalco);
                            valorEntradaElegida =  precioPalco;
                            tipoEntradaElegida = "Palco.";
                        }
                        else 
                            System.out.println("Invalido. Ingrgese un numero del 1 al 4.");
                        
                    } while (entradaElegida < 1 || entradaElegida > 4);
                    
                    
                    System.out.println("Por favor, ingrese su edad.");
                    edad = scanner.nextInt();
                    
                    if  (edad<18) {
                        totalValorEntradaElegida = valorEntradaElegida * 0.9;
                        tarifaEntradaElegida = "Estudiantes";
                        reduccionElegida = "10%";
                        System.out.println (" Se ha escogido la tarifa dirigida a estudiantes. Se aplicara un descuento del 10%." + saltoDeLinea);
                    }
                    else if  (edad>64) {
                        totalValorEntradaElegida = valorEntradaElegida * 0.85;
                        tarifaEntradaElegida = "Tercera Edad";
                        reduccionElegida = "15%";
                        System.out.println ("Se ha escogido la tarifa dirigida a la tercera edad. Se aplicara un descuento del 15%." + saltoDeLinea);
                    }
                    
                    else if  (edad >= 18 && edad <= 65) {
                        totalValorEntradaElegida = valorEntradaElegida;
                        System.out.println ("Sin descuento. Se aplicara la tarifa de Publico General."+ saltoDeLinea);
                        tarifaEntradaElegida = "Publico General";
                        reduccionElegida = "0%";
                    }
                    else {
                        System.out.println ("Por favor ingrese un numero");
                    }
                    
                    
                    
                    System.out.println (saltoDeLinea + "======Resumen entrada======" + saltoDeLinea + "Ubicacion del asiento: "+ tipoEntradaElegida + saltoDeLinea + "Tarifa: " + tarifaEntradaElegida + saltoDeLinea + "Precio base de la entrada: $" + valorEntradaElegida + saltoDeLinea + "Descuento aplicado: " + reduccionElegida + saltoDeLinea + "Total de la compra = $" +totalValorEntradaElegida + saltoDeLinea +  saltoDeLinea + "Por favor. Ingrese el monto para realizar el pago.");

                    do {
                        montoPago = scanner.nextDouble();

                        if (montoPago == totalValorEntradaElegida) {
                            System.out.println("Muchas gracias por tu compra en Teatro Moro. Vuelve pronto y disfruta la función.");
                            break;
                        }
                        else if (montoPago > totalValorEntradaElegida) {
                            vuelto = montoPago - totalValorEntradaElegida;
                            System.out.println("Compra realizada con exito." + saltoDeLinea+ "Tu vuelto es: $" + vuelto + saltoDeLinea + saltoDeLinea + "Desea seguir comprando?(ingresa True para intentar de nuevo, o False para salir al Menu Principal)");
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
                        else if (montoPago < totalValorEntradaElegida) {
                            System.out.println("El monto ingresado no es suficiente. El pago no se pudo realizar." + saltoDeLinea + "Desea reintentarlo? (ingresa True para intentar de nuevo, o False para salir al Menu Principal)");
                            eleccion1 = scanner.nextBoolean();

                            if (eleccion1 == true) {
                                System.out.println("Por favor, ingrese el monto para realizar el pago. $" + totalValorEntradaElegida);
                            }
                            else {
                                System.out.println("Muchas gracias. Vuelva pronto." + saltoDeLinea );
                                break;
                            }
                        }
                        else {
                            System.out.println("Ingrese una opción válida. True para intentar de nuevo, False para volver al menú principal");
                        }

                    } while (eleccion1);
                    
                }
            case 2 -> {
                System.out.println("Has seleccionado 'Salir'.");
                System.out.println("Gracias por usar la boleteria virtual de Teatro Moro!");
                return;
                }
            default -> System.out.println("Opcion no valida. Intente nuevamente.");
            }
        }
    }
}
