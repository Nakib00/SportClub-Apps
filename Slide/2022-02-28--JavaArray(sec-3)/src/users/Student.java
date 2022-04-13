package users;

public class Student extends Person{
    private int id; private float cgpa;

    public Student() {
    }

    public Student(int id, String name, String gender, String bg, float cgpa) {       
        this.name = name;
        this.gender = gender;
        this.bg = bg;        
        
        //Person(name,gender,bg);   //ERROR, constructor can't be called
        //super(name,gender,bg);    //VALID, giving signal to compiler to fire superclass constructor
        this.id = id;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
    
    public void showStudInfo(){
        //to display ALL 5 fields
        /*
        System.out.println("ID="+id+", Name="+getName()+", Gender="+getGender()
                            +", BG="+getBg()+", Cgpa="+cgpa);
        */
        
        
        System.out.println("ID="+id+", Name="+name+", Gender="+gender
                            +", BG="+bg+", Cgpa="+cgpa);
        
    }
    
    @Override
    public String toString(){
        return "ID="+id+", Name="+name+", Gender="+gender+", BG="+bg+", Cgpa="+cgpa;
    }
    
}
