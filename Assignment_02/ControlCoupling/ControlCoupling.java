package Assignment_02.ControlCoupling;

public class ControlCoupling {
    String Type;
    public void type(){
             BMW bmw  = new BMW();
             Ferrari ferrari = new Ferrari();
         if (Type == "BMW"){
             bmw.BMW_type("BMW");
         }
         else if (Type == "Ferrari"){
             ferrari.ferrari_type("Ferrari");
         }

    }


}
