package com.xianglesong.logs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class LogsApplication {
  private static final Logger logger = LoggerFactory.getLogger(LogsApplication.class);

  public static void main(String[] args) {
    System.out.println("begin.");
    // simple
    logger.info("this is a test.");

    // mdc test, example: uid
    MDC.put("path1", "path1-test");
    MDC.put("mdcvar2", "test2");
    MDC.put("uid", "uid1-test");
    logger.info("mdc-test uid-test");

    System.out.println("end.");
  }
}
