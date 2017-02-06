package com.fyn.service.task;

import org.apache.log4j.Logger;

public class Schedule {

	private static Logger log = Logger.getLogger(Schedule.class);

	/**
	 * 服务启动时执行
	 */

	public void runBySeverStart() {
		log.info("--------------Start：runByServerStart()---------------");
		log.info("--------------End  ：runByServerStart()---------------");
	}

	/**
	 * 每小时执行一次
	 */
	public void runByHour() {
		log.info("--------------Start：runByHour()-----------------");
		log.info("--------------End  ：runByHour()-----------------");
	}

	/**
	 * 每两分钟执行一次
	 */

	public void runByTwoMinute() {
		log.info("--------------Start：runByTwoMinute()---------------");
		log.info("--------------End  ：runByTwoMinute()---------------");
	}

	/**
	 * 每晚凌晨00：30分执行一次
	 */

	public void runByMidnight() {
		log.info("--------------Start：runByMidnight()---------------");
		log.info("--------------End  ：runByMidnight()---------------");
	}

}

