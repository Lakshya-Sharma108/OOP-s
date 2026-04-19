package JavaOopConcept.C_Constructor;

public class ZomatoProjectWithConstructor {
    public static void main(String [] array){

        Customer c1 = new Customer(1, "lakshaya", "bharatpur", 9549157829l,
                            "lucky@gmail.com");
        System.out.println("Customer Info :"+"\nId : "+c1.id+"\nName :"+c1.name+"\nAddress : "+c1.address+"\nPhoneNo :"                  +c1.phoneNumber+"\nEmail id : "+ c1.emailId+"\n");


        Order o1 = new Order(151l, "Kaju Katli", "Desert", 150, 5,"Bharatpur");
        System.out.println("Order Details : "+"\nId : "+o1.id+"\nName : "+o1.name+"\nType : "+o1.type+"\nQuantity : "
                           +o1.quantity+"\nPlace : "+o1.place+"\n");


        Restaurant r1 = new Restaurant("Padmavati Bhojnalya", "USA", 5.5f, "Fast-food, Cold-drinks, IceCream and more.." );
        System.out.println("Restaurant Deatails : "+"\nName : "+r1.name+"\nAddress : "+r1.address+"\nRatting :" +
                           r1.ratting+"\nDishes : "+r1.dishes+"\n");

    }

}



class Customer{
     long id;
     String name;
     String address;
     long phoneNumber;
     String emailId;

   Customer(long id, String name, String address, long phoneNumber, String emailId){
       this.id = id;
       this.name = name;
       this.address = address;
       this.phoneNumber = phoneNumber;
       this.emailId = emailId;
   }
}



class Order{
     long id;
     String name;
     String type;
     int prize;
     int quantity;
     String place;

    Order(long id, String name, String type, int price, int quantity, String place){
        this.id = id;
        this.name = name;
        this.type = type;
        this.prize = price;
        this.quantity = quantity;
        this.place = place;
    }
}



class Restaurant{
     String name;
     String address;
     float ratting;
     String dishes;

    Restaurant(String name, String address, float ratting, String dishes){
        this.name = name;
        this.address = address;
        this.ratting = ratting;
        this.dishes = dishes;
    }


}
