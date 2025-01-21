/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class JUET {
    String Name;
    int Age;
    
    void setName(String Name) {
        this.Name = Name;
    }
    
    void setAge(int Age) {
        this.Age = Age;
    }
    
    String getName() {
        return this.Name;
    }
    int getAge() {
        return this.Age;
    }
    
    
    public static void main(String[] args) {
        JUET obj = new JUET();
        
        obj.setName("Divyansh Kashyap");
        obj.setAge(21);
        
        String name = obj.getName();
        int age = obj.getAge();
        
        System.out.println(name);
        System.out.println(age);
        
    }
}