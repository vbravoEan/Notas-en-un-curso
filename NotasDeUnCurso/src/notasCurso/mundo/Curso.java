/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad Ean (Bogotá - Colombia)
 * Programa de Ingeniería de Sistemas
 * Licenciado bajo el esquema Academic Free License version 2.1
 * <p>
 * Desarrollo de Software - Guía 2 - Actividad 2
 * Ejercicio: notas de un curso
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package notasCurso.mundo;

/**
 * Clase que representa un curso.
 */
public class Curso {
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Total de estudiantes en el curso.
     */
    public final static int TOTAL_EST = 12;

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Notas de los estudiantes.
     */
    private double[] notas;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea un nuevo curso, inicializando todas las notas en cero.
     */
    public Curso() {
        notas = new double[TOTAL_EST];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = 0.0;
        }
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Calcula el promedio del curso.
     *
     * @return Promedio de todas las notas del curso. promedio >= 0.
     */
    public double promedio() {
        double promedio = 0;

        for (int i = 0; i < notas.length; i++) {
            promedio += notas[i];
        }

        promedio = promedio / notas.length;
        return promedio;
        
    }

    /**
     * Devuelve el número de estudiantes que tienen la nota mayor al promedio.
     *
     * @return Número de estudiantes que tienen la nota mayor al promedio. número >= 0.
     */
    public int darCantidadSobrePromedio() {
    	 int cantidad = 0;
         double promedio = promedio();

         for (int i = 0; i < notas.length; i++) {
             if (notas[i] > promedio) {
                 cantidad++;
             }
         }

         return cantidad;
    }

    /**
     * Devuelve la nota de un estudiante del curso.
     *
     * @param pNumEstudiante Número del estudiante : 1 <= estudiante <= 12.
     * @return Nota del estudiante.
     */
    public double darNota(int pNumEstudiante) {
        return notas[pNumEstudiante - 1];
    }

    /**
     * Cambia la nota de un estudiante en el curso.
     *
     * @param pNumEstudiante Número del estudiante. 1 <= estudiante <= 12.
     * @param pNota          Nota del estudiante.
     */
    public void cambiarNota(int pNumEstudiante, double pNota) {
    	 notas[pNumEstudiante - 1] = pNota;
    }

    // -----------------------------------------------------------------
    // Puntos de Extensión
    // -----------------------------------------------------------------
    /**
     * Obtener la cantidad de estudiantes que no pasaron el curso
     */
    public int cantidadReprobados() {
    	int cantidad = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 3.0) { // Nota mínima para pasar el curso es 3.0
                cantidad++;
            }
        }

        return cantidad;
    }

    /**
     * Obtener la mejor nota del curso.
     */
    public double mejorNota() {
    	  double mejor = notas[0];

          for (int i = 1; i < notas.length; i++) {
              if (notas[i] > mejor) {
                  mejor = notas[i];
              }
          }

          return mejor;
    }

    /**
     * Obtener el porcentaje de estudiantes que pasaron el curso
     * Debe ser un número entre 0 y 100.
     */
    public double darPorcentajePasaron() {
        // TODO: Obtener el porcentaje de estudiantes que pasaron el curso
    	 int aprobados = 0;
    	 for (double nota : notas) {
    		 if (nota >= 3.0) {
    	            aprobados++;
    	        }
    	    }
    	 return ((double) aprobados / TOTAL_EST) * 100.0;
    }

    /**
     * Determinar si todos los estudiantes del curso pasaron la materia
     * Retorna true si todos tuvieron notas aprobatorias, o false cuando al menos
     * un estudiante reprobó la materia.
     */
    public boolean todosPasaron() {
    	for (double nota : notas) {
            if (nota < 3.0) {
                return false;
            }
        }
        return true;
    }
}