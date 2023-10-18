package Animal;

public class TestaAnimais {
    public static void main(String[] args){
        Animal[] animais = new Animal[4];
        animais[0] = new Animal();
        animais[1] = new Boi();
        animais[2] = new Cachorro();
        animais[3] = new Sapo();
        for(Animal animal : animais){
            System.out.println(animal.emitirSom());
        }
    }
    
}
