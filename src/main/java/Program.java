import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Program {
  public static void main(String[] args) {
    Person person1 = new Person("Шкаев", "Сергей", 35);
    Person person2 = new Person("Шкаева", "Екатерина", 34);
    Person person3 = new Person("Шкаева", "Екатерина", 34);
    Person person4 = person2;

    GsonBuilder builder = new GsonBuilder();
    Gson gson = builder.create();

    // test gson
    String personGson = gson.toJson(person1);
    System.out.println(personGson);
    // {"firstName":"Шкаев","lastName":"Сергей","age":35}

    Person personFromGson = gson.fromJson(personGson, Person.class);

    // test toString()
    System.out.println(personFromGson);
    // Person@6956de9[firstName=Шкаев,lastName=Сергей,age=35]

    // test equals()
//    System.out.println(person1 == person2); // false
//    System.out.println(person2 == person3); // false
//    System.out.println(person2 == person4); // true
//    System.out.println(person2.equals(person3)); // true

    // до переопределения hashCode()
//    System.out.println(person1.hashCode()); // 1058025095
//    System.out.println(person2.hashCode()); // 665576141
//    System.out.println(person3.hashCode()); // 1599771323

    // после
//    System.out.println(person1.hashCode()); // 158891195
//    System.out.println(person2.hashCode()); // -1649065221
//    System.out.println(person3.hashCode()); // -1649065221




  }

}
