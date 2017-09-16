package com.xianglesong.logs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogsApplication {
  private static final Logger logger = LoggerFactory.getLogger(LogsApplication.class);

  public static void main(String[] args) {
    System.out.println("begin.");
    logger.info("this is a test.");
    System.out.println("end.");
  }
}
