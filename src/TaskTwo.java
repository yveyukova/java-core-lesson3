public class TaskTwo {
    public static void run(){
        System.out.println("========================================================");
        System.out.println("Задание 2");
        System.out.println("========================================================");
        System.out.println("Первая коробка с яблоками");
        Box<Apple> appleBox1 = new Box<>();
        for (int i = 0; i < 6; i++) {
            appleBox1.addFruit(new Apple());
        }
        System.out.println("... " + appleBox1.getCount() + " фруктов");
        System.out.println("... вес: " + appleBox1.getWeight());
        System.out.println("Вторая коробка с яблоками");
        Box<Apple> appleBox2 = new Box<>();
        for (int i = 0; i < 10; i++) {
            appleBox2.addFruit(new Apple());
        }
        System.out.println("... " + appleBox2.getCount() + " фруктов");
        System.out.println("... вес: " + appleBox2.getWeight());
        System.out.println("Коробка с апельсинами");
        Box<Orange> orangeBox1 = new Box<>();
        for (int i = 0; i < 4; i++) {
            orangeBox1.addFruit(new Orange());
        }
        System.out.println("... " + orangeBox1.getCount() + " фруктов");
        System.out.println("... вес: " + orangeBox1.getWeight());
        System.out.println("Сравниваем вес коробок с яблоками");
        System.out.println((appleBox1.compare(appleBox2)) ? "... равны" : "... не равны");

        System.out.println("Сравниваем вес первой коробки с яблоками и коробки с апельсинами");
        System.out.println((appleBox1.compare(orangeBox1)) ? "... равны" : "... не равны");

        System.out.println("Пересыпаем вторую коробку с яблоками в первую");
        try {
            appleBox1.shift(appleBox2);
        } catch (DifferentFruitType e) {
            System.out.println("Ошибка!!!. В коробках разный вид фруктов");
        }
        System.out.println("Первая коробка с яблоками");
        System.out.println("... " + appleBox1.getCount() + " фруктов");
        System.out.println("... вес: " + appleBox1.getWeight());
        System.out.println("Вторая коробка с яблоками");
        System.out.println("... " + appleBox2.getCount() + " фруктов");
        System.out.println("... вес: " + appleBox2.getWeight());

        System.out.println("Пробуем пересыпать апельсины в яблоки");
        try {
            appleBox1.shift(orangeBox1);
        } catch (DifferentFruitType e) {
            System.out.println("Ошибка!!!. В коробках разный вид фруктов");
        }
    }
}

