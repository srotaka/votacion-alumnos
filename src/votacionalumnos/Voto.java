
package votacionalumnos;

import java.util.List;
import java.util.Objects;

public class Voto {
      // Atributos
    private Alumno alumno;
    private List alumnosVotadosList;
    
    // Constructor parametrizado

    public Voto(Alumno alumno, List alumnosVotadosList) {
        this.alumno = alumno;
        this.alumnosVotadosList = alumnosVotadosList;
    }
    
    // Constructor vacío

    public Voto() {
    }
    
    // Getters y Setters

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public List getAlumnosVotadosList() {
        return alumnosVotadosList;
    }

    public void setAlumnosVotadosList(List alumnosVotadosList) {
        this.alumnosVotadosList = alumnosVotadosList;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.alumno);
        hash = 79 * hash + Objects.hashCode(this.alumnosVotadosList);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Voto other = (Voto) obj;
        if (!Objects.equals(this.alumno, other.alumno)) {
            return false;
        }
        if (!Objects.equals(this.alumnosVotadosList, other.alumnosVotadosList)) {
            return false;
        }
        return true;
    }
        
    // Método toString()

    @Override
    public String toString() {
           
        return "\n- Alumno: " + alumno.getNombreAlumno() + " " + alumno.getApellidoAlumno() + "\n- Ha votado a: " + alumnosVotadosList;
    }
    
    
}
