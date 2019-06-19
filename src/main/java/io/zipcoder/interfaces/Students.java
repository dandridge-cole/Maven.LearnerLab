package io.zipcoder.interfaces;

final public class Students extends People{
    final private static Students INSTANCE = new Students();

    public static Students getInstance() {
        return INSTANCE;
    }

    private Students() {
        Long nextId=0L;
        super.add(new Student(nextId+=10, "Aashna"));
        super.add(new Student(nextId+=10, "Abram"));
        super.add(new Student(nextId+=10, "Ajulu"));
        super.add(new Student(nextId+=10, "AlexB"));
        super.add(new Student(nextId+=10, "AlexI"));
        super.add(new Student(nextId+=10, "Alicia"));
        super.add(new Student(nextId+=10, "Andrew"));
        super.add(new Student(nextId+=10, "Angelica"));
        super.add(new Student(nextId+=10, "Anish"));
        super.add(new Student(nextId+=10, "BenC"));

        super.add(new Student(nextId+=10, "BenR"));
        super.add(new Student(nextId+=10, "Bob"));
        super.add(new Student(nextId+=10, "Caleb"));
        super.add(new Student(nextId+=10, "Connor"));
        super.add(new Student(nextId+=10, "Dasha"));
        super.add(new Student(nextId+=10, "Donna"));
        super.add(new Student(nextId+=10, "Ed"));
        super.add(new Student(nextId+=10, "Erick"));
        super.add(new Student(nextId+=10, "Henry"));

        super.add(new Student(nextId+=10, "Joanna"));
        super.add(new Student(nextId+=10, "Justin"));
        super.add(new Student(nextId+=10, "Kavya"));
        super.add(new Student(nextId+=10, "Prasanthi"));
        super.add(new Student(nextId+=10, "Reese"));
        super.add(new Student(nextId+=10, "Robert"));
        super.add(new Student(nextId+=10, "Sputnika"));
        super.add(new Student(nextId+=10, "Stefun"));
        super.add(new Student(nextId+=10, "William"));

        super.add(new Student(nextId, "Dan"));
    }

//    public Student[] toArray(){
//        return super.toArray();
//    }
}
