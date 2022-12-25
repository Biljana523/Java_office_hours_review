package week12.evening;

public class mobileApp {

    public String name;
    public String version;


    public mobileApp(String name, String version){
        this.name=name;
        this.version=version;
    }

    public void useTheApp(int minutes){
        System.out.println("you are using "+ name+ " for " +minutes+ " minutes");


    }
    public void download(){
        System.out.println("you are downloading "+ name + " with "+ version);
    }

    @Override
    public String toString() {
        return "mobileApp{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
/*
Task 1 :

 Create a class called MobileApp

            instance variables:
                name, version

                add a constructor to set all the fields

            instance methods:
                useTheApp(int minutes), download()

        Create the following sub classes of MobileApp:
            1. Instagram:
                    extra methods:
                        postPhoto()
            2. Discord:
                    extra methods:
                        chat(String name)

 */