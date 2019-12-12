package com.wwt.paperservice.model;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface PaperRepository extends MongoRepository<Paper, String> {

    Page<Paper> findByTitleLike(String key, Pageable pageable);

    Page<Paper> findByAuthorsLike(String[] key, Pageable pageable);

    Page<Paper> findByKeywordsLike(String[] keyword, Pageable pageable);

    Page<Paper> findBySummaryLike(String key, Pageable pageable);

    int countByTitleLike(String key);

    int countByKeywordsLike(String key);

    int countBySummaryLike(String key);

    int countByAuthorsLike(String key);



}
