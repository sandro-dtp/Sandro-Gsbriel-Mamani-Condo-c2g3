package pe.edu.upeu.asistencia.servicio;

import pe.edu.upeu.asistencia.modelo.Estudiante;

import java.util.List;

public interface EstudianteServicioI {
    void  save(Estudiante estudiante);
    List<Estudiante> findAllEstudiantes();//R
    Estudiante updateEstudiante (Estudiante estudiante, int index);//U


    Estudiante findEstudiante (int index) ;

    Estudiante findEstudianteById (int id);
}
