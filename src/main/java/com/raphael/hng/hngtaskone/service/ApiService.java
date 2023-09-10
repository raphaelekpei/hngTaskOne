package com.raphael.hng.hngtaskone.service;

import com.raphael.hng.hngtaskone.dto.ApiResponse;

public interface ApiService {
    ApiResponse getInfo(String slackName, String track);
}
