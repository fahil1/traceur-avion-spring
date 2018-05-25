package io.iliass.traceuravion.recording;

import io.iliass.traceuravion.ResultOfQuery;
import io.iliass.traceuravion.antenna.Antenna;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.query.Criteria;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.*;
import static org.springframework.data.mongodb.core.aggregation.Fields.field;
import static org.springframework.data.mongodb.core.aggregation.Fields.from;
import static org.springframework.data.mongodb.core.query.Criteria.where;

import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.DateOperators;

import java.util.HashMap;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.group;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.newAggregation;

public class RecordingRepositoryImpl implements RecordingRepositoryCustom {
    private final MongoTemplate mongoTemplate;

    @Autowired
    public RecordingRepositoryImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public Long countAllTotalPositions() {
        Aggregation agg = newAggregation(
                group("id").sum("totalPositions").as("total"));
        Long total = 0L;
        AggregationResults<ResultOfQuery> results = mongoTemplate.aggregate(agg, Recording.class, ResultOfQuery.class);
        for(ResultOfQuery resultOfQuery : results.getMappedResults()) {
            total += resultOfQuery.total;
        }
        return total;
    }




}
