
package votacionalumnos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SimuladorService {
     Scanner read = new Scanner(System.in).useDelimiter("\n");

    AlumnoService aService = new AlumnoService();
    List<Alumno> alumnoList = new ArrayList();
    List<Alumno> alumnosVotadosList = new ArrayList();
    List<Voto> votosList = new ArrayList();

    // Creamos una lista de Alumnos con nombre, apellido y DNI aleatoreos
    public List<Alumno> crearAlumnos() {
        aService.cargarNombres();
        aService.cargarApellidos();
        aService.cargarDni();

        for (int i = 0; i < 15; i++) {
            alumnoList.add(new Alumno(aService.nombreList.get(i), aService.apellidoList.get(i), aService.dniList.get(i), 0));

        }
        return alumnoList;
    }

    // Imprimos por pantalla la lista de alumnos con datos generados aleatoreamente
    public void imprimirAlumnos() {

        alumnoList = crearAlumnos();
        System.out.println("\n\t~ LISTA DE ALUMNOS DE EGG EDUCATION® ~\n");
        for (Alumno alumno : alumnoList) {
            System.out.println(alumno + "\n");
        }

    }

    // Crearemos un método votación recibe el listado de alumnos. 
    // Para cada alumno genera tres votos de manera aleatoria. 
    // Debemos guardar al alumno que vota, a los alumnos a los que votó y
    // sumarle uno a la cantidad de votos a cada alumno que reciba un voto (atributo de la clase Alumno). 
    public void votacion() {

        List<Voto> votacionList = new ArrayList();
        Voto votoAlumno = new Voto();
        System.out.println("\n\t~ VOTACIÓN ~");
        System.out.println("• Deberá votar a 3 personas distintas \n• No podrá votarse a sí mismo\n");

        List<Alumno> alumnoListAux = new ArrayList(alumnoList);

        for (Alumno alumno : alumnoList) {

            System.out.println("\nVOTACIÓN DE: " + alumno.getNombreAlumno() + " " + alumno.getApellidoAlumno());

            int min_val = 0;
            int posicionAux;

            String nombreVotante = alumno.getNombreAlumno();
            Alumno nombreCandidato = new Alumno();
            List<Alumno> listaVotos = new ArrayList(); // Lista para guardar los votos de cada alumno

            for (int i = 1; i < 4; i++) {

                do {
                    posicionAux = (int) (Math.random() * (alumnoList.size() - min_val)) + min_val;
                    nombreCandidato = alumnoListAux.get(posicionAux);

                } while (nombreVotante.equals(alumnoListAux.get(posicionAux).getNombreAlumno()) || listaVotos.contains(nombreCandidato));

                System.out.print("- Voto Nº" + i + ": " + alumnoListAux.get(posicionAux).getNombreAlumno() + " " + alumnoListAux.get(posicionAux).getApellidoAlumno() + "\n");
                listaVotos.add(alumnoListAux.get(posicionAux));

                for (Alumno alumno1 : alumnoList) {
                    if (alumno1.equals(nombreCandidato)) {
                        alumno1.setCantidadVotos(alumno1.getCantidadVotos() + 1);
                    }
                }
            }
        }
    }
    // Método para ordenar de mayor a menor voto. Lo utilizaremos al memento de impresión por pantalla
    public static Comparator<Alumno> ordenarVotos = new Comparator<Alumno>() {
        @Override

        public int compare(Alumno alumno01, Alumno alumno02) {
            return alumno02.getCantidadVotos().compareTo(alumno01.getCantidadVotos());
        }
    };

    //Se deben crear 5 facilitadores con los 5 primeros alumnos votados y se deben
    //crear 5 facilitadores suplentes con los 5 segundos alumnos más votados. A
    //continuación, mostrar los 5 facilitadores y los 5 facilitadores suplentes.
    public void impresionFacilitadores() {
        System.out.println(".......................................................");
        System.out.println("\n\t~ ¡FELICITACIONES A NUESTROS 3 FACILITADORES! ~\n");
        alumnoList.sort(ordenarVotos);
        int contador = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("» " + alumnoList.get(i).getNombreAlumno() + " " + alumnoList.get(i).getApellidoAlumno() + ": " + alumnoList.get(i).getCantidadVotos() + " VOTOS");
            
        }
        
        System.out.println("\n\t~ FACILITADORES SUPLENTES ~\n");
        for (int i = 3; i < 6; i++) {
            System.out.println("» " + alumnoList.get(i).getNombreAlumno() + " " + alumnoList.get(i).getApellidoAlumno() + ": " + alumnoList.get(i).getCantidadVotos() + " VOTOS");
            
        }

    }

}
