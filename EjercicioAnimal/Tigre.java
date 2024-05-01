package EjercicioAnimal;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Tigre extends Felino {


    public Tigre(String foto, String comida, String localizacion, String tamaño) {
        super(foto, comida, localizacion, tamaño);
    }

    @Override
    void comer() {
        System.out.println("el Tigre come carne de bufalo");
    }
    @Override
    void hacerRuido() {
        try {
            // Crea un objeto Player con el archivo MP3
            FileInputStream fis = new FileInputStream("src/EjercicioAnimal/sonidos/sonidotigre.mp3");
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
