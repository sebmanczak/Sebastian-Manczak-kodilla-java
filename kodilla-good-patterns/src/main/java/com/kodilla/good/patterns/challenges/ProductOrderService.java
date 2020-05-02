//package com.kodilla.good.patterns.challenges;
//
//public class ProductOrderService {
//    private InformationService informationService;
//    private PurchaseService purchaseService;
//    private PurchaseRepository purchaseRepository;
//
//    public ProductOrderService(final InformationService informationService,
//                               final PurchaseService purchaseService,
//                               final PurchaseRepository purchaseRepository) {
//        this.informationService = informationService;
//        this.purchaseService = purchaseService;
//        this.purchaseRepository = purchaseRepository;
//    }
//
//    public PurchaseItem process(final PurchaseRequest purchaseRequest) {
//        boolean isPurchased = purchaseService.purchase(purchaseRequest.getUser(), purchaseRequest.getProduct(), purchaseRequest.getProductNumber());
//
//
//        if(isPurchased) {
//            informationService.inform(purchaseRequest.getUser());
//            purchaseRepository.createPurchase(purchaseRequest.getUser(), purchaseRequest.getProduct(), purchaseRequest.getProductNumber());
//            return new PurchaseItem(purchaseRequest.getUser(), true);
//        } else {
//            return new PurchaseItem(purchaseRequest.getUser(), false);
//        }
//    }
//
//    public static void main(String[] args) {
//        ProductOrderService productOrderService = new ProductOrderService();
//
//
//
//    }
//}
