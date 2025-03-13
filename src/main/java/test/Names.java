package test;

public class Names {
    private String name;
    private String surname;

    public Names() {
        this.name = "N/A";
        this.surname = "N/A";
    }
    public Names(String name){
        this.name = name;
        this.surname = "N/A";
    }
    public Names(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName (){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    
    public String toString (){
        return this.name + " " + this.surname;
    }
}
