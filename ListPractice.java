import java.util.ArrayList;

// ListPractice.java
//Ilene Ramirez
// 8/29/23

//Class coding for ArrayList

public class ListPractice {
    public static void main(String[] args) {
        System.out.println("\n\n Array List Practice\n\n");

        ArrayList<String> myFriendsList = new ArrayList<>();
        // Add five friends to my list
        myFriendsList. add("Chris");
        myFriendsList. add("Claudio");
        myFriendsList. add("Esmeralda");
        myFriendsList. add("Felipe");
        myFriendsList. add("Ariana");

        System.out.println("\n My first friend is " + myFriendsList.get(4));

        System.out.println("\n The size (number of elements) " + myFriendsList.size());

        // Set change the data in an element
        myFriendsList.set(0,"Ilene");
        System.out.println("\n My first friend is now " + myFriendsList.get(0));

        // Remove the third element
        myFriendsList.remove(2);

        // Output the list without a for loop
        System.out.println(myFriendsList);

        int myFriendNumber = 1;

        // Output the list with a for loop
        for (String s: myFriendsList) {
            System.out.println(" Friend " + myFriendNumber + " is " + myFriendsList.get());
        myFriendNumber++;
        }

        // Add list elements with a for loop
        for (int i = 0; i < 10; i++) {
            // use. add ()
            myFriendsList.add(i+4, "new friend");
            System.out.println(" New friend added to list");
        }
        // Output the list without a for loop
        System.out.println(myFriendsList);

        // Output the list with a for loop
        for (int i = 0; i < myFriendsList.size(); i++) {
            System.out.println(" Friend " + myFriendNumber + " is " + myFriendsList.get(i));
            myFriendNumber++;
        }


    }

    }