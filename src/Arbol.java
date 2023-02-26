public class Arbol {
    private String especie;
    private int altura;

    public Arbol() {
    }

    public Arbol(String especie, int altura) {
        this.especie = especie;
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Arbol{" +
                "Especie='" + especie + '\'' +
                ", Altura=" + altura +"mtrs"+
                '}';
    }
}
