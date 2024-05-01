package EjercicioAnimal;

public class Main {
    public static void main(String[] args) {

        Leon leon = new Leon("foto_del_leon.jpg", "carne", "sabana", "grande");
        leon.comer();
        leon.hacerRuido();

        Tigre tigre = new Tigre("sdsadas","carne","sabana","grande");
        tigre.comer();
        tigre.hacerRuido();

        Gato gato = new Gato("gatopng","carne","urbana","pequeño");
        gato.comer();
        gato.hacerRuido();
        gato.vacunar();


        Perro perro = new Perro("asdasdasd","cuido","urbana","mediano");
        perro.comer();
        perro.hacerRuido();
        perro.vacunar();
        perro.pasear();

        Lobo lobo = new Lobo("asdasd","carne","bosques","mediano");
        lobo.comer();
        lobo.hacerRuido();



    }
}
