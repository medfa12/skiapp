package org.example.skiapp.services.impl;

import org.example.skiapp.entities.Subscription;
import org.example.skiapp.repositories.SubscriptionRepository;
import org.example.skiapp.services.ISubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubscriptionServiceImpl implements ISubscriptionService {

    private final SubscriptionRepository subscriptionRepository;

    @Autowired
    public SubscriptionServiceImpl(SubscriptionRepository subscriptionRepository) {
        this.subscriptionRepository = subscriptionRepository;
    }

    @Override
    public List<Subscription> retrieveAllSubscriptions() {
        return subscriptionRepository.findAll();
    }

    @Override
    public Subscription addOrUpdateSubscription(Subscription subscription) {
        return subscriptionRepository.save(subscription);
    }

    @Override
    public void removeSubscription(Subscription subscription) {
        subscriptionRepository.delete(subscription);
    }

    @Override
    public Subscription retrieveSubscription(Long numSub) {
        Optional<Subscription> subscription = subscriptionRepository.findById(numSub);
        return subscription.orElse(null);
    }
}