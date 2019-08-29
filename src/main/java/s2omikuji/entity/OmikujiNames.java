package s2omikuji.entity;

import java.sql.Date;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Omikuji}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2019/08/20 19:02:26")
public class OmikujiNames {

    /**
     * omikujiIdのプロパティ名を返します。
     * 
     * @return omikujiIdのプロパティ名
     */
    public static PropertyName<Integer> omikujiId() {
        return new PropertyName<Integer>("omikujiId");
    }

    /**
     * unseiIdのプロパティ名を返します。
     * 
     * @return unseiIdのプロパティ名
     */
    public static PropertyName<Integer> unseiId() {
        return new PropertyName<Integer>("unseiId");
    }

    /**
     * negaigotoのプロパティ名を返します。
     * 
     * @return negaigotoのプロパティ名
     */
    public static PropertyName<String> negaigoto() {
        return new PropertyName<String>("negaigoto");
    }

    /**
     * akinaiのプロパティ名を返します。
     * 
     * @return akinaiのプロパティ名
     */
    public static PropertyName<String> akinai() {
        return new PropertyName<String>("akinai");
    }

    /**
     * gakumonのプロパティ名を返します。
     * 
     * @return gakumonのプロパティ名
     */
    public static PropertyName<String> gakumon() {
        return new PropertyName<String>("gakumon");
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
     * changerのプロパティ名を返します。
     * 
     * @return changerのプロパティ名
     */
    public static PropertyName<String> changer() {
        return new PropertyName<String>("changer");
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
     * createrのプロパティ名を返します。
     * 
     * @return createrのプロパティ名
     */
    public static PropertyName<String> creater() {
        return new PropertyName<String>("creater");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _OmikujiNames extends PropertyName<Omikuji> {

        /**
         * インスタンスを構築します。
         */
        public _OmikujiNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _OmikujiNames(final String name) {
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
        public _OmikujiNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * omikujiIdのプロパティ名を返します。
         *
         * @return omikujiIdのプロパティ名
         */
        public PropertyName<Integer> omikujiId() {
            return new PropertyName<Integer>(this, "omikujiId");
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
         * negaigotoのプロパティ名を返します。
         *
         * @return negaigotoのプロパティ名
         */
        public PropertyName<String> negaigoto() {
            return new PropertyName<String>(this, "negaigoto");
        }

        /**
         * akinaiのプロパティ名を返します。
         *
         * @return akinaiのプロパティ名
         */
        public PropertyName<String> akinai() {
            return new PropertyName<String>(this, "akinai");
        }

        /**
         * gakumonのプロパティ名を返します。
         *
         * @return gakumonのプロパティ名
         */
        public PropertyName<String> gakumon() {
            return new PropertyName<String>(this, "gakumon");
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
         * changerのプロパティ名を返します。
         *
         * @return changerのプロパティ名
         */
        public PropertyName<String> changer() {
            return new PropertyName<String>(this, "changer");
        }

        /**
         * createdayのプロパティ名を返します。
         *
         * @return createdayのプロパティ名
         */
        public PropertyName<Date> createday() {
            return new PropertyName<Date>(this, "createday");
        }

        /**
         * createrのプロパティ名を返します。
         *
         * @return createrのプロパティ名
         */
        public PropertyName<String> creater() {
            return new PropertyName<String>(this, "creater");
        }
    }
}