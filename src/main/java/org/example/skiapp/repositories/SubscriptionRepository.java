package org.example.skiapp.repositories;

import org.example.skiapp.entities.Subscription;
import org.example.skiapp.enums.TypeSubscription;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {

    // Find subscriptions by the skier’s numSkier.
    List<Subscription> findBySkier_NumSkier(Long numSkier);

    // Find subscriptions by subscription type.
    List<Subscription> findByTypeSub(TypeSubscription typeSub);

    // Find subscriptions within a date range.
    List<Subscription> findByStartDateBetween(Date start, Date end);

    // Find subscriptions by price less than a certain threshold.
    List<Subscription> findByPriceLessThan(Float price);
}