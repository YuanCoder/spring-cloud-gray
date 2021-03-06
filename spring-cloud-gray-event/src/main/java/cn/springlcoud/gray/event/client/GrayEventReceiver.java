package cn.springlcoud.gray.event.client;

import cn.springlcoud.gray.event.GrayEventRetrieveResult;

/**
 * @author saleson
 * @date 2020-01-30 12:46
 */
public interface GrayEventReceiver {


    void start();


    void shutdown();


    GrayEventPublisher getGrayEventPublisher();


    void receiveRetrieveResult(GrayEventRetrieveResult retrieveResult);


    void setLocationNewestSortMark(Long sortMark);


    long getLocationNewestSortMark();
}
