//package com.kodilla.good.patterns.solid;
//
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//
//public class SingleResponsibilityPrinciple {
//    public static void main(String[] args) {
//        RentRequestRetriever rentRequestRetriever = new RentRequestRetriever();
//        RentRequest rentRequest = rentRequestRetriever.retrieve();
//
//        RentalProcessor rentalProcessor = new RentalProcessor(
//                new MailService(), new CarRentalService(), new CarRentalRepository());
//        rentalProcessor.process(rentRequest);
//    }
//}
