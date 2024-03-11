import java.util.*;

public class Ejercicio17extra {
    public static void main(String[] args) {
        HashMap<String, float[]> notaEstudiante = new HashMap<>();
        notaEstudiante.put("Juan David Portilla", new float[]{4.9f, 3.2f, 4.1f});
        notaEstudiante.put("Juan Felipe Buitrago", new float[]{4.2f, 2.9f, 4.5f});
        notaEstudiante.put("Cesar Andrey Vargas", new float[]{3.2f, 4.2f, 2.5f});
        notaEstudiante.put("Cesar Toro", new float[]{2.1f, 1.2f, 3.2f});
        promedio(notaEstudiante);
    }//estas son las notas de los estudiantees

    public static void promedio(HashMap<String, float[]> notaEstudiante) {
        for (Map.Entry<String, float[]> entry : notaEstudiante.entrySet()) {
            String estudiante = entry.getKey();
            float[] calificaciones = entry.getValue();

            float sumaCalificaciones = 0;
            for (float calificacion : calificaciones) {
                sumaCalificaciones += calificacion;
            }
            float promedio = sumaCalificaciones / calificaciones.length;//aca se saca el promedio

            System.out.println("El promedio de calificaciones de " + estudiante + " es: " + String.format("%.2f", promedio));//se muestran el promedio de todos los estudiantes




        }
    }
}
