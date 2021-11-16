package com.company;

public class SilverMembers extends MembershipType{
//    public SilverMembers(int points) {
//        if (points > 10 && points < 19) {
//            super.points = points;
//        }
//        else {
//            System.out.println("Silver Members have points between 10 and 19");
//        }
//    }
    @Override
    public void showMembershipType() {
        System.out.println("Silver Member");
    }
}
