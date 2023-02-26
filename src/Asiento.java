public class Asiento {
    private int precio;
    private String material;
    private boolean reposapies;

    public Asiento() {
    }

    public Asiento(int precio, String material, boolean reposapies) {
        this.precio = precio;
        this.material = material;
        this.reposapies = reposapies;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isReposapies() {
        return reposapies;
    }

    public void setReposapies(boolean reposapies) {
        this.reposapies = reposapies;
    }

    @Override
    public String toString() {
        return "Asiento{" +
                "precio= $" + precio +
                ", material='" + material + '\'' +
                ", reposapies=" + reposapies +
                '}';
    }
}
