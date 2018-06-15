package com.skrymir.microservices.currencyexchangeserver;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.math.BigDecimal;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@RequiredArgsConstructor
public class ExchangeValue {

    @Id
    @NonNull private Long id;

    @Column(name="currency_from")
    @NonNull private String from;
    @Column(name="currency_to")
    @NonNull private String to;
    @NonNull private BigDecimal conversionMultiple;
    @Transient
    @Setter
    private int port;
}
