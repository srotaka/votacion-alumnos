package votacionalumnos;

public class Alumno {
    // Atributos
    private String nombreAlumno;
    private String apellidoAlumno;
    private Integer dniAlumno;
    private Integer cantidadVotos;

    // Constructor parametrizado
    public Alumno(String nombreAlumno, String apellidoAlumno, Integer dniAlumno, Integer cantidadVotos) {
        this.nombreAlumno = nombreAlumno;
        this.apellidoAlumno = apellidoAlumno;
        this.dniAlumno = dniAlumno;
        this.cantidadVotos = cantidadVotos;
    }

    // Constructor parametrizado sin cantidad de votos
    public Alumno(String nombreAlumno, String apellidoAlumno, Integer dniAlumno) {
        this.nombreAlumno = nombreAlumno;
        this.apellidoAlumno = apellidoAlumno;
        this.dniAlumno = dniAlumno;

    }

    // Constructor vacío
    public Alumno() {
    }

    // Getters y Setters
    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getApellidoAlumno() {
        return apellidoAlumno;
    }

    public void setApellidoAlumno(String apellidoAlumno) {
        this.apellidoAlumno = apellidoAlumno;
    }

    public Integer getDniAlumno() {
        return dniAlumno;
    }

    public void setDniAlumno(Integer dniAlumno) {
        this.dniAlumno = dniAlumno;
    }

    public Integer getCantidadVotos() {
        return cantidadVotos;
    }

    public void setCantidadVotos(Integer cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }
    
    

    // Método toString()
    @Override
    public String toString() {
        String datoAlumno = "";

        if (cantidadVotos == null) {
            datoAlumno = "- Nombre y Apellido: " + nombreAlumno + " " + apellidoAlumno + "\n- DNI Nº: " + dniAlumno + "\n- Cantidad de Votos Recibidos: 0";
        } else {
            datoAlumno = "- Nombre y Apellido: " + nombreAlumno + " " + apellidoAlumno + "\n- DNI Nº: " + dniAlumno + "\n- Cantidad de Votos Recibidos: " + cantidadVotos;
        }

        return datoAlumno;

    }
}
