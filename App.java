import java.util.ArrayList;

public class App {

public static void main(String[] args) throws Exception {
        /*System.out.println("Hello, World!");
        System.out.println("Bye Bitches");
        System.err.println("sou");
        double estatura = 1.71;
        float peso = 80.5f;
        char inicial = 'J';
        String apellido = "Aris";
        //El objetivo es imprimir 
        System.out.println(inicial+apellido);
        int mes = 8

        byte [] lista = new byte [4];
        lista [3] = 11;

        for (int i = 0; i < lista.length; i++){ 
            System.out.println(lista[i]);

        }*/
        /*int arreglo [] = {1,2,3,4,5,6};
        for (int i = 0; i < arreglo.length; i++){
            if (i == 3){
                continue;
                //break;
            }
            System.out.println(arreglo[i]);
        }

        byte numero = 4;
        while(numero != 0){
            System.out.println(numero);
            numero = (byte)(numero - 1);


        }*/
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("hola");
        lista.add("adios");
        lista.add(1, "mitad");
        for (int i=0; i<lista.size();i++) {
            System.out.println(lista.get(i));
        }

    }

}
 