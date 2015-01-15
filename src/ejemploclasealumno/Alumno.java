package ejemploclasealumno;

class Alumno {
    String nombre;
    String apellidos;
    int añoDeNacimiento;
    int númeroPersonal;
    String grupo;
    String turnoHorario = "Mañana";
    int añoActual = 2015;
    int Edad;
    String resultado;

    void cambiaGrupo(String nuevoGrupo) {
        grupo = nuevoGrupo;
    }

    void asignaValores(String nom, String ape, int añoNac, int num, String gru, String turno) {
        //Asignación de valores a los atributos de la clase
        nombre = nom;
        apellidos = ape;
        añoDeNacimiento = añoNac;
        númeroPersonal = num;
        grupo = gru;
        turnoHorario = turno;
        //Mostrar mensaje informativo
        System.out.println("Valores asignados correctamente");
    }

    void muestraGrupo() {
       System.out.println("El alumno: " + nombre + " " + apellidos);
       System.out.println("Pertenece al grupo: " + grupo);
    }

    String dameGrupo() {
        return grupo;
    }

    boolean esMayorEdad() {
       if(añoActual - añoDeNacimiento >= 18)
           return true;
       else
           return false;
    }
    
    void dameEdad(){
        Edad = añoActual - añoDeNacimiento;
    }
    
    int muestraEdad(){
        return Edad;
    }
    
    void DameNombre(boolean OrdenApellidos){
        if(OrdenApellidos == true){
            resultado = apellidos +" "+ nombre;
        }if(OrdenApellidos == false){
            resultado = nombre +" "+ apellidos;
        }
    }
    
    String muestraNombreAlumno(){
        return resultado;
    }
  
}
