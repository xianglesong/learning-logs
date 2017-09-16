package com.xianglesong.logs.logback;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.Layout;
import ch.qos.logback.core.UnsynchronizedAppenderBase;

public class TestAppender extends UnsynchronizedAppenderBase<ILoggingEvent> {

    private String host;
    private String port;

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    // keep this for config compatibility for now
    JSONEventLayout jsonlayout;

    Layout<ILoggingEvent> layout;

    public TestAppender() {
        jsonlayout = new JSONEventLayout();
    }

    @Override
    protected void append(ILoggingEvent eventObject) {
        String json = layout == null ? jsonlayout.doLayout(eventObject) : layout.doLayout(eventObject);
        System.out.println("json: " + json);

        // get
    }

    @Override
    public void start() {
        super.start();
        System.out.println("start.");
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("stop:.");
    }

    public JSONEventLayout getJsonlayout() {
        return jsonlayout;
    }

    public void setJsonlayout(JSONEventLayout jsonlayout) {
        this.jsonlayout = jsonlayout;
    }

    public Layout<ILoggingEvent> getLayout() {
        return layout;
    }

    public void setLayout(Layout<ILoggingEvent> layout) {
        this.layout = layout;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void addAdditionalField(AdditionalField p) {
        jsonlayout.addAdditionalField(p);
    }

}