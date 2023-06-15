package org.example.utils;

import org.example.model.ScheduleItem;
import org.example.model.Task;

import java.util.List;

public class ShowUtilInfos {
    public static void showScheduleItens(List<? extends ScheduleItem> scheduleItems){
        for(ScheduleItem scheduleItem : scheduleItems){
            System.out.println(scheduleItem.getItemId());
            System.out.println(scheduleItem.getItemName());
        }
    }
}
