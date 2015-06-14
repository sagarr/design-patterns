package com.rohankar.builder.sql;

import static java.lang.String.format;

public class SqlBuilder {

	private String select;
	private String from;
	private String where;

	private SqlBuilder(Builder builder) {
		select = builder.select;
		from = builder.from;
		where = builder.where;
	}

	public String query() {
		return format("select %s from %s where %s;", select, from, where);
	}

	public static class Builder {
		private String select;
		private String from;
		private String where;

		public Builder select(String select) {
			this.select = select;
			return this;
		}

		public Builder from(String from) {
			this.from = from;
			return this;
		}

		public Builder where(String where) {
			this.where = where;
			return this;
		}

		public SqlBuilder build() {
			return new SqlBuilder(this);
		}

	}

}
