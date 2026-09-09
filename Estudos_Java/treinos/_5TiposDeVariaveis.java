public class _5TiposDeVariaveis {
    public static void main (String[] args) {

        // Tipo primitivos em java:
            // Tipos numericos inteiros:
            // byte , short , int , long

        //obs pode usar _ underline como separador
        byte pequeno = 10;          // Ocupa 8 bits (-128 a 127), valor padrão 0

        short medio = 20_000;        // Ocupa 16 bits (-32.768 a 32.767), valor padão 0

        int normal = 1_500_000;       // Ocupa 32 bits (-2.147.483.648 a 2.147.483.647), valor padrão 0

        long grande = 4_500_000_000L;  // Ocupa 64 bits (-9.223.372.036.854.775.808 a 9.223.372.036.854.775.807),
        // valor padrão 0L  (use 'L' ou 'l' no final para números long)


            // Tipos numericos com ponto flutuantes:
            // float , double

        float menosPreciso = 22.5f; // ocupa 32 bits (-1,4024E-37 a 3,4028E+38),
        // valor padrão 0.0f, você deve colocar a letra F ou f no final do número.

        double maisPreciso = 40.75687; // ocupa 64 bits (-4,94E-307 a 1,79E+308), valor padrão 0.0


            // Um caracter unicode / char (entre aspas simples)

        char sexo = 'F'; // Ocupa 8 bits (\u0000 a \uFFFF)


          // Boolean: Ocupa 1 bit, false or true, valor padrão false
        boolean boraEstudarMais = true;
        boolean vamosDesistir = false;

        // Strint (Cadeia de caracteres / palavras / textos, entre aspas duplas)

        String nomeCompleto = "Gabriel Arruda Caricchio";
    }
}
