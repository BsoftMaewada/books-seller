package com.bsoft.springbootbookseller.service;

import com.bsoft.springbootbookseller.model.PurchaseHistory;
import com.bsoft.springbootbookseller.repository.projection.IPurchaseItem;

import java.util.List;

public interface IPurchaseHistoryService {
    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findPurchasedItemsOfUser(Long userId);


}
