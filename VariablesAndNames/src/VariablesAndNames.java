public class VariablesAndNames
{
    public static void main( String[] args )
    {
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;

        cars = 100;
        space_in_a_car = 4.0;
        drivers = 30;
        passengers = 90;
        cars_not_driven = cars - drivers;
        cars_driven = drivers;
        carpool_capacity = cars_driven * space_in_a_car;
        average_passengers_per_car = passengers / cars_driven;

        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );

        int a = 113;
        double b = 2.71828;
        String ComputerScience = "Computer Science";
        System.out.println(a);
        System.out.println(b);
        System.out.println(ComputerScience);

        String Border1 = "+-----------------------------------------------------------+";
        String English = "| 1 |               English 11 |      Mr.Tryssenaar         |";
        String Precalculus = "| 2 |           Precalculus 11 |      Mr.Tam                |";
        String Band = "| 3 |                  Band 11 |      Mr.Robertson          |";
        String Physics = "| 4 |               Physics 11 |      Mr.Jung               |";
        String Chemistry = "| 5 |             Chemistry 11 |      Ms.Ogden              |";
        String Geography = "| 6 |             Geography 12 |      Ms.Clutchey           |";
        String Programming = "| 7 |           Programming 11 |      Mr.Zaremba            |";
        String Mandarin = "| 8 |              Mandarin 12 |      Ms.Chang              |";
        String Border2 = "+-----------------------------------------------------------+";

        System.out.println(Border1);
        System.out.println(English);
        System.out.println(Precalculus);
        System.out.println(Band);
        System.out.println(Physics);
        System.out.println(Chemistry);
        System.out.println(Geography);
        System.out.println(Programming);
        System.out.println(Mandarin);
        System.out.println(Border2);




    }
}


