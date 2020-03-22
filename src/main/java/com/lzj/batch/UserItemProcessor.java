package com.lzj.batch;

import org.springframework.batch.item.ItemProcessor;

public class UserItemProcessor implements ItemProcessor<User, User> {

	@Override
	public User process(User item) throws Exception {
		if (Integer.parseInt(item.getAge()) % 2 == 0) {
			return item;
		}
		return null;
	}

}
