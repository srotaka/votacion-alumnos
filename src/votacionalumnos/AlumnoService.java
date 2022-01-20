
package votacionalumnos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlumnoService {
     List<Alumno> alumnoList = new ArrayList();
    List<String> nombreList = new ArrayList();
    List<String> apellidoList = new ArrayList();
    List<Integer> dniList = new ArrayList();

    // Creamos una lista de 15 nombres
    public void cargarNombres() {

        nombreList.add("BENJAMIN");
        nombreList.add("IGNACIO");
        nombreList.add("FELIPE");
        nombreList.add("ANTONIA");
        nombreList.add("VICENTE");
        nombreList.add("VERA");
        nombreList.add("SOFIA");
        nombreList.add("TOMAS");
        nombreList.add("CIRO");
        nombreList.add("EMILIA");
        nombreList.add("MANUEL");
        nombreList.add("TEO");
        nombreList.add("JOAQUIN");
        nombreList.add("JULIA");
        nombreList.add("GIOVANNA");

        Collections.shuffle(nombreList); // Hago un Shuffle para mezclar las posiciones de los valores cargados

    }

    // Creamos una lista de 15 apellidos
    public void cargarApellidos() {

        apellidoList.add("TAYLOR");
        apellidoList.add("MILLER");
        apellidoList.add("WILSON");
        apellidoList.add("DAVIS");
        apellidoList.add("WILLIAMS");
        apellidoList.add("SMITH");
        apellidoList.add("BROWN");
        apellidoList.add("PHILLIPS");
        apellidoList.add("JOHNSON");
        apellidoList.add("JONES");
        apellidoList.add("JACKSON");
        apellidoList.add("ROBINSON");
        apellidoList.add("WALKER");
        apellidoList.add("SCOTT");
        apellidoList.add("ADAMS");

        Collections.shuffle(apellidoList); // Hago un Shuffle para mezclar las posiciones de los valores cargados

    }

    // Creamos una lista de 15 DNI
    public void cargarDni() {

        for (int i = 0; i < 15; i++) {
            dniList.add(generarDni());
        }
        
        Collections.shuffle(dniList); // Hago un Shuffle para mezclar las posiciones de los valores cargados

    }

    // Método para generar DNI aleatoreos
    public Integer generarDni() {

        Integer min_val = 15143254;
        Integer max_val = 37279496;
        
        Integer dniAleatoreo = (int) (Math.random() * (max_val - min_val)) + min_val;
        return dniAleatoreo;

    }

}
