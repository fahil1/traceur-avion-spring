package io.iliass.traceuravion.antenna;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.group;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.newAggregation;

import io.iliass.traceuravion.ResultOfQuery;
import org.springframework.data.mongodb.core.aggregation.Aggregation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;


public class AntennaRepositoryImpl implements AntennaRepositoryCustom {
    private final MongoTemplate mongoTemplate;

    @Autowired
    public AntennaRepositoryImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public Long countAllPOIsList() {
        Aggregation agg = newAggregation(
                group("id").sum("totalPois").as("total"));
        Long total = 0L;
        AggregationResults<ResultOfQuery> results = mongoTemplate.aggregate(agg, Antenna.class, ResultOfQuery.class);
        for(ResultOfQuery resultOfQuery : results.getMappedResults()) {
            total += resultOfQuery.total;
        }
        return total;
    }
}
