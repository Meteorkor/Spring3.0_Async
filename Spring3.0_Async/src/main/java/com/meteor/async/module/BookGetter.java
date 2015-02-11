package com.meteor.async.module;

import java.util.List;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class BookGetter {
	
	/**
	 * 큰 데이터를 넣는 가상 작업
	 * @param bulk_list
	 */
	private void setBulkList( List bulk_list ){
		System.out.println("setBulk_List 시작");
		String tex = "";
		
		//for(int i=0; i<1000000;i++  ){
		for(int i=0; i<1000000;i++  ){
			System.out.println( i + "번째 작업중" );
			tex += i;
		
		}
		System.out.println("setBulk_List 끝");
	}

	/**
	 * 동기 수행
	 * @param bulk_list
	 */
	public void setBulkList_Sync(List bulk_list) {
		setBulkList(bulk_list);
	}

	/**
	 * 비 동기 수행
	 * @param bulk_list
	 */
	@Async
	public void setBulkList_Async(List bulk_list) {
		setBulkList(bulk_list);
	}
	
}
