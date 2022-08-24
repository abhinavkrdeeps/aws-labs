package com.abhinav.aws.kinesis;

import com.amazonaws.services.kinesis.AmazonKinesis;
import com.amazonaws.services.kinesis.AmazonKinesisClientBuilder;

public class KinesisUtils {

    private AmazonKinesis getKinesisClient(){
        AmazonKinesisClientBuilder amazonKinesisClientBuilder = AmazonKinesisClientBuilder.standard();
        
        return amazonKinesisClientBuilder.build();
    }

    public static void main(String[] args) {

    }
}
