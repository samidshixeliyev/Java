package sorting_comparing_iteration;

class Person implements Comparable<Person> {
    String name;

    Person(String name) {
        this.name = name;
    }

    public int compareTo(Person p) {
        return this.name.compareTo(p.name); // Adları əlifba sırasına görə sıralayır
    }
}





