public class Main {

    public static void main(String[] args) {

        Flower daffodils = new Flower("yellow");
        Flower iris = new Flower ("blue");
        Tree sharonfruit = new Tree("orange");
        Tree plum = new Tree ("purple");

        Garden garden = new Garden ("Plant Nursery");
        garden.addPlantsToMyGarden (daffodils);
        garden.addPlantsToMyGarden(iris);
        garden.addPlantsToMyGarden(sharonfruit);
        garden.addPlantsToMyGarden(plum);

        System.out.println(garden);
        System.out.println();

        System.out.println("Watering with 40");
        garden.wateringGarden(40);
        System.out.println(garden);

        System.out.println("Watering with 80");
        garden.wateringGarden(70);
        System.out.println(garden);
    }
}

