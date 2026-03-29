import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {

    public static void main(String[] args) {

        Array vector = new Array(100);

        try {
            BufferedReader br = new BufferedReader(new FileReader("estrutura_de_dados.txt"));

            String linha;

            while ((linha = br.readLine()) != null) {
                linha = linha.replaceAll("[,.;:!?]", "");
                vector.add(linha);
            }

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        /*for(int i = 0; i < vector.length(); i++){
            System.out.println(vector.get(i));
        }*/

        for (int i = 0; i < vector.length(); i++) {

            String linha = vector.get(i);

            List lista = new List();   // nova lista para cada linha

            String[] palavras = linha.split(" ");

            for (String p : palavras) {
                lista.add(p);
            }

            lista.print();
            System.out.println("--------------------------------------");
        }
    }
}
