public class Estudiante {
    // ATRIBUTOS (Características del estudiante)
    String nombre;
    int edad;
    String curso;
    double nota;
    
    // CONSTRUCTOR (Método especial para crear estudiantes)
    // El constructor se llama igual que la clase
    public Estudiante(String nombreEstudiante, int edadEstudiante, String cursoEstudiante) {
        nombre = nombreEstudiante;
        edad = edadEstudiante;
        curso = cursoEstudiante;
        nota = 0.0; // Empieza con nota 0
    }
    
    // MÉTODOS (Acciones que puede hacer el estudiante)
    
    // Método 1: Saludar
    public void saludar() {
        System.out.println("¡Hola! Soy " + nombre + " y estudio " + curso);
    }
    
    // Método 2: Estudiar
    public void estudiar(String materia) {
        System.out.println(nombre + " está estudiando " + materia + " muy duro 💪");
        nota += 1.0; // Sube la nota por estudiar
    }
    
    // Método 3: Presentar examen
    public void presentarExamen() {
        System.out.println(nombre + " está presentando su examen... ✍️");
        System.out.println("¡Nota actual: " + nota + "!");
    }
}


/*
    PROGRAMA PRINCIPAL
*/

java
public class Main {
    public static void main(String[] args) {
        System.out.println("🎓 CREANDO NUESTROS ESTUDIANTES 🎓");
        System.out.println("===================================");
        
        // CREAMOS NUESTRO PRIMER OBJETO: estudiante1
        System.out.println("1️⃣ Creando a María...");
        Estudiante estudiante1 = new Estudiante("María García", 16, "4to de Secundaria");
        
        // CREAMOS NUESTRO SEGUNDO OBJETO: estudiante2  
        System.out.println("2️⃣ Creando a Carlos...");
        Estudiante estudiante2 = new Estudiante("Carlos López", 15, "3ro de Secundaria");
        
        System.out.println("✅ ¡Estudiantes creados exitosamente!");
        System.out.println("");
        
        // NUESTROS ESTUDIANTES COBRAN VIDA
        System.out.println("🎤 LOS ESTUDIANTES HABLAN:");
        System.out.println("---------------------------");
        estudiante1.saludar();
        estudiante2.saludar();
        System.out.println("");
        
        // LOS ESTUDIANTES ESTUDIAN
        System.out.println("📚 HORA DE ESTUDIAR:");
        System.out.println("--------------------");
        estudiante1.estudiar("Matemáticas");
        estudiante2.estudiar("Historia");
        System.out.println("");
        
        // LOS ESTUDIANTES RINDEN EXÁMENES
        System.out.println("✍️ HORA DEL EXAMEN:");
        System.out.println("-------------------");
        estudiante1.presentarExamen();
        estudiante2.presentarExamen();
        System.out.println("");
        
        // VEAMOS LA INFORMACIÓN DE LOS ESTUDIANTES
        System.out.println("🔍 INFORMACIÓN DE ESTUDIANTES:");
        System.out.println("------------------------------");
        System.out.println("Estudiante 1: " + estudiante1.nombre + " - " + estudiante1.edad + " años");
        System.out.println("Estudiante 2: " + estudiante2.nombre + " - " + estudiante2.edad + " años");
    }
}
