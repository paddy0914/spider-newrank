package io.spider.newrank;

import io.spider.newrank.task.WeixinParseTask;

public class Main {
    public static void main(String[] args) {
        WeixinParseTask task = new WeixinParseTask();
        task.setEnd("2017-04-28");
        task.setRankName("时事");
        task.setRankNameGroup("资讯");
        task.setStart("2017-04-28");
        task.setParam();

        task.run();
    }
}
