import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();
        Moneda moneda = null;
        int opcion = 0;
        Double monto = 0.0;

        while(opcion != 9) {
            System.out.println("********************************************");
            System.out.println("Bienvenidos a su Casa de Cambios ");
            System.out.println("""
                    1. Dólar a Pesos Chilenos.
                    2. Pesos Chilenos a Dólar.
                    3. Dólar a Bolívares.
                    4. Bolívares a Dólar.
                    5. Dólar a Euro.
                    6. Euro a Dólar.
                    7. Dólar a Libra Esterlina.
                    8. Libra Esterlina a Dólar.
                    9. SALIR.""");
            System.out.println("********************************************");
            System.out.println("Ingrese la opción de su preferencia: ");
            try{
                opcion = Integer.parseInt(scan.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el monto qué desee convertir: ");
                        monto  = Double.parseDouble(scan.nextLine());
                        moneda = consulta.buscaMoneda("USD","CLP", monto);

                        System.out.println("Su monto es de: " + moneda.conversion_result() + " pesos chilenos.");
                        break;
                    case 2:
                        System.out.println("Ingrese el monto qué desee convertir:");
                        monto  = Double.parseDouble(scan.nextLine());
                        moneda = consulta.buscaMoneda("CLP","USD", monto);

                        System.out.println("Su monto es de: " + moneda.conversion_result() + " dólares.");
                        break;
                    case 3:
                        System.out.println("Ingrese el monto qué desee convertir:");
                        monto  = Double.parseDouble(scan.nextLine());
                        moneda = consulta.buscaMoneda("USD","VES", monto);

                        System.out.println("Su monto es de: " + moneda.conversion_result() + " bolívares.");
                        break;
                    case 4:
                        System.out.println("Ingrese el monto qué desee convertir:");
                        monto  = Double.parseDouble(scan.nextLine());
                        moneda = consulta.buscaMoneda("VES","USD", monto);

                        System.out.println("Su monto es de: " + moneda.conversion_result() + " dólares.");
                        break;
                    case 5:
                        System.out.println("Ingrese el monto qué desee convertir:");
                        monto  = Double.parseDouble(scan.nextLine());
                        moneda = consulta.buscaMoneda("USD","EUR", monto);

                        System.out.println("Su monto es de: " + moneda.conversion_result() + " euros.");
                        break;
                    case 6:
                        System.out.println("Ingrese el monto qué desee convertir:");
                        monto  = Double.parseDouble(scan.nextLine());
                        moneda = consulta.buscaMoneda("EUR","USD", monto);

                        System.out.println("Su monto es de: " + moneda.conversion_result() + " dólares.");
                        break;
                    case 7:
                        System.out.println("Ingrese el monto qué desee convertir:");
                        monto  = Double.parseDouble(scan.nextLine());
                        moneda = consulta.buscaMoneda("USD","GBP", monto);

                        System.out.println("Su monto es de: " + moneda.conversion_result() + " libras esterlinas.");
                        break;
                    case 8:
                        System.out.println("Ingrese el monto qué desee convertir:");
                        monto  = Double.parseDouble(scan.nextLine());
                        moneda = consulta.buscaMoneda("GBP","USD", monto);

                        System.out.println("Su monto es de: " + moneda.conversion_result() + " dólares.");
                        break;
                    case 9:
                        break;
                    default:
                        System.out.println("Ingrese un número válido.");
                }
            }catch (NumberFormatException e){
                System.out.println("ERROR: " + e.getMessage());
            }
        }
    }
}
