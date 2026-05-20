import java.io.*;
public class Jbean implements Serializable{
private String className;
private int Roll;
private String name;
 String claName;
 String Name;

public void setCname(String className){
     claName=className;

}
public String getCname(){
    return claName;
}

public void setName(String name){
     Name=name;

}
public String getName(){
    return Name;
}
 int roll;
public void setRoll(int Roll){
     roll=Roll;

}
public int getRoll(){
    return roll;
}
}
