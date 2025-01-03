public class JavaFinalClassWithOtherClassAsReference {
    public static void main(String[] args) {
//        QUESTION:
//        In Java, if a class is declared as final, can it still have references or objects of other classes as its member variables? What are the implications of having such references in terms of immutability and design?
//       SAMPLE FOLLOW-UP QUESTION:
//        Interviewer: How would you ensure that the objects referenced in a final class are not modifiable by external code?
        Engine engine = new Engine("test");
        System.out.println("engine: "+engine);
        Car car = new Car(engine,"Maruti");
        Engine engine1 = car.getEngine();
        System.out.println("engin from car class: "+engine1);
        engine1.setName("test1");
//        engine.setName("test1");
        System.out.println("car engin name after update: "+car.toString());
//        engine: Main$Engine@119d7047
//        engin from car class: Main$Engine@4eec7777
//        car engin name after update: Car{engine=test, model='Maruti'}

    }
     static class Engine{
        private String name;

         public Engine(String name) {
             this.name = name;
         }

         public void setName(String name) {
             this.name = name;
         }

         public String getName() {
             return name;
         }
     }

    final static class Car {
        private final Engine engine;
        private final String model;
        public Car(Engine engine, String model) {
            this.engine = engine;
            this.model = model;
        }

        public Engine getEngine() {

            return new Engine(this.engine.name);
        }

        public String getModel() {
            return model;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "engine=" + engine.getName() +
                    ", model='" + model + '\'' +
                    '}';
        }
    }
}