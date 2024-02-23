package Examen_Pablo_Couce;

class Report {

    void printReport() {

        printEncabezado();
        printCotenido();
        printConclusion();

    }

    void printEncabezado(){
        // imprimir título
        System.out.println("Título del Reporte");
    }

    void printCotenido(){
        // contenido del reporte
        System.out.println("Contenido 1...");
        System.out.println("Contenido 2...");
        // más contenido...
    }

    void printConclusion(){
        // imprimir conclusión
        System.out.println("Conclusión del Reporte");
    }
}