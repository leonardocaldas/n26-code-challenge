package com.github.leonardocaldas.n26codechallenge.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class TransactionStatistics {
    private Double max = 0.0;
    private Double min = 0.0;
    private Double avg = 0.0;
    private Double sum = 0.0;
    private Long count = 0L;
}