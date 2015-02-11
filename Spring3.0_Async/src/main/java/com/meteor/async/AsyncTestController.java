package com.meteor.async;

import org.apache.commons.collections.ListUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.meteor.async.module.BookGetter;

@Controller
public class AsyncTestController {

	@Autowired
	BookGetter booGetter;
	/**
	 * 동기 수행을 위하여
	 * booGetter.setBulkList_Sync() 호출
	 * @return
	 */
	@RequestMapping(value="insert_sync", method=RequestMethod.GET)
	public String insert_sync(){
		
		
		booGetter.setBulkList_Sync( ListUtils.EMPTY_LIST );
		
		System.out.println( "동기 작업 끝" );
		
		return "redirect:/";
	}
	/**
	 * 비동기 수행을 위하여
	 * booGetter.setBulkList_Async() 호출
	 * @return
	 */
	@RequestMapping(value="insert_async", method=RequestMethod.GET)
	public String insert_async(){
		
		booGetter.setBulkList_Async( ListUtils.EMPTY_LIST );
		
		System.out.println( "비동기 작업 끝" );
		
		return "redirect:/";
	}
	
	
	
}
