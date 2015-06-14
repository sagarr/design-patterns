package com.rohankar.builder.sql;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SqlBuilderTest {

	@Test
	public void testSql() {
		SqlBuilder sqlBuilder = new SqlBuilder.Builder() //
				.select("col1, col2") //
				.from("table") //
				.where("col1 = 1").build();

		assertEquals(sqlBuilder.query(),
				"select col1, col2 from table where col1 = 1;");
	}

}
