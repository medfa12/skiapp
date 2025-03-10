package org.example.skiapp.services;

import org.example.skiapp.entities.Subscription;
import java.util.List;

public interface ISubscriptionService {
    List<Subscription> retrieveAllSubscriptions();
    Subscription addOrUpdateSubscription(Subscription subscription);
    void removeSubscription(Subscription subscription);
    Subscription retrieveSubscription(Long numSub);
}