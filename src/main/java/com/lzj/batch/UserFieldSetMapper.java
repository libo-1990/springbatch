package com.lzj.batch;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class UserFieldSetMapper implements FieldSetMapper<User> {

	@Override
	public User mapFieldSet(FieldSet fieldSet) throws BindException {
		// TODO Auto-generated method stub
		return new User(fieldSet.readString("ID"),
				fieldSet.readString("NAME"), 
				fieldSet.readString("AGE"));
	}

}
