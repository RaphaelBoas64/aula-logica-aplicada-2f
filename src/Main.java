public class Main {
    public static void main(String[] args) {

        int contador = 0;
        while(contador < 10){

            System.out.println("Contador = " + contador);
            contador = contador + 1;
        }
        int cont = 1;
        do {
            System.out.println(cont);
            cont++; // incremento
        }while(cont <= 10);

        for(int x=0; x<10; x++){
            System.out.println(x);
        }
        double[] nota = new double[500];
        nota[0] = 5.0;
        nota[1] = 10.0;
        nota[2] = 4.0;
        nota[3] = 5.0;
        nota[4] = 6.0;

        for(int x = 0; x < nota.length; x++){
            System.out.println(nota[x]);
        }
    }
}