
class overloading {
    String name,course;
    int age;
    overloading()
    {
        this.name="Ayush";
        this.age=20;
        this.course="Btech";
    }
    overloading(String name,int age,String course)
    {
        this.name=name;
        this.age=age;
        this.course=course;
    }
    void display()
    {
        System.out.println(name+" "+age+" "+course);
    }
//}
//class overloadingdemo{
    public static void main(String[] args) {
        overloading o=new overloading();
        overloading o1=new overloading("Anu", 19, "Btech");
        o.display();
        o1.display();
    }
    
}
