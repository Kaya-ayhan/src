package day31CustomSlassConstructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {



        Offer myOffer1= new Offer();
        myOffer1.setInfo("Virgina","mudur","Aydin",125000,true,true,false,true);

        Offer myOffer2= new Offer();
        myOffer2.setInfo("Washington","Amazon Inc.","SDET", 110000,true,true,true,true);

        Offer myOffer3= new Offer();
        myOffer3.setInfo("Newyork","Apple", "Developer", 123000, true,false,true,false);

        Offer myOffer4= new Offer();
        myOffer4.setInfo("Newyork","Pixel","CEO",200000,true,true,true,true);

        Offer myOffer5= new Offer();
        myOffer5.setInfo("Virgina", "Cydeo", "BA",130000, true,false,true,true);

       Offer[] myOffers={myOffer1,myOffer2,myOffer3,myOffer4,myOffer5};

        ArrayList<Offer> fullTimeOffers= new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p-> !p.isFullTime);  // remove not fulltime offers
        System.out.println(fullTimeOffers.size());
        System.out.println(fullTimeOffers);

        ArrayList<Offer> localFirst= new ArrayList<>(Arrays.asList(myOffers));
        localFirst.removeIf(p->!p.location.equals("Virgina"));
        System.out.println(localFirst.size());
        System.out.println(localFirst);

       ArrayList<Offer> offersWithBenefits= new ArrayList<>(Arrays.asList(myOffers));






    }
}
