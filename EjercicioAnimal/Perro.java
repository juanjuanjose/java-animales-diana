package EjercicioAnimal;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Perro extends Canino{
    public Perro(String foto, String comida, String localizacion, String tamaño) {
        super(foto, comida, localizacion, tamaño);
    }

    @Override
    void comer() {
        System.out.println("el perro come croquetas ");
    }

    public void vacunar(){
        System.out.println("el perro debe ser vacunado");
    }
    public void pasear(){
        System.out.println("el perro esta dando un paseo en el parque");
    }
    @Override
    void hacerRuido() {
        try {
            // Crea un objeto Player con el archivo MP3
            FileInputStream fis = new FileInputStream("src/EjercicioAnimal/sonidos/sonidoperro.mp3");
            Player player = new Player(fis);

            // Reproduce el archivo MP3
            player.play();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }

    }
}

