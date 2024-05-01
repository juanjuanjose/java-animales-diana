package EjercicioAnimal;

abstract class Animal {
   protected String foto;
    protected String comida;
    protected String localizacion;
    protected String tamaño;


   abstract  void hacerRuido();
   abstract   void comer();
   abstract void dormir();
   abstract void sonidoEmitido();


    public Animal(String foto, String comida, String localizacion, String tamaño) {
        this.foto = foto;
        this.comida = comida;
        this.localizacion = localizacion;
        this.tamaño = tamaño;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
}
