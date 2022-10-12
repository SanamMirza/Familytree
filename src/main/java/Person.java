import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private String middlename;
    private String lastName;
    private String sex;
    private int age;
    private Person mother;
    private Person father;
    private List<Person> siblings;
    private List<Person> children;
    private List<Pet> pets;

    public Person() {
    }

    public Person(String name, String lastName, String sex, int age) {
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public Person(String name, String middlename, String lastName, String sex, int age) {
        this.name = name;
        this.middlename = middlename;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }

    public List<Person> getSiblings() {
        return siblings;
    }

    public List<Person> getChildren() {
        return children;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public void setSiblings(List<Person> siblings) {
        this.siblings = siblings;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public void addParents(Person father, Person mother, Person child) {
        child.setMother(mother);
        child.setFather(father);
        addChild(mother, child);
        addChild(father, child);
    }

    public void addChild(Person parent, Person child) {
        List<Person> children = new ArrayList<>();
        if (parent.getChildren() != null) {
            for (Person c : parent.getChildren()) {
                children.add(child);
            }

        } else {
            children.add(child);
        }
        parent.setChildren(children);

    }

    public void addPet(Person person, Pet pet) {
       List<Pet> pets = new ArrayList<>();
       if (person.getPets() != null) {
        pets.addAll(person.getPets());
    }
       pets.add(pet);

    public void addSiblings(Person person, Person siblings){
            List<Person> siblings = new ArrayList<>();
            if (person.getSiblings() != null) {
                for (Person s : person.getSiblings()) {
                    siblings.add(siblings);
                }
            } else {
                    siblings.add(siblings);
            }
            person.setSiblings(siblings);
    }