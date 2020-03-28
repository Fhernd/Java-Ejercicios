package co.gestorbdcursos.datos;

import co.gestorbdcursos.modelos.Curso;
import co.gestorbdcursos.modelos.Estudiante;
import co.gestorbdcursos.modelos.Matricula;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author John Ortiz Ordoñez
 */
public class Conexion {

    public Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url = "jdbc:mysql://localhost/academiaonlinebd?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "";

            Connection conexion = DriverManager.getConnection(url, user, password);

            return conexion;
        } catch (ClassNotFoundException e) {
            System.err.println("Error -> " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Error -> " + e.getMessage());
        }

        return null;
    }

    public boolean insertarCurso(Curso curso) {
        try {
            Connection cnx = conectar();

            String sql = "INSERT INTO curso VALUES (DEFAULT, ?, ?, ?, ?, ?, DEFAULT)";

            PreparedStatement pstmt = cnx.prepareStatement(sql);
            pstmt.setString(1, curso.getNombre());
            pstmt.setString(2, curso.getDescripcion());
            pstmt.setString(3, curso.getInstructor());
            pstmt.setInt(4, curso.getPuntajeMinimo());
            pstmt.setString(5, curso.getNivel());

            int conteo = pstmt.executeUpdate();

            return conteo > 0;
        } catch (SQLException e) {
            System.err.println("Error -> " + e.getMessage());
            return false;
        }
    }
    
    public boolean insertarEstudiante(Estudiante estudiante){
        try{
            Connection conexion = conectar();
            
            String sql = "INSERT INTO estudiante VALUES (?, ?, ?, ?, DEFAULT)";
            
            PreparedStatement pstmt = conexion.prepareStatement(sql);
            pstmt.setString(1, estudiante.getDui());
            pstmt.setString(2, estudiante.getNombreCompleto());
            pstmt.setString(3, estudiante.getCorreo());
            pstmt.setString(4, estudiante.getEspecialidad());
            
            int conteo = pstmt.executeUpdate();
            
            return conteo > 0;
        } catch(SQLException e){
            System.err.println("Error -> " + e.getMessage());
            return false;
        }
    }
    
    public boolean insertarMatricula(Matricula matricula){
        try{
            Connection conexion = conectar();
            
            String sql = "INSERT INTO curso_estudiante VALUES (?, ?, DEFAULT, ?)";
            
            PreparedStatement pstmt = conexion.prepareStatement(sql);
            pstmt.setInt(1, matricula.getCursoId());
            pstmt.setString(2, matricula.getEstudianteDui());
            pstmt.setInt(3, matricula.getCalificacion());
            
            int conteo = pstmt.executeUpdate();
            
            return conteo > 0;
        } catch(SQLException e){
            System.err.println("Error -> " + e.getMessage());
            return false;
        }
    }

    public static void main(String[] args) {
        Conexion conexion = new Conexion();

        //insertarCursos(conexion);
        
        //insertarEstudiantes(conexion);
        
        matricularEstudiantes(conexion);
    }
    
    public static void insertarEstudiantes(Conexion conexion){
        Estudiante edward = new Estudiante();
        edward.setDui("123456789");
        edward.setNombreCompleto("Edward Ortiz");
        edward.setCorreo("edward@mail.com");
        edward.setEspecialidad("Desarrollo apps");
        
        boolean satisfactorio = conexion.insertarEstudiante(edward);
        
        if (satisfactorio){
            System.out.println("Se realizó de forma satisfactoria la inserción del nuevo estudiante Edward.");
        } else {
            System.out.println("No se pudo insertar el estudiante Edward.");
        }
        
        Estudiante daniela = new Estudiante();
        daniela.setDui("951753654");
        daniela.setNombreCompleto("Daniela Meneses");
        daniela.setCorreo("daniela@mail.com");
        daniela.setEspecialidad("Experiencia de Usuario");
        
        satisfactorio = conexion.insertarEstudiante(daniela);
        
        if (satisfactorio){
            System.out.println("Se realizó de forma satisfactoria la inserción del nuevo estudiante Daniela.");
        } else {
            System.out.println("No se pudo insertar el estudiante Daniela.");
        }
    }

    public static void insertarCursos(Conexion cnx) {
        Curso java = new Curso();
        java.setNombre("Java");
        java.setDescripcion("Java SE");
        java.setInstructor("Edward");
        java.setPuntajeMinimo(8);
        java.setNivel("Intermedio");

        Curso python = new Curso();
        python.setNombre("Python");
        python.setDescripcion("Python 3.x");
        python.setInstructor("Daniela");
        python.setPuntajeMinimo(8);
        python.setNivel("Básico");

        if (cnx.insertarCurso(java)) {
            System.out.println("La inserción del curso Java fue satisfactoria.");
        } else {
            System.out.println("No se pudo insertar el curso Java.");
        }

        if (cnx.insertarCurso(python)) {
            System.out.println("La inserción del curso Python fue satisfactoria.");
        } else {
            System.out.println("No se pudo insertar el curso Python.");
        }
    }
    
    private static void matricularEstudiantes(Conexion conexion) {
        Matricula matricula = new Matricula();
        matricula.setCursoId(1);
        matricula.setEstudianteDui("123456789");
        matricula.setCalificacion(89);
        
        conexion.insertarMatricula(matricula);
        
        matricula = new Matricula();
        matricula.setCursoId(2);
        matricula.setEstudianteDui("123456789");
        matricula.setCalificacion(93);
        
        conexion.insertarMatricula(matricula);
        
        matricula = new Matricula();
        matricula.setCursoId(2);
        matricula.setEstudianteDui("951753654");
        matricula.setCalificacion(95);
        
        conexion.insertarMatricula(matricula);
    }
}
