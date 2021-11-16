package com.company;

public class Client {
    private String firstName;
    private String lastName;
    private MembershipType membershipType;
    private int points = 0;
    private Trade trade;

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void makeTrade (Trade trade) {
        if (points == 0) {
            membershipType = new BronzeMembers();
        }
        else if (points > 10 && points < 19) {
            membershipType = new SilverMembers();
        }
        else if (points == 20) {
            membershipType = new GoldMembers();
        }
        points += 1;
    }
}
