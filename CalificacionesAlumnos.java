public class CalificacionesAlumnos {

    // Atributos para el nombre y las 5 calificaciones
    String nombre;
    int[] calificaciones = new int[5];
    
    // Método 1: Recibe el arreglo de calificaciones y regresa el promedio final
    public double calcularPromedio(int[] arregloCalif) {
        double suma = 0;
        
        // Sumamos cada valor del arreglo usando un ciclo for 
        for (int i = 0; i < arregloCalif.length; i++) {
            suma += arregloCalif[i];
        }

        // Regresamos el resultado de dividir la suma total entre las 5 calificaciones
        return suma / 5;
}

// Método 2: Evalúa el promedio obtenido y regresa la letra según la tabla de rangos
public char obtenerLetra(double promedio) {
    if (promedio <= 50) {
        return 'F';
    } else if (promedio >= 51 && promedio <=60) {
        return 'E';
    } else if (promedio >= 61 && promedio <=70) {
        return 'D';
    } else if (promedio >= 71 && promedio <=80) {
        return 'C';
    } else if (promedio >= 81 && promedio <=90) {
        return 'B';
    } else {
        return 'A'; // Calificación excelente de 91 a 100
    }
}

// Método 3: Imprime los resultados en pantalla 
public void mostrarResultados(String nom, double prom, char letra) {
    System.out.println("Nombre del estudiante: " + nom);
    System.out.println("Calificación 1: " + calificaciones[0]);
    System.out.println("Calificación 2: " + calificaciones[1]);
    System.out.println("Calificación 3: " + calificaciones[2]);
    System.out.println("Calificación 4: " + calificaciones[3]);
    System.out.println("Calificación 5: " + calificaciones[4]);
    System.out.println("Promedio: " + prom);
    System.out.println("Calificación: " + letra);

}

// Método principal para correr y probar el programa en la consola
    public static void main(String[] args) {
        // Creamos el objeto del alumno
        CalificacionesAlumnos alumno = new CalificacionesAlumnos();
        
        // Asignamos el nombre y las 5 calificaciones de ejemplo
        alumno.nombre = "Argenis Casiano Chino";
        alumno.calificaciones[0] = 100;
        alumno.calificaciones[1] = 99;
        alumno.calificaciones[2] = 99;
        alumno.calificaciones[3] = 98;
        alumno.calificaciones[4] = 97;

        // Llamamos al método para calcular el promedio
        double miPromedio = alumno.calcularPromedio(alumno.calificaciones);

        // Llamamos al método para obtener la letra correspondiente
        char miLetra = alumno.obtenerLetra(miPromedio);

        // Imprimimos todo llamando al método final
        alumno.mostrarResultados(alumno.nombre, miPromedio, miLetra);
    }
}