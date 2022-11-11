package module27;

import java.util.ArrayList;
import java.util.List;


//  общий интерфейс (свойства) для всех предметов в коробках,
// в нашем случае свойство - цена одного элемента
//  на диаграмме обозначен как Component
public interface CustomItem{
    int getPrice();//   получить цену (стоимость) одного элемента
    void printCost();// вывести на экран стоимость
}

// минимальный компонент, на диаграмме - Leaf
class Item implements CustomItem{
    private String name;//  название
    private int price;//    цена
    //  конструктор
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
    //  переопределим методы getPrice() и printCost() для простого объекта
    @Override
    public int getPrice() {
        return price;
    }
    @Override
    public void printCost() {
        System.out.println(name + ": price - " + price);
    }
}

//  Ящик для хранения простых и составных элементов. На схеме - Composite.
class Box implements CustomItem{
    // Объявляем список, типизированный интерфейсом CustomItem.
    // Это позволит хранить в листе любые объекты, реализующие интерфейс CustomItem.
    List<CustomItem> items;
    // Создаем конструктор. Во время инициализации объекта Box создаем ArrayList.
    Box(){
        items = new ArrayList();
    }
    public void addItem(CustomItem customItem){// метод добавления элементов в Box.
        items.add(customItem);
    }
    public void removeItem(CustomItem customItem){// метод удаления элементов из Box.
        items.remove(customItem);
    }
    //  переопределим методы getPrice() и printCost() для составных элементов в ящике
    @Override
    public int getPrice() {
        int cost = 0;
        for (CustomItem item : items) {//перебираем все элементы массива
            cost += item.getPrice();
        }
        return cost;
    }
    @Override
    public void printCost() {
        int cost = 0;
        for (CustomItem item : items) {//перебираем все элементы массива
            cost += item.getPrice();
        }
        System.out.println(cost);
    }
}
class CompositeRunner {
    public static void main(String[] args) {
// создаем первую коробку и помещаем туда 3 простых элемента
        Box box1 = new Box();
        box1.addItem(new Item("pack1", 3));
        box1.addItem(new Item("pack2", 4));
        box1.addItem(new Item("pack3", 5));
// создаем вторую коробку и помещаем туда 3 простых элемента
        Box box2 = new Box();
        box2.addItem(new Item("pack4", 3));
        box2.addItem(new Item("pack5", 4));
        box2.addItem(new Item("pack6", 5));
// создаем третью коробку и помещаем туда 1 простой элемент и 2 коробки
        Box box3 = new Box();
        box3.addItem(new Item("pack7", 4));
        box3.addItem(box1);
        box3.addItem(box2);

        box3.printCost();//выводим стоимость всех элементов из третьей коробки
    }
}