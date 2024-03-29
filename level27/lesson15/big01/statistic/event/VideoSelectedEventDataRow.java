package com.javarush.test.level27.lesson15.big01.statistic.event;

/**
 * Created by strel on 14/10/2016.
 */
import com.javarush.test.level27.lesson15.big01.ad.Advertisement;

import java.util.Date;
import java.util.List;

/**
 * Created by
 * Polurival on 08.03.2016.
 */
public class VideoSelectedEventDataRow implements EventDataRow
{
    private List<Advertisement> optimalVideoSet;
    private long amount;
    private int totalDuration;
    private Date currentDate;

    public VideoSelectedEventDataRow(List<Advertisement> optimalVideoSet, long amount, int totalDuration)
    {
        this.optimalVideoSet = optimalVideoSet;
        this.amount = amount;
        this.totalDuration = totalDuration;
        currentDate = new Date();
    }

    @Override
    public EventType getType()
    {
        return EventType.SELECTED_VIDEOS;
    }

    @Override
    public Date getDate()
    {
        return currentDate;
    }

    @Override
    public int getTime()
    {
        return totalDuration;
    }

    public long getAmount()
    {
        return amount;
    }
}