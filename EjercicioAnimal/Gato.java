package EjercicioAnimal;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Gato extends Felino {

    public Gato(String foto, String comida, String localizacion, String tamaño) {
        super(foto, comida, localizacion, tamaño);
    }
    @Override
    void comer() {
        System.out.println("el gato come whiskas");
    }

    public void vacunar(){
        System.out.println("el gato debe ser vacunado");
    }
    @Override
    void hacerRuido() {
        try {
            // Crea un objeto Player con el archivo MP3
            FileInputStream fis = new FileInputStream("src/EjercicioAnimal/sonidos/sonidogato.mp3");
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
