import zoo.animals.Lion;
import zoo.animals.Elephant;
import zoo.animals.Giraffe;

class Zoo {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Elephant elephant = new Elephant();
        Giraffe giraffe = new Giraffe();

        lion.speak();
        elephant.speak();
        giraffe.speak();
    }
}
