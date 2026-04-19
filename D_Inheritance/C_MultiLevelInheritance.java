package JavaOopConcept.D_Inheritance;

public class C_MultiLevelInheritance {
    public static void main(String[] args) {
        /*
            What is Multi level Inheritance ?
            Where a grandChild class inherits the properties of a child class and child class
            inherits the properties of a parent class.

            Explain through a diagram :
                                                +----------------------+
                                                |                      |
                                                |     Parent class     |
                                                |                      |
                                                +----------------------+
                                                            ^
                                                            |
                                                            | Extends
                                                            |
                                                +----------------------+
                                                |                      |
                                                |      Child class     |
                                                |                      |
                                                +----------------------+
                                                            ^
                                                            |
                                                            | Extends
                                                            |
                                                +----------------------+
                                                |                      |
                                                |   Grand Child class  |
                                                |                      |
                                                +----------------------+
        */


        // Accessing properties of parent and grandParent through grandChild class
        Multi_Level_GrandChild_Class m1 = new Multi_Level_GrandChild_Class();
        m1.greeting();
        m1.MorningQuote();
        m1.reply();

        Multi_Level_Child_Class m2 = new  Multi_Level_Child_Class();
        m2.greeting();
        m2.NightGreeting();


    }



    void greeting(){
        System.out.println("Good Morning");
    }
}






class Multi_Level_Child_Class extends C_MultiLevelInheritance{
    void MorningQuote(){
        System.out.println("Time is precious, wast it wisely");
    }

    void NightGreeting(){
        System.out.println("Good night, sweet dreams");
    }
}





class Multi_Level_GrandChild_Class extends Multi_Level_Child_Class{
    void reply(){
        System.out.println("I am good, how are you");
    }
}
