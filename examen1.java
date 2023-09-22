package examen;

import java.util.Scanner;

public class examen1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("¿Para cuántos días tienes cifras de ventas? ");
        int numeroDias = 0;
        boolean inputValido = false;
        
       
            try {
                numeroDias = Integer.parseInt(scanner.nextLine());
                if (numeroDias >= 1) {
                    
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Disculpa, el número ingresado es incorrecto. Ingrese un número mayor o igual a 1.");
            }
        }
        
        double ventasTotales = 0;
        
        for (int i = 1; i <= numeroDias; i++) {
            System.out.print("Ingrese las ventas para el día " + i + ": ");
            double ventasDia = 0;
            
            
            
                try {
                    ventasDia = Double.parseDouble(scanner.nextLine());
                    if (ventasDia >= 0) {
                     
                    } else {
                        throw new Exception();
                    }
                } catch (Exception e) {
                    System.out.println("Disculpa, el número ingresado es incorrecto. Ingrese un número mayor o igual a 0.");
                }
            }
            
            ventasTotales += ventasDia;
        }
        
        System.out.println("Las ventas totales son S/ " + ventasTotales);
        
        scanner.close();
        System.exit(0);
    }
}