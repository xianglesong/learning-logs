package com.xianglesong.logs.appender;

import ch.qos.logback.classic.spi.LoggingEvent;
import ch.qos.logback.core.UnsynchronizedAppenderBase;

public class MyAppender extends UnsynchronizedAppenderBase<LoggingEvent> {

  @Override
  protected void append(LoggingEvent eventObject) {
    // 自定义日志
    System.out.println("myAppender 1: " + eventObject.getMessage() + eventObject.getLevel()
        + eventObject.getFormattedMessage() + eventObject.getLoggerName()
        + eventObject.getTimeStamp());
    // System.out.println("myApperder 2: " + eventObject.getCallerData());
    StackTraceElement[] callerDataArray = eventObject.getCallerData();
    System.out.println("myApperder 2: " + eventObject.getCallerData());
    int index = 0;
    if (callerDataArray != null && callerDataArray.length > 0) {
      System.out.println("class: " + callerDataArray[index].getClassName());
      System.out.println("method: " + callerDataArray[index].getMethodName());
      System.out.println("file: " + callerDataArray[index].getFileName());
      System.out.println("line: " + callerDataArray[index].getLineNumber());
      System.out.println();
    }

  }

}
