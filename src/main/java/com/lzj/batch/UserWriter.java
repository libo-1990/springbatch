package com.lzj.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class UserWriter implements ItemWriter<User> {

	@Override
	public void write(List<? extends User> items) throws Exception {
		for(User user : items){
			System.out.println(user);
		}
	}

}
