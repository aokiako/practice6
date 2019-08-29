package s2omikuji.entity;

import java.sql.Date;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Unsei}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2019/08/20 19:02:26")
public class UnseiNames {

    /**
     * unseiIdのプロパティ名を返します。
     * 
     * @return unseiIdのプロパティ名
     */
    public static PropertyName<Integer> unseiId() {
        return new PropertyName<Integer>("unseiId");
    }

    /**
     * unseiNameのプロパティ名を返します。
     * 
     * @return unseiNameのプロパティ名
     */
    public static PropertyName<String> unseiName() {
        return new PropertyName<String>("unseiName");
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
     * createdayのプロパティ名を返します。
     * 
     * @return createdayのプロパティ名
     */
    public static PropertyName<Date> createday() {
        return new PropertyName<Date>("createday");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _UnseiNames extends PropertyName<Unsei> {

        /**
         * インスタンスを構築します。
         */
        public _UnseiNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _UnseiNames(final String name) {
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
        public _UnseiNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * unseiIdのプロパティ名を返します。
         *
         * @return unseiIdのプロパティ名
         */
        public PropertyName<Integer> unseiId() {
            return new PropertyName<Integer>(this, "unseiId");
        }

        /**
         * unseiNameのプロパティ名を返します。
         *
         * @return unseiNameのプロパティ名
         */
        public PropertyName<String> unseiName() {
            return new PropertyName<String>(this, "unseiName");
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
         * createdayのプロパティ名を返します。
         *
         * @return createdayのプロパティ名
         */
        public PropertyName<Date> createday() {
            return new PropertyName<Date>(this, "createday");
        }
    }
}