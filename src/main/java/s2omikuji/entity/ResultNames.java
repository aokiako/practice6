package s2omikuji.entity;

import java.sql.Date;

import javax.annotation.Generated;

import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Result}のプロパティ名の集合です。
 * @author a_aoki
 */
@Generated(value = { "S2JDBC-Gen 2.4.46",
		"org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl" }, date = "2019/08/20 19:02:26")
public class ResultNames {

	/**
	 * fortuneDayのプロパティ名を返します。
	 *
	 * @return fortuneDayのプロパティ名
	 */
	public static PropertyName<Date> fortuneDay() {
		return new PropertyName<Date>("fortuneDay");
	}

	/**
	 * birthdayのプロパティ名を返します。
	 *
	 * @return birthdayのプロパティ名
	 */
	public static PropertyName<Date> birthday() {
		return new PropertyName<Date>("birthday");
	}

	/**
	 * changerのプロパティ名を返します。
	 *
	 * @return changerのプロパティ名
	 */
	public static PropertyName<String> changer() {
		return new PropertyName<String>("changer");
	}

	/**
	 * updateのプロパティ名を返します。
	 *
	 * @return updateのプロパティ名
	 */
	public static PropertyName<Date> update() {
		return new PropertyName<Date>("update");
	}

	/**
	 * createrのプロパティ名を返します。
	 *
	 * @return createrのプロパティ名
	 */
	public static PropertyName<String> creater() {
		return new PropertyName<String>("creater");
	}

	/**
	 * createDayのプロパティ名を返します。
	 *
	 * @return createDayのプロパティ名
	 */
	public static PropertyName<Date> createDay() {
		return new PropertyName<Date>("createDay");
	}

	/**
	 * omikujiIdのプロパティ名を返します。
	 *
	 * @return omikujiIdのプロパティ名
	 */
	public static PropertyName<Integer> omikujiId() {
		return new PropertyName<Integer>("omikujiId");
	}

	/**
	 * @author S2JDBC-Gen
	 */
	public static class _ResultNames extends PropertyName<Result> {

		/**
		 * インスタンスを構築します。
		 */
		public _ResultNames() {
		}

		/**
		 * インスタンスを構築します。
		 *
		 * @param name
		 *            名前
		 */
		public _ResultNames(final String name) {
			super(name);
		}

		/**
		 * インスタンスを構築します。
		 *
		 * @param parent
		 *            親
		 * @param name
		 *            名前
		 */
		public _ResultNames(final PropertyName<?> parent, final String name) {
			super(parent, name);
		}

		/**
		 * fortuneDayのプロパティ名を返します。
		 *
		 * @return fortuneDayのプロパティ名
		 */
		public PropertyName<Date> fortuneDay() {
			return new PropertyName<Date>(this, "fortuneDay");
		}

		/**
		 * birthdayのプロパティ名を返します。
		 *
		 * @return birthdayのプロパティ名
		 */
		public PropertyName<Date> birthday() {
			return new PropertyName<Date>(this, "birthday");
		}

		/**
		 * changerのプロパティ名を返します。
		 *
		 * @return changerのプロパティ名
		 */
		public PropertyName<String> changer() {
			return new PropertyName<String>(this, "changer");
		}

		/**
		 * updateのプロパティ名を返します。
		 *
		 * @return updateのプロパティ名
		 */
		public PropertyName<Date> update() {
			return new PropertyName<Date>(this, "update");
		}

		/**
		 * createrのプロパティ名を返します。
		 *
		 * @return createrのプロパティ名
		 */
		public PropertyName<String> creater() {
			return new PropertyName<String>(this, "creater");
		}

		/**
		 * createDayのプロパティ名を返します。
		 *
		 * @return createDayのプロパティ名
		 */
		public PropertyName<Date> createDay() {
			return new PropertyName<Date>(this, "createDay");
		}

		/**
		 * omikujiIdのプロパティ名を返します。
		 *
		 * @return omikujiIdのプロパティ名
		 */
		public PropertyName<Integer> omikujiId() {
			return new PropertyName<Integer>(this, "omikujiId");
		}
	}
}