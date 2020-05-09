package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private InformationService informationService;
    private PurchaseService purchaseService;
    private StockIndicator stockIndicator;

    public ProductOrderService(InformationService informationService, PurchaseService purchaseService, StockIndicator stockIndicator) {
        this.informationService = informationService;
        this.purchaseService = purchaseService;
        this.stockIndicator = stockIndicator;
    }

    public PurchaseSummary process(final PurchaseRequest purchaseRequest) {
        boolean isPurchased = purchaseService.purchase(purchaseRequest.getBuyer(), purchaseRequest.getProducts());

        if(isPurchased) {
            informationService.inform(purchaseRequest.getBuyer(), purchaseRequest.getProducts());
            stockIndicator.createPurchase(purchaseRequest.getBuyer(), purchaseRequest.getProducts());
            return new PurchaseSummary(purchaseRequest.getBuyer(), true);
        } else {
            return new PurchaseSummary(purchaseRequest.getBuyer(), false);
        }
    }

    public static void main(String[] args) {
        Buyer buyer1 = new Buyer("ben", "Ben", "Con", "bencon@gmail.com");
        Buyer buyer2 = new Buyer("jen", "Jen", "Hon", "jenhon@gmail.com");

        Product product1 = new Product("Baking tray", 1245);
        Product product2 = new Product("Desk", 7869);

        PurchaseService purchaseServiceImpl = new PurchaseServiceImpl();
        InformationService emailService = new EmailService();
        StockIndicator purchaseRepository = new PurchaseRepository();

        ProductOrderService service = new ProductOrderService(emailService, purchaseServiceImpl, purchaseRepository);
        PurchaseRequest purchase1 = new PurchaseRequest();
        purchase1.setBuyer(buyer1);
        purchase1.add(product1, 5);
        service.process(purchase1);
        System.out.println(purchase1);

        PurchaseRequest purchase2 = new PurchaseRequest();
        purchase2.setBuyer(buyer2);
        purchase2.add(product2, 3);
        service.process(purchase2);
        System.out.println(purchase2);
        }
}
