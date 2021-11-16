package com.company;

public class BronzeMembers extends MembershipType{

//    public BronzeMembers(int points) {
//        if (points > 0 && points < 10) {
//            super.points = points;
//        }
//        else {
//            System.out.println("Bronze Members have points less 10");
//        }
//    }

    @Override
    public void showMembershipType() {
        System.out.println("Bronze Member");
    }
}
