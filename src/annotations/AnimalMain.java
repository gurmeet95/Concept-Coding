package annotations;

public class AnimalMain {
    public static void main(String[] args) {
        Category [] typeAnimal=new Animal().getClass().getAnnotationsByType(Category.class);
        for(Category annotation: typeAnimal){
            System.out.println(annotation.name());
        }
    }
}
