package entidades;

public class Estados {

    int id;
    String estado;
    String uf;

    public Estados() {
  }

    

    public Estados(int id, String estado, String uf) {
        this.id = id;
        this.estado = estado;
        this.uf = uf;
    }

    public Estados(String estado, String uf) {
        this.estado = estado;
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Estados [id=" + id + ", estado=" + estado + ", uf=" + uf + "]";
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }

}
