package com.te.lms.customsequencegenerator;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

public class CustomSequenceGeneratorMentor extends SequenceStyleGenerator{

	private static Integer count = 1;

	private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("MMyy");

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		String prefix = "TYP" + LocalDate.now().format(FORMATTER);
		String format = String.format("%02d", count++);
		return prefix + format;
	}
}
