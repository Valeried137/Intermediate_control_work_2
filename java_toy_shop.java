package java_toy_shop;
import java.io.BufferedWriter;
import java.util.PriorityQueue;
import java.io.IOException;

public class java_toy_shop {
    private int id;
    private String name;
    private int frequency;

    public java_toy_shop (int id, String name, int frequency) {
        this.id = id;
        this.name = name;
        this.frequency = frequency;
    }

int [] ids = {1, 2, 3};
String [] names = {"Мишка", "Зайчик", "Щенок"};
int [] frequencys = {1, 2, 1};

PriorityQueue toysQueue = new PriorityQueue((t1, t2) ->
Double.compare(t2.getFrequency(), t2.getFrequency()));
    for (int i = 0; i < ids.length; i++){
        java_toy_shop toy = new java_toy_shop(ids[i], names [i], frequencys [i]);
        toysQueue.add(toy);
}

List resultList = new ArrayList();
    for (int i = 0; i < 10; i ++){
        java_toy_shop  currentToy = toysQueue.poll();
        resultList.add(currentToy);
}

String fileName = "result.txt";
try (BufferedWriter writer = new BufferWriter(new FileWriter(fileName))){
    for (java_toy_shop  toy : resultList){
        writer.write(string.format("id: %d, Игрушка: %s, Частота выпадания: %.2fn", toy.getld(), toy.getName(), toy.getFrequency()));
    }
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
    }

