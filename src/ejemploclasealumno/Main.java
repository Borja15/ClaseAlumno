package ejemploclasealumno;

public class Main {

    public static void main(String[] args) {
        boolean mayorEdad;
        Alumno alumno1 = new Alumno();
        alumno1.asignaValores("Luis", "Pérez", 1979, 1, "1DAI", "Tarde");
        alumno1.muestraGrupo();
        mayorEdad = alumno1.esMayorEdad();
        if(mayorEdad)
            System.out.println("Es mayor de edad");
        alumno1.cambiaGrupo("2DAI");
        System.out.println("Se ha cambiado al grupo: " + alumno1.dameGrupo());
        
        //Nuevo alumno
        Alumno alumno2 = new Alumno();
        alumno2.asignaValores("Alex","Lopex Fernandez",1993,2,"PROG1","Mañana");
        alumno2.muestraGrupo();
        alumno2.cambiaGrupo("PROG2");
        System.out.println("Mi nuevo grupo es: "+ alumno2.dameGrupo());
        alumno2.dameEdad();
        alumno2.DameNombre(false);
        System.out.println(alumno2.muestraNombreAlumno());
    }
}
